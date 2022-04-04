package Service;

import java.util.ArrayList;

import Model.Buyer;
import Model.CabUser;
import Model.DriverDetails;
import Model.Location;
import Model.Seller;
import Repository.DriverRepository;
import Repository.UserRepository;

public class UserService {

    //add buyer, CRUD -- diff service
    //add seller
    //add item
	UserRepository ur;
	DriverRepository dr;
	ArrayList<DriverDetails> drivers;
	public UserService(){
		ur=new UserRepository();
		dr=new DriverRepository();
		drivers=new ArrayList<>();
	}
	
	public void addCabUser(CabUser user) {
		ur.addCabUser(user);
	}
	
	public void updateLocation(String username,Location l) {
		ur.updateLocation(username, l);
	}

	public void updateContact(String username,String phone) {
		ur.updateContact(username, phone);
	}
	

	public ArrayList<DriverDetails> findRide(String username, Location location, Location location2) {
		
		drivers=dr.getDrivers(location);
		//set username source and destination
		if(drivers.size()==0) {
			System.out.println("No ride found");
			return null;
		}
		ur.updateRide(username,location,location2);
		return drivers;
		// TODO Auto-generated method stub
		
		
	}

	public void chooseDriver(String username, String driver) {
		
		for(int i=0;i<drivers.size();i++) {
			if(drivers.get(i).getName().equals(driver)) {
				drivers.set(i, drivers.get(i).updateStatus(false));
				CabUser u=ur.getUser(username);
				dr.updateDriver(driver,u);
				
				//update location
				dr.updateLocation(driver, u.getDestination());
				ur.updateLocation(u.getName(),u.getDestination());
				System.out.println("Ride started");
				return;
			}
		}
		
	}

	public void calculateBill(String username) {
		// TODO Auto-generated method stub
		
		 System.out.println("ride Ended bill amount $ "+ur.getBill(username));
	}

 

}

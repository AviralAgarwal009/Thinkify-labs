package Repository;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import Model.CabUser;
import Model.DriverDetails;
import Model.Location;

public class DriverRepository {
		static List<DriverDetails> driver;
	    static Hashtable<String, Integer> index;
	    
	    public DriverRepository() {
	    	driver=new ArrayList<>();
	    	index=new Hashtable<>();
		}

		public void createDriver(DriverDetails user) {
			// TODO Auto-generated method stub
			index.put(user.getName(), driver.size());
			driver.add(user);
			
		}
		
		
		public void updateLocation(String username,Location l) {
			int i=index.get(username);
			driver.set(i, driver.get(i).updateLocation(l));
		}
		
		public void updateStatus(String username,boolean status) {
			int i=index.get(username);
			driver.set(i, driver.get(i).updateStatus(status));
		}

		public ArrayList<DriverDetails> getDrivers(Location location) {
			// TODO Auto-generated method stub
			ArrayList<DriverDetails> d=new ArrayList<>();
			for(int i=0;i<driver.size();i++) {
				Location l=driver.get(i).getLoc();
				
				float distance=l.getDistance(location);
				if(distance<=5&&driver.get(i).isStatus()) {
					d.add(driver.get(i));
				}
			}
			
			return d;
		}

		public void updateDriver(String username, CabUser u) {
			// TODO Auto-generated method stub
			int i=index.get(username);
			driver.set(i, driver.get(i).updateBill(u.getSource().getDistance(u.getDestination())));
			
		}

		public void findTotalEarning() {
			// TODO Auto-generated method stub
			for(int i=0;i<driver.size();i++) {
				System.out.println(driver.get(i).getName()+" earns $"+driver.get(i).getBill());
			}
			
		}
		
		
		
		
}

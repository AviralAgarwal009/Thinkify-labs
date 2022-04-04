package Repository;

import Model.Buyer;
import Model.CabUser;
import Model.Location;
import Model.Seller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class UserRepository {
    static List<CabUser> cabUser;
    static Hashtable<String, Integer> index;
    
    public UserRepository() {
		// TODO Auto-generated constructor stub
    	cabUser=new ArrayList<>();
    	index=new Hashtable<>();
	}

	public void addCabUser(CabUser user) {
		// TODO Auto-generated method stub
		index.put(user.getName(), cabUser.size());
		cabUser.add(user);
		
	}
	
	/**
	 * @param username
	 * @param l
	 */
	public void updateLocation(String username,Location l) {
		int i=index.get(username);
		cabUser.set(i, cabUser.get(i).updateLocation(l));
	}
	
	public void updateContact(String username,String phone) {
		int i=index.get(username);
		cabUser.set(i, cabUser.get(i).updateContact(phone));
		System.out.println(cabUser.get(i));
	}

	public void updateRide(String username, Location location, Location location2) {
		// TODO Auto-generated method stub
		int i=index.get(username);
		cabUser.set(i, cabUser.get(i).updateRide(location,location2));
		
	}

	public CabUser getUser(String username) {
		// TODO Auto-generated method stub
		int i=index.get(username);
		return cabUser.get(i);
	}

	public float getBill(String username) {
		// TODO Auto-generated method stub
		int i=index.get(username);
		CabUser c=cabUser.get(i);
	
		return cabUser.get(i).getSource().getDistance(cabUser.get(i).getDestination());
	
	}
}

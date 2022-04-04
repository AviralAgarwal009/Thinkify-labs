package Service;

import Model.DriverDetails;
import Model.Location;
import Repository.DriverRepository;

public class DriverService {
	
	DriverRepository dr;
	public DriverService() {
		dr=new DriverRepository();
	}
	
	public void createDriver(DriverDetails d) {
		dr.createDriver(d);
	}
	
	public void updateLocation(String username,Location loc) {
		dr.updateLocation(username, loc);
	}
	
	public void updateStatus(String username,boolean status) {
		dr.updateStatus(username, status);
	}

	public void findTotalEarning() {
		// TODO Auto-generated method stub
		dr.findTotalEarning();
		
	}
	
	
}

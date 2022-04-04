package Model;

public class DriverDetails {
	
	private String name;
	private char sex;
	private int age;
	private String carnum;
	private Location loc;
	private boolean status;
	private float bill;
	
	
	
	public DriverDetails(String name, char sex, int age, String carnum, Location loc) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.carnum = carnum;
		this.loc = loc;
		this.bill=0;
		this.status=true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public DriverDetails updateLocation(Location l) {
		// TODO Auto-generated method stub
		loc=l;
		return this;
	}
	public DriverDetails updateStatus(boolean status2) {
		// TODO Auto-generated method stub
		
		status=status2;
		return this;
	}
	@Override
	public String toString() {
		return "DriverDetails [name=" + name + ", sex=" + sex + ", age=" + age + ", carnum=" + carnum + ", loc=" + loc
				+ ", status=" + status + ", getName()=" + getName() + ", getSex()=" + getSex() + ", getAge()="
				+ getAge() + ", getCarnum()=" + getCarnum() + ", getLoc()=" + getLoc() + ", isStatus()=" + isStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	public DriverDetails updateBill(float distance) {
		// TODO Auto-generated method stub
		bill+=distance;
		return this;
	}
	
	
	
	

}

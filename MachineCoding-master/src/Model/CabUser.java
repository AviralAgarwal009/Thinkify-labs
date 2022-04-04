package Model;

public class CabUser {
	
	private String name;
	private char sex;
	private int age;
	private String phone;
	private Location loc;
	private Location source;
	private Location destination;
	
	
	public CabUser(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public CabUser(String name, char sex, int age, String phone, Location loc) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.loc = loc;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public CabUser updateLocation(Location l) {
		// TODO Auto-generated method stub
		loc=l;
		return this;
	}

	public CabUser updateContact(String phone2) {
		// TODO Auto-generated method stub
		phone=phone2;
		return this;
	}
	
	

	public Location getSource() {
		return source;
	}

	public void setSource(Location source) {
		this.source = source;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "CabUser [name=" + name + ", sex=" + sex + ", age=" + age + ", phone=" + phone + ", loc=" + loc
				+ ", getName()=" + getName() + ", getSex()=" + getSex() + ", getAge()=" + getAge() + ", getPhone()="
				+ getPhone() + ", getLoc()=" + getLoc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public CabUser updateRide(Location location, Location location2) {
		// TODO Auto-generated method stub
		source=location;
		destination=location2;
		return this;
	}
	
	
	
	
	

}

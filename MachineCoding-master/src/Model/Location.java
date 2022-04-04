package Model;

public class Location {
	
	private int x;
	private int y;
	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public float getDistance(Location location) {
		// TODO Auto-generated method stub
		float dist=0;
		int x2=location.getX();
		int y2=location.getY();
		float xd=(float) Math.pow(x2-x, 2);
		float yd=(float) Math.pow(y2-y, 2);
	
		int total=(int) (xd+yd);
		dist=(float) Math.sqrt(total);
		return (float) Math.ceil(dist);
	}
	
	

}

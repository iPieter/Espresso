package espresso;

public class Location {
	private String adress;
	private String building;
	
	public Location(String adress, String building) {
		this.adress = adress;
		this.building = building;
	}
	
	public Location(String building) {
		this.building = building;
		this.adress = "Narnia";
	}
	
	public String toString() {
		return this.building;
	}
	
}

package espresso;

public class Time {
	private short day;
	private Month month;
	private int year;
	
	private short hour;
	private short minute;
	
	public Time() {
		this.day = 1;
		this.month = Month.JANUARY;
		this.year = 1970;
		this.hour = 0;
		this.minute = 0;
	}

	public Time(int year, Month month, short day, short hour, short minute) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
	}
	
	//gets
	String getYear() {
		return "" + this.year; //needs to be fixed
	}
	
	public static String get(short time) {
		if (time < 10) {
			return "0" + time;
		} 
		return "" + time;
	
	}
	
	public String toData() {
		return getYear() + this.month.toData() + get(this.day) + "T" + get(this.hour) + get(this.hour) + "00";
	}
	
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year + " " + this.hour + ":" + this.minute;
	}

}

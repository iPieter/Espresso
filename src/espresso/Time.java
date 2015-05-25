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
	
	//this is the fun one :-)
	public Time(int weekNumber, Day day, short hour, short minute ) {
		//a week number-week is supposed to start before thursday.
		//for example: jan 1st is a friday. week 1 will start on jan 4th.
		
		if (day.getOrder() >= Day.THURSDAY.getOrder()) {
			//week 1 start this week
		} else {
			//week 1 starts 'next' week. This is fun, isn't it?
		}
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

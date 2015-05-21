import java.io.IOException;
import java.io.PrintWriter;


public class Lesson {
	private Time startTime;
	private Location location;
	private int duration;
	private String name;
	private String course;
	public Lesson(String name, String course, Time startTime, int duration, Location location) {
		this.name = name;
		this.course = course;
		this.location = location;
		this.startTime = startTime;
		this.duration = duration;
	}
	
	public void toData(int id, PrintWriter pw) throws IOException {
		pw.print( "BEGIN:VEVENT" + 
				" UID:" + id + "@Espresso" + 
				" SUMMARY:" + this.name + 
				" DTSTART;TZID=Europe/Brussels:" + this.startTime.toData() +
				" DURATION:PT" + this.duration + "S" +
				" LOCATION:" + this.location +
				" END:VEVENT ");
	}
}

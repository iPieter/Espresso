package espresso;
import java.io.*;
import java.util.*;

public class Lessons {
	List<Lesson> lessonList;
	
	public Lessons() {
		lessonList = new ArrayList<Lesson>();
	}
	
	public void addLesson() {
		
	}
	
	public void toData(PrintWriter pw) throws IOException{
		pw.print("BEGIN:VCALENDAR PRODID:-//Espresso//CalDAV Client//EN VERSION:2.0 X-WR-CALNAME:Espresso College Calendar X-WR-CALDESC:Class and exam schedule created in Espresso. ");
		int counter = 0;
		for (Lesson lesson : lessonList) {
			lesson.toData(counter++, pw);			
		}
		pw.print("END:VCALENDAR");
	}
}

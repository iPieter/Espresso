package espresso;

public class Exam extends Lesson {

	public Exam( String course, Time startTime, int duration, Location location) {
		//the exam class is just like a normal lesson, except it calls itself a exam
		//instead of a user-defined name.
		//this can be useful for custom notifications and stuff. Whatever, I wanted anohter class.
		
		super("Exam", course, startTime, duration, location);
		
	}

}

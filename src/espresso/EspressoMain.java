package espresso;
import java.io.*;
import java.util.Scanner;

import javax.imageio.IIOException;


public class EspressoMain {
	static Scanner sc = new Scanner(System.in);
	static Lessons ls = new Lessons();
	
	public static void printMenu() {
		System.out.println("Main menu" + System.getProperty("line.separator"));
		System.out.println("\t  1. Add single lesson");
		System.out.println("\t  2. Add lessons");
		
		System.out.println("\t  3. Export lessons");
		
		System.out.println("\t 0. Stop");
		System.out.println();
		System.out.print("Choise: ");
	}
	
	
	public static int inputInt() {
		int i = 0;
		try {
			i = Integer.parseInt(sc.nextLine());
		} catch( NumberFormatException nsEx ) {
			System.out.println("Type a valid code:");
			i = inputInt();
		}
		return i;

	}
	
	public static void waitUntilKeypressed() {
		System.out.print("Press <enter> to continue: ");
		sc.nextLine();
	}
	
	public static void clearScreen(){
		for (int i=0; i<100; i++) System.out.println();
	}
	
	public static void addLesson() {
		
		Time tijd = new Time();
		Location location = new Location("J007");
		Lesson lesson = new Lesson("Hoorcollege", "Fysica", tijd, 5100, location);
	}
	
	public static void addLessonArray() {
		
	}
	
	public static void exportLessons() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("/Users/Pieter/Google Drive/espresso.ical"));
			ls.toData(pw);
			pw.close();
		} catch (IOException ex) {
			System.out.println("You ignorant fool");
		} 
	}
	
	public static void main(String[] args) {				
		int choise;
		do {
			clearScreen();
			printMenu();
			
			choise = inputInt();
			
			switch (choise){
				case 0: break;	
				case 1: addLesson(); break;
				case 2: addLessonArray(); break;
				case 3: exportLessons(); break;

				default: System.out.println("Invalid choise!");waitUntilKeypressed();break;
			}
		} while (choise != 0);
		
	}
	

}

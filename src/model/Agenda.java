package model;

import java.io.*;
import java.util.ArrayList;

public class Agenda {

	public static final String ContactsDataBase = "./data/StudentsTest.csv";
	public static final String CoursesDataBase = "./data/TestCourses.txt";
	
	private ArrayList<Student> contacts;	
	private ArrayList<Course> courses;
	
	public Agenda() throws Exception{
		
		contacts = new ArrayList<Student>();
		courses = new ArrayList<Course>();
		readContactDatabase();
//		readCoursesDatabase();
	}
	
	private void readContactDatabase() throws Exception{
		
		FileReader reader = new FileReader(new File(ContactsDataBase));
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
			String[] data = line.split(",");
			
			Student contact = new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]);
			contacts.add(contact);
			
		}
		br.close();
		
		for(Student s : contacts) {
			System.out.println(s.toString());
		}
		
	}
	
	private void readCoursesDatabase() throws Exception{
		
		FileReader reader = new FileReader(new File(ContactsDataBase));
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
			
			
		}
		br.close();
		
	}
	
	public static void main (String[] args) throws Exception {
		Agenda agenda = new Agenda();
	}
	
}

package model;

import java.io.*;
import java.util.*;

public class Agenda {

	public static final String ContactsDataBase = "./data/StudentsTest.csv";
	public static final String CoursesDataBase = "./data/CoursesTest.csv";
	
	private List<Student> contacts;	
	private List<Course> courses;
	
	public Agenda() throws Exception{
		
		contacts = new ArrayList<Student>();
		courses = new ArrayList<Course>();
		readCoursesDatabase();
		readContactDatabase();
	}
	
	private void readContactDatabase() throws Exception{
		
		FileReader reader = new FileReader(new File(ContactsDataBase));
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
			String[] data = line.split(",");
			
			Student contact = new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]);
			contacts.add(contact);
			
			String[] regCourses = data[9].split("/");
			
			for(String nrc : regCourses) {
				
				for(Course course : courses) {
					
					if(course.getNRC() == Integer.parseInt(nrc)) {
						contact.addClass(course);
						course.addStudent(contact);
						break;
					}					
				}				
			}		
			for(Course cour : contact.getCourses()) {
				System.out.println(contact.getName());
				System.out.println(cour.getName());
			}
		}
		br.close();
		
		for(Student s : contacts) {
			System.out.println(s.toString());
		}
		
	}
	
	private void readCoursesDatabase() throws Exception{
		
		FileReader reader = new FileReader(new File(CoursesDataBase));
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
			String[] data = line.split(",");
			
			Course course = new Course(data[0],data[1],data[2],data[3]);
			courses.add(course);
			
		}
		br.close();
		
		for(Course c : courses) {
			System.out.println(c.toString());
		}
	}
	
	public static void main (String[] args) throws Exception {
		@SuppressWarnings("unused")
		Agenda agenda = new Agenda();
	}
	
}

package model;

import java.io.*;
import java.util.ArrayList;

import exceptions.ContactException;

public class Agenda {

	public static final String ContactsDataBase = "./data/StudentsTest.csv";
	public static final String CoursesDataBase = "./data/CoursesTest.csv";
	
	private ArrayList<Student> contacts;	
	private ArrayList<Course> courses;
	
	public Agenda() throws Exception{
		
		contacts = new ArrayList<Student>();
		courses = new ArrayList<Course>();
		readContactDatabase();
		readCoursesDatabase();
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
	
	public Student searchStudentName(String n) throws ContactException {
		Student find=null;
		for(int i=0; i<contacts.size(); i++) {
			if(n.equals(contacts.get(i).getName())) {
				find=contacts.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new ContactException(ContactException.search);
		}
	}
	
	public Student searchStudentAdress(String a)throws ContactException{
		Student find=null;
		for(int i=0; i<contacts.size(); i++) {
			if(a.equals(contacts.get(i).getAddress())) {
				find=contacts.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new ContactException(ContactException.search);
		}
	}
	
	public Student searchStudentPhone(String p)throws ContactException{
		Student find=null;
		for(int i=0; i<contacts.size(); i++) {
			if(p.equals(contacts.get(i).phoneNumber())) {
				find=contacts.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new ContactException(ContactException.search);
		}
	}
	
	public Student searchStudentCode(String c) throws ContactException{
		Student find=null;
		for(int i=0; i<contacts.size(); i++) {
			if(c.equals(contacts.get(i).getCode())) {
				find=contacts.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new ContactException(ContactException.search);
		}
	}
	
	public Student searchStudentEmail(String e) throws ContactException {
		Student find=null;
		for(int i=0; i<contacts.size(); i++) {
			if(e.equals(contacts.get(i).getEmail())) {
				find=contacts.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new ContactException(ContactException.search);
		}
	}
	
	
	
	public static void main (String[] args) throws Exception {
		@SuppressWarnings("unused")
		Agenda agenda = new Agenda();
	}
	
}

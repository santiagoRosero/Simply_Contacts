package model;

import java.io.*;
import java.util.*;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;

import exceptions.ContactException;

public class Agenda {

	public static final String ContactsDataBase = "./data/students.csv";
	public static final String CoursesDataBase = "./data/courses.csv";
	
	private List<Student> contacts;	
	private List<Course> courses;
	
	public Agenda() throws Exception{//TODO: what exception?
		
		contacts = new ArrayList<>();
		courses = new ArrayList<>();
		readCoursesDatabase();
		readContactDatabase();
//		System.out.println(assignedCoursesAverage());
//		System.out.println(assignedCreditsAverage());
//		Course c = mostAssignedCourse();
//		System.out.println(c.getName() +  ", " + c.getStudents().size());
//		c = lessAssignedCourse();
//		System.out.println(c.getName() + ", " + c.getStudents().size());
//		for (Course co : courses) 
//			System.out.println(co.getName() + ", " + co.getStudents().size());
	}
	
	private void readContactDatabase() throws Exception{
		
		FileReader reader = new FileReader(new File(ContactsDataBase));
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
			String[] data = line.split(";");
			
			Student contact = new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]);
			contacts.add(contact);
			
			if(!data[9].equals(" ")) {
				String[] regCourses = data[9].split(",");
				
				for(String nrc : regCourses) {
					
					for(Course course : courses) {
						
						if(course.getNRC() == Integer.parseInt(nrc)) {
							contact.addClass(course);
							course.addStudent(contact);
							break;
						}					
					}				
				}			
			}
			
//			for(Course cour : contact.getCourses()) {
//				System.out.println(contact.getName());
//				System.out.println(cour.getName());
//			}
		}
		br.close();
		
//		for(Student s : contacts) {
//			System.out.println(s.toString());
//		}
		
	}
	
	private void readCoursesDatabase() throws Exception{
		
		FileReader reader = new FileReader(new File(CoursesDataBase));
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			
			String[] data = line.split(";");

			Course course = new Course(data[0],data[1],data[2],data[3]);
			courses.add(course);
			
		}
		br.close();
		
//		for(Course c : courses) {
//			System.out.println(c.toString());
//		}
	}
	
	public Student addStudent(String name, String phone, String email, String bDay, String address, String code, String semester, String career, String picture) throws Exception{
		
		Student student = new Student(name, phone, email, bDay, address, code, semester, career, picture);
		contacts.add(student);
		return student;
	}
	
	public List<Student> getContacts(){
		return contacts;
	}
	
	public List<Course> getCourses(){
		return courses;
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

	public Course searchCourseName(String n)throws Exception {
		Course find=null;
		for(int i=0; i<courses.size(); i++) {
			if(n.equals(courses.get(i).getName())) {
				find=courses.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new Exception("this course doesn't exist in the program");
		}
	}
	
	public Course searchCourseNrc(String nrc) throws Exception {
		Course find=null;
		for(int i=0; i<courses.size(); i++) {
			if(Integer.parseInt(nrc) == courses.get(i).getNRC()) {
				find=courses.get(i);
			}
		}
		if(find!=null) {
			return find;
		}else {
			throw new Exception("The course with this NRC doesn't exist in the program");
		}
	}
	
	public ArrayList<Course> searchCourseCredits(String c) throws Exception {
		ArrayList<Course> find=new ArrayList<Course>();
		for(int i=0; i<courses.size(); i++) {
			if(Integer.parseInt(c) == (courses.get(i).getCredits())) {
				find.add(courses.get(i));
			}
		}
		if(find.isEmpty()) {
			return find;
		}else {
			throw new Exception("Doesn't exist courses with this number of credits");
		}
	}

	public int assignedCoursesAverage() {
		
		int count = 0;
		
		for(Student student : contacts)
			count += student.getCourses().size();
		
		return (count / contacts.size());		
	}
	
	public int assignedCreditsAverage() {
		
		int count = 0;
		
		for(Student student : contacts)
			count += student.creditsNumber();
		
		return (count / contacts.size());		
	}

	public Course mostAssignedCourse() {

		Course max = courses.get(0);
		
		for(int i = 1; i < courses.size(); i++) {
			Course current = courses.get(i);
			if(max.getStudents().size() < current.getStudents().size())
				max = current;
		}
		return max;
	}

	public Course leastAssignedCourse() {
		
		Course min = courses.get(0);
		
		for(int i = 1; i < courses.size(); i++) {
			Course current = courses.get(i);
			if(min.getStudents().size() > current.getStudents().size())
				min = current;
		}
		return min;
	}

	/**
	 * Transforms every contact and course stored in the program to a String and outputs their information to an external, persistent database.
	 * @throws IOException When there's an error reading the files.
	 */
	public void outputContacts() throws IOException {
		//Obtain info from contacts
		String cts = "name;phoneNumber;email;birthdate(DD-MM-YYYY);address;code;semester;career;photo;courses";
		for(Student s : contacts) {
			cts += s.persist() + "\n";
		}
		//Write contact information in database
		PrintWriter pw = new PrintWriter(new File(ContactsDataBase));
		pw.write(cts);
		String crs = "name;credits;nrc;description";
		for(Course c : courses) {
			crs += c.persist() + "\n";
		}
		pw = new PrintWriter(new File(CoursesDataBase));
		pw.write(crs);
		pw.close();
	}
	
	/** 
	 * Removes a contact from the list given the index of the contact.
	 * @param index The index of the contact to be deleted. Must be higher than 0 and lesser than <code>contacts.size()</code>
	 */
	public void deleteContact(int index) {
		Student s = contacts.get(index);
		s.unenroll();
		contacts.remove(index);
	}
	
	public static void main (String[] args) throws Exception {
		@SuppressWarnings("unused")
		Agenda agenda = new Agenda();
	}

}

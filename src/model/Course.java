package model;

import java.util.*;

public class Course {
	
	/**The number of credits this course has.*/
	private int credits;

	/** The NRC is used to identify a course */
	private int NRC;
	
	/** Name of the course. */
	private String name;
	
	/** Short Description of the course */
	private String description;
	
	private List<Student> students;
	
	public Course (String NRC, String name, String credits, String description) {
		
		if(NRC.isEmpty())
			this.NRC = 0;
		else
			this.NRC = Integer.parseInt(NRC);
		
		this.name  = name;
		
		if(credits.isEmpty())
			this.credits = 0;
		else
			this.credits = Integer.parseInt(credits);
		
		this.description = description;
		
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	@Override
	public String toString() {
		return "Course [credits=" + credits + ", NRC=" + NRC + ", name=" + name + ", description=" + description + "]";
	}

	public List<Student> getStudents(){
		return students;
	}

	public int getNRC() {
		return NRC;
	}



	public void setNRC(int nRC) {
		NRC = nRC;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public void setCredits(int credits) {
		this.credits = credits;
	}



	public int getCredits() {
		return credits;
	}
}

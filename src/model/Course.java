package model;
import java.util.*;

/**
 * A class to represent the courses to which students are enrolled in the agenda.
 * @author Jhon Edward Mora/Juan David Vera
 */
public class Course {
	
	//Attributes
	/**The number of credits this course has.*/
	private int credits;

	/** The NRC used to identify a course */
	private int NRC;
	
	/** Name of the course. */
	private String name;
	
	/** Short Description of the course */
	private String description;

	//Relations
	/**The students enrolled in this course.*/
	private List<Student> students;
	
	//Methods
	
	/**
	 * Constructor method. Initializes a new instance of class Course with the given information, and defaults information in case any of it is empty.
	 * @param NRC the NRC of this course. Defaults to 0.
	 * @param name The name of this course.
	 * @param credits The number of credits in this course. Defaults to 0.
	 * @param description A short description of this course.
	 */
	public Course (String name, String credits, String NRC, String description) {
		
		if(NRC.isEmpty())
			this.NRC = 0;
		else
			this.NRC = Integer.parseInt(NRC);
		
		this.name  = name;
		
		if(credits.isEmpty())
			this.credits = 0;
		else
			this.credits = Integer.parseInt(credits);
		
		if(description.isEmpty())
			this.description = "";
		else
			this.description = description;
		
		students = new ArrayList<Student>();
	}
	
	@Override
	public String toString() {
		return "Course [credits=" + credits + ", NRC=" + NRC + ", name=" + name + ", description=" + description + "]";
	}

	/**
	 * Returns the value of the field NRC of this course.
	 * @return The NRC of this course. When this field is not given, it will return 0.
	 */
	public int getNRC() {
		return NRC;
	}

	/**
	 * Sets the NRC of this course to the given in the parameter.
	 * @param nRC The given NRC to be used in this course.
	 */
	public void setNRC(int nRC) {
		NRC = nRC;
	}

	/**
	 * Returns the value of the field name of this course.
	 * @return The name of the course. When this field is not given, it will return "".
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of this course to the one given in the parameter.
	 * @param name The name to be used in this course. 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the value of the field description of this course.
	 * @return A short description of the course. When this field is not given, it will return "".
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of this course to the one given in the parameter.
	 * @param description A short description of the course to be used in this course.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the number of credits in this course to the one given in the parameter.
	 * @param credits The number of credits this course will have. If invalid (credits<0) will default to 0.
	 */
	public void setCredits(int credits) {
		if(credits < 0) {
			this.credits = 0;
		}else {
			this.credits = credits;
		}
	}

	/**
	 * Returns the value of the field credits.
	 * @return The number of credits in this course. When this field is not given, or given invalid, will return 0.
	 */
	public int getCredits() {
		return credits;
	}
	
	/**
	 * Registers a given student in this course.
	 * @param s The given student to be registered in this course.
	 */
	public void addStudent(Student s) {
		students.add(s);
	}
	
	/**
	 * Returns the list of students enrolled in this course.
	 * @return The list of students enrolled in this course.
	 */
	public List<Student> getStudents(){
		return students;
	}
	
	/**
	 * Converts all of the information pertinent to this course's info into a single String to be stored in a external persistent file.
	 * @return A String holding all of this course's information with the following format:<br>
	 * name;credits;NRC;description
	 */
	public String persist() {
		//Header: name;credits;nrc
		String ret = "";
		return ret += name+";"+credits+";"+NRC+";"+description;
	}
}

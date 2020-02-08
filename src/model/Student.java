package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

/**
 * Class used to represent all of the entries in the agenda. Each of the entries in this agenda is a student. Stores general info of them.
 * @author Jhon Edward Mora - A00355710 - Universidad ICESI
 * @version 1.0 of February/2020
 */
public class Student {

	//Attributes
	/**Name of this student.*/
	private String name;
	
	/**Personal address of this contact.*/
	private String address;
	
	/**Personal phone number of this contact.*/
	private String phoneNumber;
	
	/**Student code of this contact.*/
	private String code;
	
	/**Number of the semester this student is currently coursing.*/
	private int semester;
	
	/**Age of this student, in years.*/
	private int age;
	
	/**Career this student is on.*/
	private String career;
	
	/**URL to the picture this student is identifying himself with.*/
	private String picture;
	
	/**The birth date of this student.*/
	private LocalDate birthdate;
	
	/**The email of this student.*/
	private String email;
	
	//Relations
	/**Represents the courses this student is enrolled in.*/
	private List<Course> courses;
	
	//Methods
	
	/**
	 * Constructor method. Initializes an instance of class Student given the information. This information may be empty, or non existance.
	 * @param n The name of the student.
	 * @param p The phone number of the student.
	 * @param e the email
	 * @param b A String representation of the student's birth date.
	 * @param a The address of the student.
	 * @param c The code of the student.
	 * @param s The semester the student is in.
	 * @param cr The career the student is in.
	 * @param pc The URL to the student's picture.
	 */
	public Student(String n, String p, String e, String b, String a, String c, String s, String cr, String pc) {
		if(n == null)
			name = "";
		else
			name = n;
		if(a == null)
			address = "";
		else
			address = a;
		if(p == null)
			phoneNumber = "";
		else
			phoneNumber = p;
		if(c == null)
			code = "";
		else
			code = c;
		if(s.isEmpty())
			semester = 0;
		else
			semester = Integer.parseInt(s);
		if(cr == null)
			career = cr;
		else
			career = cr;
		if(pc == null)
			picture = ""; //TODO Add link to default PP
		else
			picture = pc;
		if(b == null)
			birthdate = null;
		else
			calculateBirthdate(b);
		if(e.isEmpty())
			setEmail("");
		else
			setEmail(e);
	}
	
	/**
	 * Creates a LocalDate with the birth date of this student and assigns it to the <code>birthdate</code> field.
	 * @param b A String representation of the birth date of this student in the format "DD/MM/YYYY"
	 */
	private void calculateBirthdate(String b) {
		String[] parts = b.split("-");
		int days = Integer.parseInt(parts[0]);
		int months = Integer.parseInt(parts[1]);
		int year = Integer.parseInt(parts[2]);
		LocalDate l = LocalDate.of(year, months, days);
		birthdate = l;
		
		if(birthdate != null)
			age = Period.between(birthdate, LocalDate.now()).getYears();
		else
			age = 0;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", code=" + code
				+ ", semester=" + semester + ", age=" + age + ", career=" + career + ", picture=" + picture
				+ ", birthdate=" + birthdate + ", email=" + email + ", courses=" + courses + "]";
	}

	/**Returns the given name of this student.
	 * @return The value of the field name. May be an empty field, but never null.
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Returns the address of this student.
	 * @return The value of the field address. May be an empty field, but never null.
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Returns the phone number of this student.
	 * @return The value of the field phoneNumber. May be an empty field, but never null.
	 */
	public String phoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Returns the unique student code of this student.
	 * @return The value of the field student. May be an empty field, but never null.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Returns the semester this student is currently in.
	 * @return The value of the field semester. Values of 0 indicate empty/non valid fields.
	 */
	public int getSemester() {
		return semester;
	}
	
	/**
	 * Returns the time in years that has passed since the student's birth.
	 * @return The value of the field age. Values of 0 indicate empty/non valid fields.
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Returns the career this student is coursing.
	 * @return The value of the field career. May be an empty value, but never null.
	 */
	public String getCareer() {
		return career;
	}
	
	/**
	 * Returns the URL where the student's picture is in.
	 * @return The value of the field picture. When this field is empty, a default picture URL is assigned.
	 */
	public String getPictureURL() {
		return picture;
	}
	
	/**
	 * Returns the birth date of this student.
	 * @return Either a birthday in the format "DD of MM", or an empty string if the birthdate value is empty.
	 */
	public String getBirthdate() {
		if(birthdate != null) {
			int days = birthdate.getDayOfMonth();
			String month = birthdate.getMonth().name();
			return days + " of " + month;
		}else {
			return "";
		}
	}
	
	/**
	 * Returns the list of courses this student is enrolled in.
	 * @return The list element of the field courses.
	 */
	public List<Course> getCourses(){
		return courses;
	}
	
	/**
	 * Returns the number of credits this student has enrolled.
	 * @return The sum of all credits in each Course that exist in the list <code>courses</code>
	 */
	public int getCredits() {
		int r = 0;
		for(Course c:courses) {
			r += c.getCredits();
		}
		return r;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

package model;

public class Course {
	
	/**The number of credits this course has.*/
	private int credits;

	/** The NRC is used to identify a course */
	private int NRC;
	
	/** Name of the course. */
	private String name;
	
	/** Short Description of the course */
	private String description;
	
	/**Returns the number of credits this course has.
	 * @return The value of the field credits.
	 */
	
	public Course (int NRC, String name, String description) {
		
		this.NRC = NRC;
		this.name  = name;
		this.description = description;
		
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

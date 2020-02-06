package model;

import exceptions.ContactException;

public class Studet {

	private String photo, name, lastName, addres, email, bDay, career;
	private int age, phoneNumber;
	
	/**
	 * 
	 * <pre> who ever create an instance has to put valid data
	 * 
	 * @param photo
	 * @param name
	 * @param lastName
	 * @param addres
	 * @param email
	 * @param bDay
	 * @param career
	 * @param age
	 * @param phoneNumber
	 * @throws Exception
	 */
	public Studet(String photo, String name, String lastName, String addres, String email, String bDay, String career,
			int age, int phoneNumber) throws Exception{
		
		if(name.isEmpty())
			throw new ContactException(ContactException.name);
		else
			this.name = name;
		
		if(phoneNumber == 0)
			throw new ContactException(ContactException.number);
		else
			this.phoneNumber = phoneNumber;
		
		this.photo = photo;
		this.lastName = lastName;
		this.addres = addres;
		this.email = email;
		this.bDay = bDay;
		this.career = career;
		this.age = age;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

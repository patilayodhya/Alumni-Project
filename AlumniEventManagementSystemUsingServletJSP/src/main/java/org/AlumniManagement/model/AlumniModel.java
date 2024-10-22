package org.AlumniManagement.model;

public class AlumniModel {
	private String name;
	private int Alumni_id;
	private int Year_of_Graduation;
	private String contact;
	private String Email;
	private int br_id;
	public int getBr_id() {
		return br_id;
	}
	public void setBr_id(int br_id) {
		this.br_id = br_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlumni_id() {
		return Alumni_id;
	}
	public void setAlumni_id(int alumni_id) {
		Alumni_id = alumni_id;
	}
	public int getYear_of_Graduation() {
		return Year_of_Graduation;
	}
	public void setYear_of_Graduation(int year_of_Graduation) {
		Year_of_Graduation = year_of_Graduation;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String toString() {
		return "AlumniModel [id="+Alumni_id+", name=" + name+ ",year_of_Graduation="+ Year_of_Graduation +", email=" + Email + ",contact="+contact+",br_id="+br_id+"]";
	}
	

}

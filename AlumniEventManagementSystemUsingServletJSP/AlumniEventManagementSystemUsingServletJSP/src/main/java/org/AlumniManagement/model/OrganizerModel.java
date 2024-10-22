package org.AlumniManagement.model;

public class OrganizerModel {
	String org_name;
	String org_email;
	String org_contact;
	int org_id;
	public int getOrg_id() {
		return org_id;
	}

	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}

	public String toString() {
		return "MachineModel [id="+org_id+", name=" + org_name+ ", email=" + org_email + ",contact="+org_contact+"]";
	}
	
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_email() {
		return org_email;
	}
	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}
	public String getOrg_contact() {
		return org_contact;
	}
	public void setOrg_contact(String org_contact) {
		this.org_contact = org_contact;
	}
	
 
	

}

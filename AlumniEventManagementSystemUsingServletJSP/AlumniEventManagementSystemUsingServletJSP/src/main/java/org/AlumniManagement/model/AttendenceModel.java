package org.AlumniManagement.model;

public class AttendenceModel {
	private int alumni_id;
	private int br_id;
	public int getBr_id() {
		return br_id;
	}
	public void setBr_id(int br_id) {
		this.br_id = br_id;
	}
	private int event_id;
	private String status;
	public int getAlumni_id() {
		return alumni_id;
	}
	public void setAlumni_id(int alumni_id) {
		this.alumni_id = alumni_id;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

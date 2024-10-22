package org.AlumniManagement.model;

public class FeedbackModel {
	private int alumni_id;
	private int org_id;
	private int event_id; 
	private String fmsg;
	public int getAlumni_id() {
		return alumni_id;
	}
	public void setAlumni_id(int alumni_id) {
		this.alumni_id = alumni_id;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getFmsg() {
		return fmsg;
	}
	public void setFmsg(String fmsg) {
		this.fmsg = fmsg;
	}
	
	

}

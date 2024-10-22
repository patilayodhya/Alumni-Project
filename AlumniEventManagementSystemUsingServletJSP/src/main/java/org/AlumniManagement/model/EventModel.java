package org.AlumniManagement.model;

import java.util.Date;

public class EventModel {
	@Override
	public String toString() {
		return "EventModel [Event_id=" + Event_id + ", Event_name=" + Event_name + ", Event_date=" + Event_date
				+ ", Event_location=" + Event_location + ", Event_description=" + Event_description + ", org_id="
				+ org_id + ", br_id=" + br_id + ",alumni_id=" + alumni_id + "]";
	}
	private int Event_id;
	private String Event_name;
	private String Event_date;
	private String Event_location;
	private String Event_description;
	private int org_id;
	private  String oname;
	private int br_id;
	private String br_name;
	private int alumni_id;
	private String name;
	public int getAlumni_id() {
		return alumni_id;
	}
	public void setAlumni_id(int alumni_id) {
		this.alumni_id = alumni_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBr_name() {
		return br_name;
	}
	public void setBr_name(String br_name) {
		this.br_name = br_name;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public int getBr_id() {
		return br_id;
	}
	public void setBr_id(int br_id) {
		this.br_id = br_id;
	}
	public int getEvent_id() {
		return Event_id;
	}
	public void setEvent_id(int event_id) {
		Event_id = event_id;
	}
	public String getEvent_name() {
		return Event_name;
	}
	public void setEvent_name(String event_name) {
		Event_name = event_name;
	}
	public String getEvent_date() {
		return Event_date;
	}
	public void setEvent_date(String event_date) {
		Event_date = event_date;
	}
	public String getEvent_location() {
		return Event_location;
	}
	public void setEvent_location(String event_location) {
		Event_location = event_location;
	}
	public String getEvent_description() {
		return Event_description;
	}
	public void setEvent_description(String event_description) {
		Event_description = event_description;
	}
	
	
	

}

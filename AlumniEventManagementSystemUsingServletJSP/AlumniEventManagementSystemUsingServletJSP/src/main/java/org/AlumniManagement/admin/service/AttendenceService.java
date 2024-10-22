package org.AlumniManagement.admin.service;

import java.util.List;

import org.AlumniManagement.model.AttendenceModel;

public interface AttendenceService {
	public boolean isAddAttendence(AttendenceModel Atmodel);
	public List<Object[]>getAllAttendence();
	public List<Object[]>getAllPresentAlumni();
	public List<Object[]>getAllAbsentAlumni();

}

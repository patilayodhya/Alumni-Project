package org.AlumniManagement.admin.Repository;

import java.util.List;

import org.AlumniManagement.model.AttendenceModel;

public interface AttendenceRepository{
	public boolean isAddAttendence(AttendenceModel Atmodel);
	public List<Object[]>getAllAttendence();
	public List<Object[]>getAllPresentAlumni();
	public List<Object[]>getAllAbsentAlumni();

}

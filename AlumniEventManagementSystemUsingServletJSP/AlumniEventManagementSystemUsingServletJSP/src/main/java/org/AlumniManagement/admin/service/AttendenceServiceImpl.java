package org.AlumniManagement.admin.service;

import java.util.List;

import org.AlumniManagement.admin.Repository.AttendenceRepositoryImpl;
import org.AlumniManagement.model.AttendenceModel;

public class AttendenceServiceImpl implements AttendenceService{
AttendenceRepositoryImpl attRepo=new AttendenceRepositoryImpl();
	@Override
	public boolean isAddAttendence(AttendenceModel Atmodel) {
		// TODO Auto-generated method stub
		return attRepo.isAddAttendence(Atmodel);
	}
	@Override
	public List<Object[]> getAllAttendence() {
		// TODO Auto-generated method stub
		return attRepo.getAllAttendence();
	}
	@Override
	public List<Object[]> getAllPresentAlumni() {
		// TODO Auto-generated method stub
		return attRepo.getAllPresentAlumni();
	}
	@Override
	public List<Object[]> getAllAbsentAlumni() {
		// TODO Auto-generated method stub
		return attRepo.getAllAbsentAlumni();
	}

}

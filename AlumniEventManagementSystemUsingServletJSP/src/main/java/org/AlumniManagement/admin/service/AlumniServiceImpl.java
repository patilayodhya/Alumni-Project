package org.AlumniManagement.admin.service;

import org.AlumniManagement.admin.Repository.AlumniRepositoryImpl;

import java.util.List;

import org.AlumniManagement.admin.Repository.AlumniRepository;
import org.AlumniManagement.model.AlumniModel;

public class AlumniServiceImpl implements AlumniService{
	AlumniRepository AluRepo=new AlumniRepositoryImpl();
	@Override
	public boolean isAddAlumni(AlumniModel Amodel) {
		// TODO Auto-generated method stub
		return AluRepo.isAddAlumni(Amodel);
	}
	@Override
	public List<Object[]> getAllAlumni() {
		// TODO Auto-generated method stub
		return AluRepo.getAllAlumni();
	}
	@Override
	public boolean isDeleteAlumniById(int alumni_id) {
		// TODO Auto-generated method stub
		return AluRepo.isDeleteAlumniById(alumni_id);
	}
	@Override
	public boolean isUpdateAlumni(AlumniModel Amodel) {
		// TODO Auto-generated method stub
		return AluRepo.isUpdateAlumniById(Amodel);
	}
	@Override
	public List<Object[]> getAllSeniorAlumni() {
		// TODO Auto-generated method stub
		return AluRepo.getAllSeniorAlumni();
	}
	@Override
	public List<Object[]> getAllViewAlumniEvent() {
		// TODO Auto-generated method stub
		return AluRepo.getAllViewAlumniEvent();
	}
	
	

}

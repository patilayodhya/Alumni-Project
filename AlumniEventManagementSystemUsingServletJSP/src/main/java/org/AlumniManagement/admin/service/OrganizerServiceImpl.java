package org.AlumniManagement.admin.service;

import org.AlumniManagement.admin.Repository.OrganizerRepositoryImpl;
import org.AlumniManagement.model.OrganizerModel;

import java.util.List;

import org.AlumniManagement.admin.Repository.OrganizerRepository;


public class OrganizerServiceImpl implements OrganizerService {
	OrganizerRepository orgRepo=new OrganizerRepositoryImpl();
	@Override
	public boolean isAddOrganizer(OrganizerModel model){
		// TODO Auto-generated method stub
		return orgRepo.isAddOrganizer(model);
	}
	@Override
	public List<OrganizerModel> getAllOrganizer(String email,String password) {
		// TODO Auto-generated method stub
		return orgRepo.getAllOrganizer(email,password);
	}
	 

}

package org.AlumniManagement.admin.service;
import org.AlumniManagement.admin.Repository.AdminRegRepositoryImpl;
import org.AlumniManagement.admin.Repository.AdminRegRepository;
import org.AlumniManagement.model.AdminRegModel;

public class AdminRegServiceImpl implements AdminRegService {
	AdminRegRepository AdRepo=new AdminRegRepositoryImpl();
	@Override
	public boolean isAddAdmin(AdminRegModel Armodel) {
		// TODO Auto-generated method stub
		return AdRepo.isAddAdmin(Armodel);
	}

}

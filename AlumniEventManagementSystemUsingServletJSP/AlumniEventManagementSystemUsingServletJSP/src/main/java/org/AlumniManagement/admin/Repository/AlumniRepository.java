package org.AlumniManagement.admin.Repository;

import java.util.List;

import org.AlumniManagement.model.AlumniModel;


public interface AlumniRepository {
	public boolean isAddAlumni(AlumniModel Amodel);

	public List<Object[]> getAllAlumni();

	public boolean isDeleteAlumniById(int alumni_id);
	public boolean isUpdateAlumniById(AlumniModel Amodel);
	 public List<Object[]>getAllSeniorAlumni();
	 public List<Object[]>getAllViewAlumniEvent();


}

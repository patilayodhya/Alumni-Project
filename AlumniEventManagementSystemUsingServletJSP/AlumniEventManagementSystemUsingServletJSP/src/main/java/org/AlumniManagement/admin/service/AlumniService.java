package org.AlumniManagement.admin.service;

import java.util.List;

import org.AlumniManagement.model.AlumniModel;



public interface AlumniService {
	public boolean isAddAlumni(AlumniModel Amodel);
	public List<Object[]>getAllAlumni();
 	public boolean isDeleteAlumniById(int alumni_id);
    public boolean isUpdateAlumni(AlumniModel Amodel);
    public List<Object[]>getAllSeniorAlumni();
    public List<Object[]>getAllViewAlumniEvent();
}

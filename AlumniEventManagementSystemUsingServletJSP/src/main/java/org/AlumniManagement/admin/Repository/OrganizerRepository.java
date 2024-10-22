package org.AlumniManagement.admin.Repository;

import java.util.List;

import org.AlumniManagement.model.OrganizerModel;

public interface OrganizerRepository {
	

	public boolean isAddOrganizer(OrganizerModel model);
	public List<OrganizerModel>getAllOrganizer(String email,String password);

}

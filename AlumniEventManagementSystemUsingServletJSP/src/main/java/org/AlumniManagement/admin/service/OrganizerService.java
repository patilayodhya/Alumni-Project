package org.AlumniManagement.admin.service;

import java.util.List;

import org.AlumniManagement.model.OrganizerModel;

public interface OrganizerService {
	public boolean isAddOrganizer(OrganizerModel model);
	public List<OrganizerModel>getAllOrganizer(String email, String password);

}

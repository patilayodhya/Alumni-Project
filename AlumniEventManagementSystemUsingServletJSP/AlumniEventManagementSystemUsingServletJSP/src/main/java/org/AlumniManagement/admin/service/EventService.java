package org.AlumniManagement.admin.service;

import java.util.List;

import org.AlumniManagement.model.AlumniModel;
import org.AlumniManagement.model.EventModel;

public interface EventService {
	public boolean isAddEvent(EventModel Emodel);
	public List<Object[]>getAllEvent();
	public boolean isDeleteEventById(int event_id);
	  public boolean isUpdateEvent(EventModel Emodel);

}

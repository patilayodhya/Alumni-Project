package org.AlumniManagement.admin.Repository;

import java.util.List;

import org.AlumniManagement.model.AlumniModel;
import org.AlumniManagement.model.EventModel;

public interface EventRepository {
	public boolean isAddevent(EventModel Emodel);
	public List<Object[]>getAllEvent();
	public boolean isDeleteEventById(int event_id);
	public boolean isUpdateEvent(EventModel Emodel);

}

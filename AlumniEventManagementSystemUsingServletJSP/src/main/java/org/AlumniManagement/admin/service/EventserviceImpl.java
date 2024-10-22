package org.AlumniManagement.admin.service;

import org.AlumniManagement.model.EventModel;

import java.util.List;

import org.AlumniManagement.admin.Repository.EventRepository;
import org.AlumniManagement.admin.Repository.EventRepositoryImpl;
public class EventserviceImpl implements EventService{
	EventRepository eventRepo=new EventRepositoryImpl();
	@Override
	public boolean isAddEvent(EventModel Emodel) {
		// TODO Auto-generated method stub
		return eventRepo.isAddevent(Emodel);
	}
	@Override
	public List<Object[]> getAllEvent() {
		// TODO Auto-generated method stub
		return eventRepo.getAllEvent();
	}
	@Override
	public boolean isDeleteEventById(int event_id) {
		// TODO Auto-generated method stub
		return eventRepo.isDeleteEventById(event_id);
	}
	@Override
	public boolean isUpdateEvent(EventModel Emodel) {
		// TODO Auto-generated method stub
		return eventRepo.isUpdateEvent(Emodel);
	}

}

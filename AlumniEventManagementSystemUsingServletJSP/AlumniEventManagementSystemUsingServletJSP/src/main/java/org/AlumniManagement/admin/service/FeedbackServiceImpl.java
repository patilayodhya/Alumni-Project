package org.AlumniManagement.admin.service;

import org.AlumniManagement.model.FeedbackModel;
import org.AlumniManagement.admin.Repository.FeedbackRepositoryImpl;

import java.util.List;

import org.AlumniManagement.admin.Repository.FeedbackRepository;
public class FeedbackServiceImpl implements FeedbackService {
	FeedbackRepository fRepo=new FeedbackRepositoryImpl();
	@Override
	public boolean isAddfeedback(FeedbackModel fModel) {
		// TODO Auto-generated method stub
		return fRepo.isAddfeedback(fModel);
	}
	@Override
	public List<Object[]> getAllFeedback() {
		// TODO Auto-generated method stub
		return fRepo.getAllFeedback();
	}

}

package org.AlumniManagement.admin.service;

import java.util.List;

import org.AlumniManagement.model.FeedbackModel;

public interface FeedbackService {
	public boolean isAddfeedback(FeedbackModel fModel);
	public List<Object[]>getAllFeedback();

}

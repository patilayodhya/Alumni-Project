package org.AlumniManagement.admin.Repository;

import java.util.List;

import org.AlumniManagement.model.FeedbackModel;

public interface FeedbackRepository {
	public boolean isAddfeedback(FeedbackModel fModel);
	public List<Object[]>getAllFeedback();

}

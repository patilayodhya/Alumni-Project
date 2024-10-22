package org.AlumniManagement.admin.Repository;

import java.util.ArrayList;
import java.util.List;

import org.AlumniManagement.admin.config.DBConfig;
import org.AlumniManagement.model.FeedbackModel;

public class FeedbackRepositoryImpl extends DBConfig implements FeedbackRepository{
	List<Object[]>list;
	@Override
	public boolean isAddfeedback(FeedbackModel fModel) {
		// TODO Auto-generated method stub
		String present="present";
		boolean b=false;
		try {
			stmt=conn.prepareStatement("select a.alumni_id from alumni a inner join attendence at on a.alumni_id=at.alumni_id where  a.alumni_id=? and at.status ='present'");
	         stmt.setInt(1, fModel.getAlumni_id());
			rs=stmt.executeQuery();
		   
			if(rs.next())
			{
				b=true;
				System.out.println(b);
			}
				
			if(b){
			stmt=conn.prepareStatement("insert into feedback values('0',?,?,?,?)");
			stmt.setInt(1,fModel.getAlumni_id());
			stmt.setInt(2,fModel.getOrg_id());
			stmt.setInt(3, fModel.getEvent_id());
			stmt.setString(4,fModel.getFmsg());
			int value=stmt.executeUpdate();
			return value>0?true:false;
			}
			else
			{
				System.out.print("you are absent");
				return false;
			}
			
			
		}
		catch(Exception ex)
		{
			System.out.println("exception ex");
			return false;
		}
		
		
		
		
	}

	@Override
	public List<Object[]> getAllFeedback() {
		// TODO Auto-generated method stub
		try {
			list =new ArrayList<Object[]>();
			stmt=conn.prepareStatement("SELECT a.Name AS alumni_name,o.org_name,e.Event_Name AS event_name,f.fmsg FROM feedback f JOIN alumni a ON f.alumni_id = a.Alumni_Id JOIN organizer o ON f.org_id = o.org_id JOIN alumni_event e ON f.event_id = e.Event_Id;");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[] 
						{
								rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
						};
				
				list.add(obj);
			}
			
			return list.size()>0?list:null;
			 
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
		}
		return null;
	}
	
	
	// boolean ifPresent 

}

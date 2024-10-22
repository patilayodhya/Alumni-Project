package org.AlumniManagement.admin.Repository;

import java.util.ArrayList;
import java.util.List;

import org.AlumniManagement.admin.config.DBConfig;
import org.AlumniManagement.model.AlumniModel;
import org.AlumniManagement.model.EventModel;

public class EventRepositoryImpl extends DBConfig implements EventRepository {
	List<Object[]>list;
	@Override
	public boolean isAddevent(EventModel Emodel) {
		try {
			System.out.println(Emodel);
			stmt=conn.prepareStatement("insert into alumni_event values('0',?,?,?,?,?,?,?)");
			stmt.setString(1, Emodel.getEvent_name());
			stmt.setString(2, Emodel.getEvent_date());
			stmt.setString(3, Emodel.getEvent_location());
			stmt.setString(4, Emodel.getEvent_description());
			stmt.setInt(5, Emodel.getOrg_id());
			stmt.setInt(6, Emodel.getBr_id());
			stmt.setInt(7, Emodel.getAlumni_id());
			int value=stmt.executeUpdate();
			return value>0?true:false;
			
		}catch(Exception ex)
		{
			System.out.println("error is"+ex.getMessage());
			return false;
		}
		
	}



	@Override
	public List<Object[]> getAllEvent() {
		// TODO Auto-generated method stub
		try {
			list =new ArrayList<Object[]>();
			stmt=conn.prepareStatement("SELECT  e.Event_Id, e.Event_Name,e.Event_Date,e.Event_Location,e.Event_Description,o.org_name,b.br_name, a.Name AS Alumni_Name FROM organizer AS o INNER JOIN alumni_event AS e ON o.org_id = e.org_id INNER JOIN branch AS b ON e.br_id = b.br_id LEFT JOIN alumni AS a ON e.alumni_id = a.Alumni_Id");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[]
				{
					rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)	
								
				};
				
			list.add(obj);	
			}
			
			
			return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("exception is"+ex);
			return null;
		}
		
	}



	@Override
	public boolean isDeleteEventById(int event_id) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("delete from alumni_event where event_Id=?");
			stmt.setInt(1,event_id);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return false;
		}
		
	}



	@Override
	public boolean isUpdateEvent(EventModel Emodel) {
		// TODO Auto-generated method stub
		try {
			  stmt=conn.prepareStatement(" update alumni_event set event_name=?,event_date=?,event_location=?,event_description=? where event_id=?");
			  stmt.setString(1, Emodel.getEvent_name());
			  stmt.setString(2, Emodel.getEvent_date());
			  stmt.setString(3, Emodel.getEvent_location());
			  stmt.setString(4, Emodel.getEvent_description());
			 
			 // stmt.setInt(5, Emodel.getOrg_id());
			 // stmt.setInt(6, Emodel.getBr_id());
			  stmt.setInt(5,Emodel.getEvent_id());
			  int value=stmt.executeUpdate();
				return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return false;
		}
		
		
	}

	
	
}

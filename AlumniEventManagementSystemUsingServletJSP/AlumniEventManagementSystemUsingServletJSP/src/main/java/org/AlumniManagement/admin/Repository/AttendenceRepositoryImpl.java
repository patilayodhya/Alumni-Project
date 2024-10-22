package org.AlumniManagement.admin.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.AlumniManagement.admin.config.DBConfig;
import org.AlumniManagement.model.AttendenceModel;

public class AttendenceRepositoryImpl extends DBConfig  implements AttendenceRepository{
	List<Object[]>list;
	@Override
	public boolean isAddAttendence(AttendenceModel Atmodel) {
		String present="present";
		boolean b=false;
		try {
			
			stmt=conn.prepareStatement("insert into attendence values(?,?,?,?)");
			stmt.setInt(1,Atmodel.getAlumni_id());
			stmt.setInt(2, Atmodel.getBr_id());
			stmt.setInt(3, Atmodel.getEvent_id());
			stmt.setString(4, Atmodel.getStatus());
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
	public List<Object[]> getAllAttendence() {
		// TODO Auto-generated method stub
		
		try
		{
			list =new ArrayList<Object[]>();
			stmt=conn.prepareStatement(" SELECT a.Name AS Alumni_Name,b.br_name AS Branch_Name,ae.Event_Name,at.status,ae.event_date as Date FROM attendence at JOIN alumni a ON at.alumni_id = a.Alumni_Id JOIN branch b ON at.br_id = b.br_id JOIN alumni_event ae ON at.event_id = ae.Event_Id;");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[] 
						{
								rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
						};
				
				list.add(obj);
			}
			
			return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return null;
		}
		
	}

	@Override
	public List<Object[]> getAllPresentAlumni() {
		// TODO Auto-generated method stub
		
		try
		{
			list =new ArrayList<Object[]>();
			stmt=conn.prepareStatement(" SELECT a.Name AS Alumni_Name,b.br_name AS Branch_Name,ae.Event_Name,at.status,ae.event_date as Date FROM attendence at JOIN alumni a ON at.alumni_id = a.Alumni_Id JOIN branch b ON at.br_id = b.br_id JOIN alumni_event ae ON at.event_id = ae.Event_Id where status='present';");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[] 
						{
								rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
						};
				
				list.add(obj);
			}
			
			return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return null;
		}
		
	
		
	}

	@Override
	public List<Object[]> getAllAbsentAlumni() {
	    try {
	        List<Object[]> list = new ArrayList<>();
	        stmt = conn.prepareStatement("SELECT a.Name AS Alumni_Name, b.br_name AS Branch_Name, ae.Event_Name, at.status, ae.event_date AS Date FROM attendence at JOIN alumni a ON at.alumni_id = a.Alumni_Id JOIN branch b ON at.br_id = b.br_id JOIN alumni_event ae ON at.event_id = ae.Event_Id WHERE status='absent'");
	        rs = stmt.executeQuery();
	        while (rs.next()) {
	            Object[] obj = new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) };
	            list.add(obj);
	        }
	        return list;
	    } catch (Exception ex) {
	        System.out.println("Error: " + ex);
	        ex.printStackTrace(); // Print stack trace for debugging purposes
	        return Collections.emptyList(); // Return an empty list if an error occurs
	    }
	}


}

package org.AlumniManagement.admin.Repository;

import java.util.ArrayList;
import java.util.List;

import org.AlumniManagement.admin.config.DBConfig;
import org.AlumniManagement.model.AlumniModel;
//alumni repo object alumniserviceImpl

public class AlumniRepositoryImpl extends DBConfig  implements AlumniRepository{
	List<Object[]>list;

	@Override
	public boolean isAddAlumni(AlumniModel Amodel) {
		try {
			stmt=conn.prepareStatement("insert into Alumni values('0',?,?,?,?,?)");
			stmt.setString(1,Amodel.getName());
			stmt.setInt(2,Amodel.getYear_of_Graduation());
			stmt.setString(3,Amodel.getContact());
			
			stmt.setString(4,Amodel.getEmail());
			stmt.setInt(5, Amodel.getBr_id());
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
	public List<Object[]> getAllAlumni() {
		// TODO Auto-generated method stub
		try {
			list =new ArrayList<Object[]>();
			stmt=conn.prepareStatement(" select a.alumni_id,a.name,a.year_of_graduation,a.contact,a.email,b.br_name from alumni a left join branch b on a.br_id=b.br_id order by year_of_graduation asc");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[] 
						{
								rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6)
						};
				
				list.add(obj);
			}
			
			return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
		
	}

	@Override
	public boolean isDeleteAlumniById(int alumni_id) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("delete from Alumni where Alumni_Id=?");
			stmt.setInt(1,alumni_id);
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
	public boolean isUpdateAlumniById(AlumniModel Amodel) {
		System.out.println("gfdgdfgdfgfAmodel");
		System.out.println(Amodel);
		// TODO Auto-generated method stub
		try {
			  stmt=conn.prepareStatement(" update alumni set name=?,year_of_graduation=?,contact=?,email=? where alumni_id=?");
			  stmt.setString(1, Amodel.getName());
			  stmt.setInt(2, Amodel.getYear_of_Graduation());
			  stmt.setString(3, Amodel.getContact());
			  stmt.setString(4, Amodel.getEmail());
			 // stmt.setInt(5, Amodel.getBr_id());
			  stmt.setInt(5,Amodel.getAlumni_id());
			  int value=stmt.executeUpdate();
				return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return false;
		}
		
	}

	@Override
	public List<Object[]> getAllSeniorAlumni() {
		list =new ArrayList<Object[]>();
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("  SELECT a.Name AS Alumni_Name, a.Year_of_Graduation,b.br_name AS Branch_Name,ae.Event_Name,ae.Event_Date  FROM alumni a JOIN attendence at ON a.Alumni_Id = at.alumni_id JOIN alumni_event ae ON at.event_id = ae.Event_Id JOIN branch b ON a.br_id = b.br_id where at.status='present' ORDER BY a.Year_of_Graduation ASC LIMIT 1;");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[] 
						{
								rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5)
						};
				
				list.add(obj);
			}
			
			return list.size()>0?list:null;
		
		
		}
		catch(Exception ex)
		{
			System.out.println("exception "+ex);
			return null;
		}
		
	}

	@Override
	public List<Object[]> getAllViewAlumniEvent() {
		// TODO Auto-generated method stub
		list =new ArrayList<Object[]>();
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("SELECT a.Name AS Alumni_Name, a.Year_of_Graduation,b.br_name AS Branch_Name,ae.Event_Name,ae.Event_Date, ae.Event_Location, at.status FROM alumni a JOIN attendence at ON a.Alumni_Id =at.alumni_id JOIN alumni_event ae ON at.event_id = ae.Event_Id JOIN branch b ON a.br_id = b.br_id where at.status='present'");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object []obj=new Object[] 
						{
								rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)
						};
				
				list.add(obj);
			}
			
			return list.size()>0?list:null;
		
		
		}
		catch(Exception ex)
		{
			System.out.println("exception "+ex);
			return null;
		}
		
	}

	

}

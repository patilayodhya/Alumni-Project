package org.AlumniManagement.admin.Repository;

import java.util.ArrayList;
import java.util.List;

import org.AlumniManagement.admin.config.DBConfig;
import org.AlumniManagement.model.OrganizerModel;

public class OrganizerRepositoryImpl extends DBConfig implements OrganizerRepository{
     List<OrganizerModel>list;
	@Override
	public boolean isAddOrganizer(OrganizerModel model) {
		// TODO Auto-generated method stub
		try {
			
			stmt=conn.prepareStatement("insert into organizer values('0',?,?,?)");
			stmt.setString(1,model.getOrg_name());
			stmt.setString(2, model.getOrg_email());
			stmt.setString(3, model.getOrg_contact());
//			String orgname=model.getOrg_name();
//			String orgemail=model.getOrg_email();
//			String orgcontact=model.getOrg_contact();
//			System.out.println(orgname+" "+orgemail+" "+orgcontact);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
		   return false;
		}
		
		
	}

	@Override
	public List<OrganizerModel> getAllOrganizer(String email,String password) {
		
		try {
			list=new ArrayList<OrganizerModel>();
			stmt=conn.prepareStatement("select*from organizer where org_email=? and org_contact=?");
			stmt.setString(1, email);
			stmt.setString(2, password);
			rs=stmt.executeQuery();
			 while(rs.next())
			 {
				 OrganizerModel model=new OrganizerModel();
				 model.setOrg_id(rs.getInt(1));
				 model.setOrg_name(rs.getString(2));
				 model.setOrg_email(rs.getString(3));
				 model.setOrg_contact(rs.getString(4));
				 list.add(model);
				 
				 
			 }
			 return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return null;
		}
		
	}
	

}

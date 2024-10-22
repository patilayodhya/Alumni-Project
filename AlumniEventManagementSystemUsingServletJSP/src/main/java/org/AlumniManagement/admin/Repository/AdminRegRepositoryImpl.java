package org.AlumniManagement.admin.Repository;

import org.AlumniManagement.admin.config.DBConfig;
import org.AlumniManagement.model.AdminRegModel;

public class AdminRegRepositoryImpl extends DBConfig  implements AdminRegRepository{

	@Override
	public boolean isAddAdmin(AdminRegModel Armodel) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("insert into login values(?,?,?)");
		//	stmt.setInt(1, Armodel.getId());
			stmt.setString(1,Armodel.getName());
			stmt.setString(2, Armodel.getEmail());
			stmt.setString(3, Armodel.getPassword());
			int value=stmt.executeUpdate();
			System.out.println(value);
			return value>0?true:false;
			
			
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return false;
		}
		
	}
	
	

}

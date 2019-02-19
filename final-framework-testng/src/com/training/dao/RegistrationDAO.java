package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.RegistrationBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class RegistrationDAO {
Properties properties; 
	
	public RegistrationDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<RegistrationBean> getRegistrations(){//what to code ?????
		String sql = properties.getProperty("get.Registrations"); 
		
		GetConnection gc  = new GetConnection(); 
		List<RegistrationBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<RegistrationBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				RegistrationBean temp = new RegistrationBean(); 
				temp.setfirstName(gc.rs1.getString(1));
				temp.setlastName(gc.rs1.getString(2));
				temp.setemail(gc.rs1.getString(3));
				temp.setphone(gc.rs1.getString(3));
				temp.setlogin(gc.rs1.getString(4));
				temp.setPassword(gc.rs1.getString(5));
							list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new RegistrationDAO().getRegistrations().forEach(System.out :: println);
	}
	
	


}

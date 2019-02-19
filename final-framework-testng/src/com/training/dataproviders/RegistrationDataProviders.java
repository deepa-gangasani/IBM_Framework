package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.RegistrationBean;
import com.training.dao.ELearningDAO;
import com.training.dao.RegistrationDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class RegistrationDataProviders {
	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<RegistrationBean> list = new RegistrationDAO().getRegistrations(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(RegistrationBean temp : list){
			Object[]  obj = new Object[8]; 
			obj[0] = temp.getfirstName(); 
			obj[1] = temp.getlastName(); 
			obj[2] = temp.geteMail();
			obj[3] = temp.getphone();
			obj[4] = temp.getlogin();
			obj[5] = temp.getPassword();
			
			result[count ++] = obj; 
		}
			
		return result;
	}
	

	
	@DataProvider(name = "TestData_TC_72")//data provider name 
	public Object[][] getExcelDataTC72(){
	String fileName="./resources/TestData.xlsx";
	String sheetName="TC_72";
	System.out.println("Filename inside Dataprovider:"+fileName);
		return new ApachePOIExcelRead().getExcelContent(fileName,sheetName); 
	}
	
	
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}


}

package com.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.utils.ConnectionUtils;

//this is new project into github //this is new project into github //this is new project into github //this is new project into github 
//this is new project into github //this is new project into github //this is new project into github //this is new project into github
public class EmployeeDAO {
	public void insertEmployee(int eid,String eName,int esalary) throws ClassNotFoundException{
		String insertQuery="insert into emp(eid,eName,esalary) values("+eid+",'"+eName+"',"+esalary+")";
		
		
			try {
				Connection con = ConnectionUtils.getConnection();
				if(con != null)
				{
					Statement st=con.createStatement();
					int result;
				result = st.executeUpdate(insertQuery);
				if(result > 0)
				{
				System.out.println("sucess");
				}
				else{
					System.out.println("failed");
				}
			}
			else{
				System.out.println("conn not est");
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}

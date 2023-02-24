package com.ebrain.employeedetails.db;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ebrain.employeedetails.dto.User;

public class DataBaseUtil {
	private String dburl = "jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";

	private String dbuname = "mysql_demo_tnj";

	private String dbpassword = "Ebrain@20";

	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbdriver) {

		try {

			Class.forName(dbdriver);
			System.out.println("Connection Succsesfully");

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public Connection getConnection() {

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(dburl, dbuname, dbpassword);

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return conn;

	}

	public String save(User user) {

		// TODO Auto-generated method stub

		loadDriver(dbdriver);

		Connection conn = getConnection();

		String result = "data entered Successfully";

		String sql = "insert into tb_ajith_employeedetails(employee_id,employee_name,father_name,mother_name,dob,email_id,city,phone_no) values (?,?,?,?,?,?,?,?)";
	
		try {

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, user.getEmployeeId());

			ps.setString(2, user.getEmployeeName());

			ps.setString(3, user.getFatherName());
			
			ps.setString(4, user.getMotherName());

			ps.setString(5, user.getDob());

			ps.setString(6, user.getEmailId());
			
			ps.setString(7, user.getCity());

			ps.setString(8, user.getPhoneNo());

			ps.executeUpdate();
		
			
		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			result = "data not entered";

		}

		return result;
	}
	
	


	
}

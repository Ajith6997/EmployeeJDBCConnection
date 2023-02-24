package com.ebrain.employeedetails.controller;

import java.io.IOException;

import com.ebrain.employeedetails.db.DataBaseUtil;
import com.ebrain.employeedetails.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbController
 */
@WebServlet("/DbController")
public class DbController extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String EmployeeId=request.getParameter("employeeid");
		String EmployeeName=request.getParameter("employeename");
		String FatherName=request.getParameter("fathername");
		String MotherName=request.getParameter("mothername");
		String Dob=request.getParameter("dob");
		String EmailId=request.getParameter("emailid");
		String City=request.getParameter("city");
		String PhoneNo=request.getParameter("phoneno");
		User user =new User();
		user.setEmployeeId(EmployeeId);
		user.setEmployeeName(EmployeeName);
		user.setFatherName(FatherName);
		user.setMotherName(MotherName);
		user.setDob(Dob);
		user.setEmailId(EmailId);
		user.setCity(City);
		user.setPhoneNo(PhoneNo);
		DataBaseUtil db =new DataBaseUtil();
		String result = db.save(user);
		response.getWriter().print(result);
	}

}

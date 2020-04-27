package com.bestbright.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bestbright.common.DatabaseManager;
import com.bestbright.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String rollNo=request.getParameter("rollNo");
		String phoneNo=request.getParameter("phoneNo");
		String address= request.getParameter("address");
		saveStudent(name, rollNo, phoneNo, address);
		
		RequestDispatcher rd=request.getRequestDispatcher("student_list.jsp");
		request.setAttribute("studentList",getStudentList());
		
		rd.forward(request, response);
		
	}

	public void saveStudent(String name,String rollNo,String phoneNo,String address) {
		try {
			Connection con=DatabaseManager.getConnection();
			String sql="insert into student(name,rollNo,phoneNo,address) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2,rollNo);
			pstmt.setString(3, phoneNo);
			pstmt.setString(4, address);
			pstmt.executeUpdate();
			con.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	List<Student> getStudentList(){
		List<Student> stdList=new ArrayList<Student>();
		Connection con=DatabaseManager.getConnection();
		String sql="select * from student";
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				Student std=new Student(Integer.parseInt(rs.getString("id")), rs.getString("name"), rs.getString("rollNo"),rs.getString("phoneNo"),rs.getString("address"));
				stdList.add(std);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stdList;
		
	}

}

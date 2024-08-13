package edu.students.controller;

import java.util.List;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import edu.students.dao.StudentsDao;
import edu.students.model.Student;


@WebServlet("/")
public class StudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private StudentsDao studentDao = new StudentsDao();
	
    
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
//		new code
		String servURL = request.getServletPath();
		System.out.print(servURL);
		
		switch (servURL) {
		
		case "/studs": {
			try {
			
				List<Student> studList = studentDao.getStudent();
				request.setAttribute("studList", studList);
				RequestDispatcher dispatcher = request.getRequestDispatcher("studentList.jsp");
				dispatcher.forward(request, response);
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(ServletException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + servURL);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, 
			IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");
		
		Student student = new Student();
		student.setEmail(email);
		student.setFname(fname);
		student.setLname(lname);
		student.setMobile(mobile);
		student.setPass(pass);
		
		
		String userReq=request.getServletPath();
		
		
		System.out.print(userReq);
		
		switch (userReq) {
		
		
		case "/addStudent": 

			try {
				int x = 0;
				x = studentDao.saveStudent(student);
				
				System.out.print(x);
				
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else
				{
					response.sendRedirect("error.jsp");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//the required changes must be in do post method & java beans are nothing but model classes
			
			
			break;
		
		
		
		case "/updateStudEmail":
			
			try {
				int x = 0;
				x = studentDao.updateEmail(student);
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else
				{
					response.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
		
case "/deleteRecord":
			
			try {
				int x = 0;
				x = studentDao.deleteRecord(student);
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else
				{
					response.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + userReq);
		}
		
	}

}

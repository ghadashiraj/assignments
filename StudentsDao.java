package edu.students.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.students.dbase.DatabaseConnection;
import edu.students.model.Student;

public class StudentsDao {

	public static int saveStudent(Student stud) 
			throws ClassNotFoundException, SQLException
	{
		int result = 0;
		
		String insertStatement = 
		"INSERT INTO students(fname,lname,email,mobile,pass) "
		+ "VALUES(?, ?, ?, ?, ?)";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = 
					con.prepareStatement(insertStatement);
			pst.setString(1, stud.getFname());
			pst.setString(2, stud.getLname());
			pst.setString(3, stud.getEmail());
			pst.setString(4, stud.getMobile());
			pst.setString(5, stud.getPass());
			
			result = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	public static int updateEmail(Student stud) 
			throws ClassNotFoundException, SQLException
	{
		int result = 0;
		
		String updateStatement = 
		"UPDATE students SET email=? WHERE fname=?";
		Connection con = DatabaseConnection.initializeDatabase();
		
		try(con){
			PreparedStatement pst = 
					con.prepareStatement(updateStatement);
			pst.setString(1, stud.getEmail());
			pst.setString(2, stud.getFname());
	
			
			result = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static int deleteRecord(Student stud) 
			throws ClassNotFoundException, SQLException
	{
		int result = 0;
		
		String deleteStatement =
				"DELETE FROM students WHERE email=?";
		Connection con = DatabaseConnection.initializeDatabase();
		
		try(con){
			PreparedStatement pst = 
					con.prepareStatement(deleteStatement);
			pst.setString(1, stud.getEmail());
	
			result = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
//	new code
	
	public static List<Student>getStudent() throws ClassNotFoundException, SQLException{
		List<Student> studs = new ArrayList<>();
		String getStatement = "SELECT * FROM students";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(getStatement);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				String pass = rs.getString("pass");
				studs.add(new Student(id,fname,lname,email, mobile, pass));
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return studs;
	}
	
}
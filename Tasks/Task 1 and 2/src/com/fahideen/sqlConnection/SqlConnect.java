package com.fahideen.sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlConnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "3244");
			System.out.println("Sucess");
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(sql);
			
//			 while (rs.next()) 
//			 { 
//				 // Retrieve by column name 
//			 int id =rs.getInt("student_id");
//			 String name = rs.getString("student_name"); 
//			 int sal =rs.getInt("salary");
//			
//			 // Display values 
//			 System.out.println("ID is : " + id );
//			 System.out.println("Name is: " + name );
//			 System.out.println("Salary is: " + sal); }
			
			ArrayList<Student> ae = new ArrayList<Student>();
			while (rs.next()) {
			Student ee = new Student();
			ee.setId(rs.getInt("student_id"));
			ee.setName(rs.getString("student_name"));
			ee.setSalary(rs.getInt("salary"));
			ae.add(ee);
			}
			System.out.println(ae.size());
			for (int i = 0; i < ae.size(); i++) {
			System.out.println(ae.get(i).getId());
			System.out.println(ae.get(i).getName());
			System.out.println(ae.get(i).getSalary());
			}

			

		} catch (Exception e) {
         e.printStackTrace();
		}
	}
	
	

}

package com.fahideen.jdbc.PreparedStamentExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fahideen.jdbc.StatementExample.Employee;

public class Employee_execute {
	ArrayList<Employee> ae = new ArrayList<Employee>();

	public void create_Employee() throws SQLException {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
			String sql = "CREATE TABLE employee_details" + "(id int not null," + "name varchar(45) not null,"
					+ "salary varchar(45) Default NULL)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Sucessfully Created...");
		} catch (Exception e) {
			System.out.println("Table Already Exists...");
            display_Employee();
		}

	}

	public void display_Employee() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		PreparedStatement stmt=con.prepareStatement("select * from employee_details");  
		// feteching the details of the employee
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Employee ee = new Employee();
			ee.setId(rs.getInt("id"));
			ee.setName(rs.getString("name"));
			ee.setSalary(rs.getInt("salary"));
			ae.add(ee);
		}
		System.out.println("---------------------------");
		System.out.println("Table :");
		for (int i = 0; i < ae.size(); i++) {
			System.out.println(ae.get(i).getId() + " " + ae.get(i).getName() + " " + ae.get(i).getSalary());
		}
		System.out.println("---------------------------");

	}
	public void insert_Employee() throws SQLException {
//		Insert the detail of the employee
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		String sql_InsertQuery = "Insert into employee_details values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql_InsertQuery);
		ps.setInt(1, 6);
		ps.setString(2, "vijay");
		ps.setInt(3, 35000);
		int insert_result = ps.executeUpdate();
		System.out.println("Record Inserted Sucessfully : " + insert_result);
		System.out.println("After inserting :");
		display_Employee();

	}


	public ArrayList<Employee> update_Employee() throws SQLException {
//	Alter the detail of the Employee
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		String Sql_alterQuery = "update employee_details set salary=? where name=?";
		PreparedStatement ps = con.prepareStatement(Sql_alterQuery);
		ps.setInt(1, 60000);
		ps.setString(2, "Hameed");
		int update_result = ps.executeUpdate();
		System.out.println("Record updated Sucessfully : " + update_result);
		System.out.println("After update");
		display_Employee();
		return ae;
	}

	public void delete_Employee() throws SQLException {
//	Delete the detail of the Employee
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		String sql_deleteQuery = "delete from employee_details where id=6";
		PreparedStatement ps = con.prepareStatement(sql_deleteQuery);
		int delete_result = ps.executeUpdate();
		System.out.println("Record deleted Sucessfully : " + delete_result);
		System.out.println("After deleting :");
		display_Employee();


	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Employee_execute emp = new Employee_execute();
		emp.create_Employee();
//		emp.insert_Employee();
//		emp.update_Employee();
//		emp.delete_Employee();

	}

}

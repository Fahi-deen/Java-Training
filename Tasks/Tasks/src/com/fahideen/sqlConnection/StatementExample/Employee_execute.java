package com.fahideen.sqlConnection.StatementExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Employee_execute {
	 ArrayList<Employee> ae = new ArrayList<Employee>();

	public ArrayList<Employee> create_Employee() throws SQLException {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE employee_details" + "(id int not null," + "name varchar(45) not null,"
					+ "salary varchar(45) Default NULL)";
			stmt.executeUpdate(sql);
			System.out.println("Sucessfully Created...");
		} catch (Exception e) {
			System.out.println("Table Already Exists..." );
			display_Employee();
		}

		return ae;
	}

	public ArrayList<Employee> display_Employee() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		Statement stmt = con.createStatement();
		// feteching the details of the employee
		String sql = "SELECT * FROM employee_details";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			Employee ee = new Employee();
			ee.setId(rs.getInt("id"));
			ee.setName(rs.getString("name"));
			ee.setSalary(rs.getInt("salary"));
			ae.add(ee);
		}
		System.out.println("Table :");
		for (int i = 0; i < ae.size(); i++) {
			System.out.println(ae.get(i).getId() + " " + ae.get(i).getName() + " " + ae.get(i).getSalary());
		}
		System.out.println("---------------------------");
		return ae;

	}


	public ArrayList<Employee> insert_Employee() throws SQLException {
//		Insert the detail of the employee
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		Statement stmt = con.createStatement();
		String sql_InsertQuery = "Insert into employee_details values(6,'Vijay',35000)";
		int insert_result = stmt.executeUpdate(sql_InsertQuery);
		System.out.println("Record Inserted Sucessfully : " + insert_result);
		System.out.println("After inserting :");
		display_Employee();
		return ae;
	}

	public ArrayList<Employee> update_Employee() throws SQLException {
//	Alter the detail of the Employee
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		Statement stmt = con.createStatement();
		String Sql_alterQuery = "update employee_details set salary=40000 where name='Hameed'";
		int update_result = stmt.executeUpdate(Sql_alterQuery);
		System.out.println("Record updated Sucessfully : " + update_result);
		System.out.println("After update");
		display_Employee();
		return ae;
	}

	public ArrayList<Employee> delete_Employee() throws SQLException {
//	Delete the detail of the Employee
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee_db", "root", "3244");
		Statement stmt = con.createStatement();
		String sql_deleteQuery = "delete from employee_details where id=6";
		int delete_result = stmt.executeUpdate(sql_deleteQuery);
		System.out.println("Record deleted Sucessfully : " + delete_result);
		System.out.println("After deleting :");
		display_Employee();

		return ae;
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

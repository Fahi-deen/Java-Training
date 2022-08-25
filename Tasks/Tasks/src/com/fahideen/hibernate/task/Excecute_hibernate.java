package com.fahideen.hibernate.task;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Excecute_hibernate {
	public void insertEmployee(Session session) {
		Transaction tr = session.beginTransaction();
		Employee_details emp_insert = new Employee_details();
		emp_insert.setName("Siva");
		emp_insert.setSalary(80000);
		session.save(emp_insert);
		tr.commit();
		System.out.println("Employee record inserted Sucessfully..");
	}

	public void updateEmployee(Session session) {

		Transaction tr = session.beginTransaction();
		// update employee data
		Employee_details emp = session.load(Employee_details.class, 5);
		emp.setName("fahieed");
		emp.setSalary(73000);
		session.update(emp);

		System.out.println("Employee record updated Sucessfully..");
		tr.commit();
	}

	public void deleteEmployee(Session session) {
		Transaction tr = session.beginTransaction();
		Employee_details emp = new Employee_details();
		emp.setId(0);
		session.delete(emp);
		System.out.println("Employee record deleted Sucessfully..");
		tr.commit();
	}

	public void retrieveEmployee(Session session) {
		List<Employee_details> emp = session.createQuery("FROM Employee_details", Employee_details.class)
				.getResultList();
		System.out.println(emp);
		System.out.println("Database contents delivered...");
	}

	public static void main(String[] args) {
		Excecute_hibernate emp = new Excecute_hibernate();
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee_details.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
//		emp.insertEmployee(session);
		emp.retrieveEmployee(session);
//		emp.updateEmployee(session);
//		emp.deleteEmployee(session);
	
		session.close();

	}

}

package com.fahideen.hibernate.task;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class RestrictionMethodTask {
	
	public static void main(String[] args) {
		Excecute_hibernate emp = new Excecute_hibernate();
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee_details.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee_details.class);
//		 criteria.add(Restrictions.ne("salary", 40000));
//		 criteria.add(Restrictions.ge("salary", 50000));
//		 criteria.add(Restrictions.eq("salary", 40000));
//		 criteria.add(Restrictions.le("salary", 50000));
//		 criteria.add(Restrictions.like("name", "Ham", MatchMode.START));
		List<Employee_details> list=criteria.list();
		for(Employee_details em:list) {
			System.out.println(em);
		}
		session.close();
	}
}

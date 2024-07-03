package com.tka.infosysInfo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Operation {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		
		Employee employee = session.load(Employee.class, 1);
		System.out.println(employee);
		
		Criteria criteria = session.createCriteria(Employee.class);
		/*
		 * criteria.add(Restrictions.ge("employee_Salary", 100000.00)); List<Employee>
		 * list = criteria.list();
		 * 
		 * criteria.addOrder(Order.asc("employee_Salary")); List<Employee> list2 =
		 * criteria.list();
		 * 
		 * for (Employee employee2 : list) { System.out.println(employee2); }
		 * 
		 * for (Employee employee2 : list2) { System.out.println(employee2); }
		 */
		criteria.setProjection(Projections.max("employee_Salary"));
		List<Employee> list = criteria.list();
		System.out.println(list);
		
		criteria.setProjection(Projections.avg("employee_Salary"));
		List<Employee> list2 = criteria.list();
		System.out.println(list2);
		
		
		session.clear();
		session.close();
		
	}
}

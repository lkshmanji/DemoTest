package com.app.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;

import com.app.utility.Hibernatutil;

public class Client {

	public static void main(String[] args) {

		Session ses = Hibernatutil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		/*
		 * Employee e1 = new Employee(203, "raj", "raj@gmail.com"); Employee e2 = new
		 * Employee(204, "pawan", "paswan@gmail.com"); Employee e3 = new Employee(204,
		 * "pawan", "paswan@gmail.com");
		 * 
		 * System.out.println("succsefully Inserted"); ses.save(e1); ses.save(e2);
		 * ses.save(e3);
		 */

		/*
		 * Query query = (Query) ses.createQuery("from Employee").list();
		 * 
		 * System.out.println(query);
		 */

		Criteria q = ses.createCriteria(Employee.class);
		q.setFirstResult(2);
		q.setMaxResults(3);
		List<Employee> emp = q.list();

		emp.forEach(a -> System.out.println(a));
		System.out.println(emp);

		/*
		 * Query q = ses.createQuery("FROM Employee"); q.setFirstResult(2);
		 * q.setMaxResults(4); List <Employee> emp=q.list();
		 * emp.forEach(a->System.out.println(a)); System.out.println(emp);
		 */

		/*
		 * Query query = (Query) ses.createQuery("FROM Employee");
		 * query.setFirstResult(1); query.setMaxResults(3); List<Employee> entities =
		 * query.list();
		 */
		System.out.println("succsefully");
		tx.commit();

	}

}

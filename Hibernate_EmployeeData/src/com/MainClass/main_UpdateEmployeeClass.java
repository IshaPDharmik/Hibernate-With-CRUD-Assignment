package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EmployeeEntity.Employee_classEntity;

public class main_UpdateEmployeeClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee_classEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee_classEntity employee = new Employee_classEntity();

		employee.setId(5);
		employee.setName("Sanvi");
		employee.setDepartment("B-Com");
		employee.setAge(25);
		employee.setSalary(55000);
		
		// ss.merge();
		ss.update(employee);
		tr.commit();
		ss.close();

		System.out.println("Data Update Successfully..!");

	}
}

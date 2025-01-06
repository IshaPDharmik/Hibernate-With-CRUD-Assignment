package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.EmployeeEntity.Employee_classEntity;

public class main_DeleteEmployeeClass {

	
	  public static void main(String[] args) {

	        
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");  
	        cfg.addAnnotatedClass(Employee_classEntity.class);  
	        SessionFactory sf = cfg.buildSessionFactory();  
	        Session ss = sf.openSession();  
	        Transaction tr = ss.beginTransaction(); 
	        
	        
	        int id=2;
	        Employee_classEntity Employee1 = ss.get(Employee_classEntity.class,id);
	        ss.remove(Employee1);
	        tr.commit();
	        ss.close();
	        
	        System.out.println("Delete Data Successfully....!");
	    }
	}


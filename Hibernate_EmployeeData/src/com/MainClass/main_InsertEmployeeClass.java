package com.MainClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EmployeeEntity.Employee_classEntity;


public class main_InsertEmployeeClass {

    public static void main(String[] args) {

        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Employee_classEntity.class);  
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
       
        Employee_classEntity Employee = new Employee_classEntity();
        
        //Employee.setId(1);
        Employee.setAge(27);
        Employee.setName("Bittu");
        Employee.setDepartment("Civil Engineering");
        Employee.setSalary(65000);
        
        ss.persist(Employee);
        tr.commit();
        ss.close();
        
        
        System.out.println("Application started, and Employee data saved.");
     
    }
}


package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product_classEntity;

public class main_DeleteProductClass {

	
	  public static void main(String[] args) {

	        
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");  
	        cfg.addAnnotatedClass(Product_classEntity.class);  
	        SessionFactory sf = cfg.buildSessionFactory();  
	        Session ss = sf.openSession();  
	        Transaction tr = ss.beginTransaction(); 
	        
	        
	        int productId=3;
	        Product_classEntity product1 = ss.get(Product_classEntity.class,productId);
	        ss.remove(product1);
	        tr.commit();
	        ss.close();
	        
	        System.out.println("Delete Data Successfully....!");
	    }
	}


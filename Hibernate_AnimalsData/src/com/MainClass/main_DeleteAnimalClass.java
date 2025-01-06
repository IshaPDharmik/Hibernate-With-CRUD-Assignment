package com.MainClass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.AnimalEntity.Animals_classEntity;
public class main_DeleteAnimalClass {

 public static void main(String[] args) {
	
  

	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");  
	        cfg.addAnnotatedClass(Animals_classEntity.class);  
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session ss = sf.openSession();
	        Transaction tr = ss.beginTransaction();

	        
	        int animalId=5;
	        Animals_classEntity animal1 = ss.get(Animals_classEntity.class,animalId);
	        
	        ss.remove(animal1);
	        tr.commit();
	        ss.close();
	        
	        System.out.println("Delete Data Successfully...!");
	    }
}

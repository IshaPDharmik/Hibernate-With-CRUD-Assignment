package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BirdEntity.Bird_classEntity;

public class main_DeleteBirdClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bird_classEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		 int Id=1;
	        Bird_classEntity bird1 = ss.get(Bird_classEntity.class,Id);
	        
	        ss.remove(bird1);
	        tr.commit();
	        ss.close();
	        
	        System.out.println("Delete Data Successfully...!");

	}
}
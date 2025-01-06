package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BirdEntity.Bird_classEntity;


public class main_UpdateBirdClass {
	
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bird_classEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Bird_classEntity bird = new Bird_classEntity();

		
		bird.setId(9);
        bird.setColor("Brown");
        bird.setSpecies("Owl");
        bird.setWeight(11.3f);
		
		
		// ss.merge();
		ss.update(bird);
		tr.commit();
		ss.close();
		
		System.out.println("Data Update Successfully..!");

	}
}



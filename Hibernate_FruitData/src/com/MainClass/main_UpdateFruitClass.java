package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.FruitEntity.Fruit_classEntity;


public class main_UpdateFruitClass {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Fruit_classEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Fruit_classEntity fruit = new Fruit_classEntity();
        
		fruit.setId(4);
		fruit.setFruit_name("Cherry");
		fruit.setColor("Light-Red");
        fruit.setPrice(700);
        
        
		// ss.merge();
		ss.update(fruit);
		tr.commit();
		ss.close();
		
		System.out.println("Data Update Successfully..!");

	}
}


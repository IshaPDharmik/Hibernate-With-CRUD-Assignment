package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.FruitEntity.Fruit_classEntity;

public class main_InsertFruitClass {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Fruit_classEntity.class);  
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        
        Fruit_classEntity fruit = new Fruit_classEntity(); 
        
       // fruit.setId(1); 
        fruit.setFruit_name("Cherry");
        fruit.setColor("Red");
        fruit.setPrice(500); 

   
        ss.persist(fruit);
        tr.commit();

        ss.close();
        
        System.out.println("Application started, and fruit data saved.");
    }
}

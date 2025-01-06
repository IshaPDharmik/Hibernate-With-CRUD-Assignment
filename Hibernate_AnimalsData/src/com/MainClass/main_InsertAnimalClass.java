package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.AnimalEntity.Animals_classEntity;

  
public class main_InsertAnimalClass {

    public static void main(String[] args) {

        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Animals_classEntity.class);  
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        
        Animals_classEntity animal = new Animals_classEntity();
       // animal.setAnimalId(4);           
        animal.setSpecies("Elephant");        
        animal.setAge(18);                
        animal.setColor("Grey");       
        animal.setWeight(30.5f);         

       
        ss.persist(animal);
        tr.commit();   
        ss.close();    

        
        System.out.println("Application started, and animal data saved.");
    }
}

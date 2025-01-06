package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BirdEntity.Bird_classEntity;

public class main_InsertBirdClass {

    public static void main(String[] args) {

     
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Bird_classEntity.class);  
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

       
        Bird_classEntity bird = new Bird_classEntity();
       
        //bird.setId(1);
        bird.setColor("Multi-Color");
        bird.setSpecies("Macaw");
        bird.setWeight(10.3f);
        
        
        ss.persist(bird);
        tr.commit();
        ss.close();
        
        System.out.println("Application started, and bird data saved.");
        
        }
      }

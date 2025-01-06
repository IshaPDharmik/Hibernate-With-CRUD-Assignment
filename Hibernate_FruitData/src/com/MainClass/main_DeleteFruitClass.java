package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.FruitEntity.Fruit_classEntity;
public class main_DeleteFruitClass {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Fruit_classEntity.class);  
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        
        int id=2;
        Fruit_classEntity fruit1 = ss.get(Fruit_classEntity.class,id);
        
        ss.remove(fruit1);
        tr.commit();
        ss.close();
        
        System.out.println("Delete Data Successfully...!");
    }
}



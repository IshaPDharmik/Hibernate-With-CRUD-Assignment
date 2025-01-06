package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product_classEntity;



public class main_InsertProductClass {

    public static void main(String[] args) {

        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Product_classEntity.class);  
        SessionFactory sf = cfg.buildSessionFactory();  
        Session ss = sf.openSession();  
        Transaction tr = ss.beginTransaction();  

        // Create a ProductEntity instance
        Product_classEntity product = new Product_classEntity();
//        product.setProductId(2);           
        product.setPrice(60000);           
        product.setName("HPLaptop");         
        product.setCategory("Electronics");  
        product.setQuantity(250);          

        
        ss.persist(product);
        tr.commit(); 
        ss.close();  

        
        System.out.println("Application started, and product data saved.");
    }
}

package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product_classEntity;


public class main_UpdateProductClass {
	
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product_classEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Product_classEntity product = new Product_classEntity();

	    product.setProductId(2);
		product.setCategory("Electronics");
		product.setName("TV");
        product.setPrice(30000);
        product.setQuantity(300);
        
		// ss.merge();
		ss.update(product);
		tr.commit();
		ss.close();
		// s.setAge();
		// s.setname(" ");
		// s.setCity(" ");
		System.out.println("Data Update Successfully..!");

	}
}



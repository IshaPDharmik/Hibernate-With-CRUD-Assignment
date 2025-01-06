package com.MainClass;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product_classEntity;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class main_FetchProductAllData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product_classEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		CriteriaBuilder hcb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Product_classEntity> root = cq.from(Product_classEntity.class);
		cq.select(root);

		// select * from

		Query query = ss.createQuery(cq);
		List<Product_classEntity> list = query.getResultList();

		for (Product_classEntity product : list) {
			System.out.println(product);
		}
		System.out.println("Fetch Data Successfully.....!");
	}
}
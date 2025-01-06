package com.MainClass;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.AnimalEntity.Animals_classEntity;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class main_FetchAnimalAllData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Animals_classEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		CriteriaBuilder hcb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Animals_classEntity> root = cq.from(Animals_classEntity.class);
		cq.select(root);

		// select * from

		Query query = ss.createQuery(cq);
		List<Animals_classEntity> list = query.getResultList();

		for (Animals_classEntity animal : list) {
			System.out.println(animal);
		}
		System.out.println("Fetch Data Successfully.....!");
	}
}

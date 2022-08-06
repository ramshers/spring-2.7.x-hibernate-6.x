package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void run(String... args) throws Exception {
		/*
		em.getCriteriaBuilder();
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = cb.createQuery(Tuple.class);
        Root<Packages> root = query.from(Packages.class);
        
        query.where(cb.between(root.get("packageId"), 1, 10));
        
        List<Tuple> result = em.createQuery(query).getResultList();
        
        result.forEach(t -> System.out.println(t.get(0)));

		 */
	}

}

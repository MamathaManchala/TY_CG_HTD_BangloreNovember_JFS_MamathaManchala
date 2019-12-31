package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class RetriveJpql {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		//String jpql="from Movie";
		String jpql="select mName from Movie";
		
		Query query=entityManager.createQuery(jpql);

		//List<Movie> record=query.getResultList();
		List<String> record=query.getResultList();

	  // for(Movie mv:record) {
		for(String mv:record) {
			//		
			//		System.out.println("Id is-----"+mv.getMid());
			//		System.out.println("Name is----"+mv.getmName());
			//		System.out.println("Rating is----"+mv.getRating());

			System.out.println(mv);
		}
		entityManager.close();


	}
}

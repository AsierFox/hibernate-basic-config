package com.devdream.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.devdream.conf.HibernateConfiguration;
import com.devdream.entities.Pokemon;

public class App {

	public static void main(String[] args) {
		runUsingCriteria();
	}
	
	private static void runUsingCriteria() {
		HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
		
		SessionFactory sessionFactory = hibernateConfiguration.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Pokemon.class);
		
		List<Pokemon> allPokemons = criteria.list();

		session.getTransaction().commit();
		
		for (Pokemon pokemon : allPokemons) {
			System.out.println("Nombre: " + pokemon.getName());
		}
		
		session.close();
		sessionFactory.close();
	}

}

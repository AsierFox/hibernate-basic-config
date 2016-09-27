package com.devdream.conf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.devdream.entities.Pokemon;

/**
 * Can make a configuration class in hibernate instead the hibernate.cfg.xml file.
 */
public class HibernateConfiguration {

	private Configuration configuration;
	
	public HibernateConfiguration() {
		configuration = new Configuration();
		setProperties();
		setAnnotationClasses();
	}
	
	private void setProperties() {
		configuration
			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/hibernate_basic_config")
			.setProperty("hibernate.connection.username", "root")
			.setProperty("hibernate.connection.password", "root")
			
			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
			.setProperty("hibernate.show_sql", "true")
			
			.setProperty("hibernate.current_session_context_class", "thread");
	}

	private void setAnnotationClasses() {
		configuration
			.addAnnotatedClass(Pokemon.class);
	}

	public SessionFactory getSessionFactory() {
		return configuration.buildSessionFactory();
	}

}

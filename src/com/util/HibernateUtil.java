package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static SessionFactory factory;

	static {
		AnnotationConfiguration config = new AnnotationConfiguration().configure();
		factory = config.buildSessionFactory();
	}

	public static Session getSession() {
		return factory.openSession();
	}
}

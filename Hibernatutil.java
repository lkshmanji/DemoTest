package com.app.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernatutil {

	private static final SessionFactory sf;
	static {

		sf = new Configuration().configure("com/app/resource/hibernate.cfg.xml").buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return sf;
	}
}

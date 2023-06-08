package com.slokam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
			
		Configuration con = new AnnotationConfiguration();
		con.configure("hibernate.cgf.xml");
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		employeedata e = new employeedata();
		
		e.setEid(1);
		e.setEname("siva");
		e.setEsal(5236.021);
		e.setEdesg("SE");
		
		s.save(e);
		t.commit();
		s.close();
	}

}

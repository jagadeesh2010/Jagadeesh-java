package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreUserData {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();

		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		UserDetails emp = new UserDetails();//TRANSIENT
		
		emp.setUser_name("SKY");
		emp.setUser_barnch("BCC");
		emp.setUser_add("Mumbai");
		
		session.persist(emp);//PERSISTENCE
		
		
		UserDetails obj = session.find(UserDetails.class,102);
		
		System.out.print(obj.getId()+" "+obj.getUser_name()+"  "+obj.getUser_barnch()+" " +obj.getUser_add());
		obj.setUser_name("Sharama");
		obj.setUser_barnch("pwc");
		obj.setUser_add("Bangalore");
		
		session.persist(obj);  
		session.remove(obj);
		t.commit();
		
		System.out.println("Done.");
		
		session.close();//DETACHED


}
}

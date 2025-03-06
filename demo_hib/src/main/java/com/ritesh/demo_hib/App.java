package com.ritesh.demo_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Student_details s2 = new Student_details();
        s2.setRoll_no(1005);
        s2.setName("adarsh");
        s2.setAddress("chandigarh");
        s2.setPhone_number("7223060643");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.ritesh.demo_hib.Student_details.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s2);
        transaction.commit();
    }
}


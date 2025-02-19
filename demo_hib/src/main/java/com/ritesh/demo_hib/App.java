package com.ritesh.demo_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student();
        s1.setId(1002);
        s1.setName("anmol");
        s1.setTech("java_script");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.ritesh.demo_hib.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s1);
        transaction.commit();
    }
}


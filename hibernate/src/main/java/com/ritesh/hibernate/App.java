package com.ritesh.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.ritesh.hibernate.Train_status_data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Train_status_data t1 = new Train_status_data();
        t1.setTrain_number(1002);
        t1.setTrain_depature("11:00");
        t1.setTrain_arrival("11:25");
        t1.setJourney_timming("8:00");
        t1.setSeat_availability("No");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.ritesh.hibernate.Train_status_data.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(t1);
        transaction.commit();
    }
}

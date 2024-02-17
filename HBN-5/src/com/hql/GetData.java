package com.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/*
 * @author Sohan_Maali
 */
public class GetData {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //All Data
        /*
        String query = "From Student";
        Query q = session.createQuery(query);
        List<Student> list = q.list();

        for (Student s : list) {
            System.out.println(s.getName() + "       " + s.getRoll() + "       " + s.getFname());
        }
         */

        //Get One Data
//        String query = "From Student where name = :x and roll =:i";
//        Query q = session.createQuery(query);
//        q.setParameter("x", "Ankit");
//        q.setParameter("i", 105);
//
//        List<Student> list = q.list();
//        for (Student s : list) {
//            System.out.println(s.getName() + "       " + s.getRoll() + "       " + s.getFname());
//        }


        //Update Data
//        String query1 = "Update Student set fname = :fname where id =:id";
//        Query q1 = session.createQuery(query1);
//        q1.setParameter("fname", "Ramniwash");
//        q1.setParameter("id", 5);
//        int i = q1.executeUpdate();
//        System.out.println("row Update = " + i);
//        String query = "From Student where name = :x and roll =:i";
//        Query q = session.createQuery(query);
//        q.setParameter("x", "Ankit");
//        q.setParameter("i", 105);
//        List<Student> list = q.list();
//        for (Student s : list) {
//            System.out.println(s.getName() + "       " + s.getRoll() + "       " + s.getFname());
//        }


        //Delete Data
        String query1 = "Delete from Student where name = :x";
        Query q1 = session.createQuery(query1);
        q1.setParameter("x", "Ankit");
        q1.executeUpdate();
        tx.commit();

        String query = "From Student";
        Query q = session.createQuery(query);
        List<Student> list = q.list();
        for (Student s : list) {
            System.out.println(s.getName() + "       " + s.getRoll() + "       " + s.getFname());
        }

        session.close();
        sf.close();
    }
}

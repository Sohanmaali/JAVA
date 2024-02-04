package com.sohan.test;

import com.sohan.pojo.Student;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class CreateTable {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student st = new Student(10, 100, "SOHAN", "KAMAL");

        session.save(st);
        tx.commit();
        session.close();
        sf.close();
    }
}

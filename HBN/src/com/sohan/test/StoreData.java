package com.sohan.test;

import com.sohan.pojo.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author Sohan_Maali
 */
public class StoreData {

    public static void main(String[] args) {
        System.out.println("kjfdnkj");
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Employee emp = new Employee();
        emp.setId(40);
        emp.setName("aana");
        emp.setFather("dinesh");
        System.out.println(session.save(emp));
        tx.commit();
        System.out.println("Employee inserted Succ");
        session.close();
        sf.close();
    }
}

package com.sohan.test;

import com.sohan.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

    public static void main(String[] args) {
        System.out.println("kjfdnkj");
        Configuration con = new Configuration();
        con.configure();

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Employee emp = new Employee("ROHAN", "KAMAL");
        int x = (int) session.save(emp);
        System.out.println("===============Employee ID: " + x); // Print the generated ID
        tx.commit();

        sf.close(); // Close the SessionFactory

        System.out.println("============================");
    }
}

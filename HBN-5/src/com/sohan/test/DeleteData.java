package com.sohan.test;

import com.sohan.pojo.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class DeleteData {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Employee emp = new Employee();
        emp.setId(40);
        session.delete(emp);
        tx.commit();
        session.close();
        sf.close();
        System.out.println("suseess");
    }
}

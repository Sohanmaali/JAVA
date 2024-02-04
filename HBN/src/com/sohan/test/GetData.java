package com.sohan.test;

import com.sohan.pojo.Employee;
//import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author Sohan_Maali
 */
public class GetData {
//Not Working

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        List<Employee> result = session.createQuery("FROM Employee", Employee.class).list();

        Employee emp = (Employee) session.get(Employee.class, Long.valueOf(10));
        tx.commit();
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getFather());
    }
}

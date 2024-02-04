package com.sohan.test;

import com.sohan.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class RetrieveAllData {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure();

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        // Using HQL to retrieve all data from the Employee table
        String hql = "FROM Employee";
        List<Employee> employees = session.createQuery(hql, Employee.class).list();
        // Process and print all retrieved data
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("First Name: " + employee.getName());
            System.out.println("Last Name: " + employee.getFather());
            System.out.println("===============");
        }
        session.getTransaction().commit();

        session.close();
        sf.close();
    }
}

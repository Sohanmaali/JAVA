package com.sohan.test;

import com.sohan.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure();

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        // Using get method to retrieve an employee by ID
        Employee employeeGet = session.get(Employee.class, 10);

        // Using load method to retrieve an employee by ID
        Employee employeeLoad = session.load(Employee.class, 20);

        // Process the retrieved data using get method
        if (employeeGet != null) {
            System.out.println("Employee ID (using get): " + employeeGet.getId());
            System.out.println("First Name: " + employeeLoad.getName());
            System.out.println("Last Name: " + employeeLoad.getFather());
            System.out.println("===============");
        } else {
            System.out.println("Employee not found using get.");
        }
        // Process the retrieved data using load method
        if (employeeLoad != null) {
            System.out.println("Employee ID (using load): " + employeeLoad.getId());
            System.out.println("First Name: " + employeeLoad.getName());
            System.out.println("Last Name: " + employeeLoad.getFather());
            System.out.println("===============");
        } else {
            System.out.println("Employee not found using load.");
        }
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}

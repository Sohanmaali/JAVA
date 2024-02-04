/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package my.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sohan_Maali
 */
public class MyHibernate {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("Start");
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student st = new Student("Sohan", "Kamal", "Uma");
        
        Address ad = new Address();
        ad.setCity("indore");
        ad.setDate(new Date());
        ad.setIsopean(true);
        ad.setStreet("Mari Mata");
        ad.setX(52.3);
//        FileInputStream fis = new FileInputStream("src/my/hibernate/IMG_20231227_084114_179");
//        byte[] image = new byte[fis.available()];
//        fis.read(image);
//        ad.setImage(image);
        
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        sf.close();
        System.out.println("End");
    }

}

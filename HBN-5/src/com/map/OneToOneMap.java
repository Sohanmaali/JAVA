package com.map;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/* 
 * @author Sohan_Maali
 */
public class OneToOneMap {

    public static void main(String[] args) {
        OneToMany();
    }

    public static void oneToOne() {

        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Question q = new Question();
        q.setqId(10);
        q.setQuestion("What is java");
        Answer ans = new Answer();
        ans.setAnsId(1);
        ans.setAns("Java is a Programin language");
        ans.setQ(q);
        session.save(q);
        session.save(ans);
        //        ===========Retrive Data===========
        Question q1 = session.get(Question.class, 10);
        System.out.println(q1.getQuestion());
//        System.out.println(q1.getAns());
        session.close();
        sf.close();
    }

    public static void OneToMany() {
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Question q = new Question();
        q.setqId(10);
        q.setQuestion("What is java");

        List<Answer> list = new ArrayList<>();

        Answer ans = new Answer();
        ans.setAnsId(1);
        ans.setAns("Java is a Programin language");
        ans.setQ(q);
        list.add(ans);

        Answer ans1 = new Answer();
        ans1.setAnsId(2);
        ans1.setAns("Java is a Roberst Language");
        ans1.setQ(q);
        list.add(ans1);

        q.setAns(list);
        Transaction tx = session.beginTransaction();

        session.save(q);
        session.save(ans);
        session.save(ans1);
        tx.commit();
//==================================
        Question q1 = session.get(Question.class, 10);
        System.out.println(q1.getQuestion());
        for (Answer a : q1.getAns()) {
            System.out.println(a.getAns());
        }
        session.close();
        sf.close();
    }
}

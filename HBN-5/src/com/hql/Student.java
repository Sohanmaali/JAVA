package com.hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Sohan_Maali
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private int roll;
    private String name;
    private String fname;

    public Student() {
        super();
    }

    public Student(int roll, String name, String fname) {
        this.roll = roll;
        this.name = name;
        this.fname = fname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}

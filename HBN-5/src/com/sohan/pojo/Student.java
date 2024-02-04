package com.sohan.pojo;

/**
 *
 * @author Sohan_Maali
 */
public class Student {

    private int id;
    private int roll;
    private String name;
    private String fname;

    public Student() {
        super();
    }

    public Student(int id, int roll, String name, String fname) {
        this.id = id;
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

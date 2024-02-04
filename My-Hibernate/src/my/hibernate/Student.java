/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.hibernate;

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

    private String name;
    private String father;
    private String mother;

    public Student() {
        super();
    }

    public Student(String name, String father, String mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", father=" + father + ", mother=" + mother + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvcproject.model;

/**
 *
 * @author Sohan_Maali
 */
public class EmpRegiDao {

    private int id;
    private String name, father, email, mobile, Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public EmpRegiDao(int id, String name, String father, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.father = father;
        this.email = email;
        this.mobile = mobile;
    }

    public EmpRegiDao() {

    }

    public int getId() {
        return this.id;
    }

    public int setId(int id) {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return this.father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

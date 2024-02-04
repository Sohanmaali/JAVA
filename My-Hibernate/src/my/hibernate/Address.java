/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.hibernate;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Sohan_Maali
 */
@Entity
@Table(name = "Student_Address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_Id")
    private int addId;

    @Column(name = "Street", length = 30)
    private String street;

    @Column(name = "City", length = 30)
    private String city;

    @Column(name = "Is_open")
    private boolean isopean;

    @Transient
    private double x;

    @Column(name = "Date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;

    @Lob
    @Transient
    private byte[] image;

    public Address(String street, String city, boolean isopean, double x, Date date, byte[] image) {
        this.street = street;
        this.city = city;
        this.isopean = isopean;
        this.x = x;
        this.date = date;
        this.image = image;
    }

    public Address() {
        super();
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsopean() {
        return isopean;
    }

    public void setIsopean(boolean isopean) {
        this.isopean = isopean;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" + "addId=" + addId + ", street=" + street + ", city=" + city + ", isopean=" + isopean + ", x=" + x + ", date=" + date;
    }

}

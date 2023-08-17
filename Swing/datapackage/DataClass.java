package datapackage;
import javax.swing.*;
import java.util.Properties;
import java.io.*;

public class DataClass implements Serialization// POJO Class
{
	private String name;
	private String fname;
	private String mname;
	private int sem;
	private String branch;
	private String corse;
	private int year;
	private int total;
	private int roll;
	private int physics;
	private int chemistry;
	private int math;
	private int hindi;
	private int english;
	private double per;

	public DataClass() {
	}

	public DataClass(String name, String fname, String mname, int sem, String branch, String corse, int year, int roll,
			int physics, int chemistry, int math, int hindi, int english) {
		this.name = name;
		this.fname = fname;
		this.mname = mname;
		this.sem = sem;
		this.branch = branch;
		this.corse = corse;
		this.year = year;
		this.roll = roll;
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
		this.hindi = hindi;
		this.english = english;
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

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCorse() {
		return corse;
	}

	public void setCorse(String corse) {
		this.corse = corse;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	@Override
    public String toString() {
        return name + "\t " + hindi + "\t " + english + "\t "  + math + "\t " + chemistry + "\t " + roll;
    }
}
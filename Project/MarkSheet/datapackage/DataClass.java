package datapackage;

public class DataClass // POJO Class
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

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFatherName(String fname) {
		this.fname = fname;
	}

	public void setMotherName(String mname) {
		this.mname = mname;
	}

	public void setCorse(String corse) {
		this.corse = corse;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public void setTotel() {
		this.total = this.getphysics() + this.getchemistry() + this.getmath() + this.gethindi() + this.getenglish();
	}

	public void setPer() {
		this.per = this.getTotal() / 5.0;
	}

	public int getRollNumber() {
		return this.roll;
	}

	public String getName() {
		return this.name;
	}

	public String getFName() {
		return this.fname;
	}

	public String getMName() {
		return this.mname;
	}

	public String getCorse() {
		return this.corse;
	}

	public String getBranch() {
		return this.branch;
	}

	public int getSem() {
		return this.sem;
	}

	public int getYear() {
		return this.year;
	}

	public int getphysics() {
		return this.physics;
	}

	public int getchemistry() {
		return this.chemistry;
	}

	public int getmath() {
		return this.math;
	}

	public int gethindi() {
		return this.hindi;
	}

	public int getenglish() {
		return this.english;
	}

	public double getPer() {
		return this.per;
	}

	public int getTotal() {
		return this.total;
	}
}
package datapackage;

public class DataClass implements Serialization // POJO Class
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
    private String dob;
    private String gender;
    private String mobileNumber;
    private String gmail;
    private String streetAdd;
    private String block;
    private String distric;
    private String state;
    private String zip;
    private String userName;
    private String password;

    public DataClass() {
    }

    public DataClass(String name, String fname, String mname, int sem, String branch, String corse, int year, int roll, int physics, int chemistry, int math, int hindi, int english, int total) {

        this.name = name;
        this.fname = fname;
        this.mname = mname;
        this.sem = sem;
        this.branch = branch;
        this.corse = corse;
        this.year = year;
        this.total = total;
        this.roll = roll;
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;
        this.hindi = hindi;
        this.english = english;
    }

    public DataClass(String name, String fname, String mname, int sem, String branch, String corse, int year, int total, int roll, int physics, int chemistry, int math, int hindi, int english, double per, String dob, String gender, String mobileNumber, String gmail, String streetAdd, String block, String distric, String state, String zip, String userName, String password) {
        this.name = name;
        this.fname = fname;
        this.mname = mname;
        this.sem = sem;
        this.branch = branch;
        this.corse = corse;
        this.year = year;
        this.total = total;
        this.roll = roll;
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;
        this.hindi = hindi;
        this.english = english;
        this.per = per;
        this.dob = dob;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.gmail = gmail;
        this.streetAdd = streetAdd;
        this.block = block;
        this.distric = distric;
        this.state = state;
        this.zip = zip;
        this.userName = userName;
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getStreetAdd() {
        return streetAdd;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}

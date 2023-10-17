package databaseconnect;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataBaseConnect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //System.out.println(checkRegistrationNumber(7));
        //System.out.println(DataBaseConnect.removeStudentData(1003, 504));
    }

    public static void showAllStudent(DefaultTableModel model) throws ClassNotFoundException, SQLException {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

            String sql = "SELECT * FROM marks";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            String sql1 = "SELECT * FROM stregistration";

            PreparedStatement ps1 = con.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
            // int roll = 0;

            while (rs.next() && rs1.next()) {
                // roll = rs.getInt(1);
                model.addRow(new Object[]{rs.getInt(1), rs1.getInt(1), rs1.getString(2),
                    rs1.getString(3), rs1.getString(4)});
            }

        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Exception");
            }
        }
    }

    public static void showAllRegistration(DefaultTableModel model) throws ClassNotFoundException, SQLException {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

            String sql = "SELECT * FROM stregistration";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                model.addRow(new Object[]{rs.getInt(1), rs.getString(2) + " " + rs.getString(3), rs.getString(4),
                    rs.getString(5)});
            }

        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Exception");
            }
        }
    }

    public static void storePersnalData(String name, String lname, String father, String mother, String dob, String course, String gender, String mobile, String gmail) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        gender = "male";
        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(path, "root", "root");
        String sql = "insert into stregistration(firstame,lastname,father,mother,dob,course,gender,mobile,gmail) values('" + name + "','" + lname + "','" + father + "','" + mother + "','" + dob + "','" + course + "','" + gender + "','" + mobile + "','" + gmail + "')";

        st = con.prepareStatement(sql);

        st.executeUpdate();

        con.close();
    }

    public static void storeAddress(String address, String block, String distric, String state, String zip, String gmail) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;

        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(path, "root", "root");

        String sql1 = "SELECT registration_num FROM stregistration where gmail = ?";

        PreparedStatement ps = con.prepareStatement(sql1);
        ps.setString(1, gmail);
        ResultSet rs = ps.executeQuery();

        rs.next();

        String sql = "insert into address values(" + rs.getInt(1) + ",'" + address + "','" + block + "','" + distric + "','" + state + "','" + zip + "')";

        st = con.prepareStatement(sql);

        st.executeUpdate();
        con.close();
    }

    public static void storeIdPassword(String id, String password, String gmail) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;

        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql1 = "SELECT registration_num FROM stregistration where gmail = ?";

        PreparedStatement ps = con.prepareStatement(sql1);
        ps.setString(1, gmail);
        ResultSet rs = ps.executeQuery();

        rs.next();

        String sql = "insert into idpass values(" + rs.getInt(1) + ",'" + id + "','" + password + "')";
        System.out.println(sql);
        st = con.prepareStatement(sql);
        st.executeUpdate();
        con.close();
    }

    public static boolean checkUserIDPassword(String id, String password) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from idpass where id = '" + id + "'";

        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        rs.next();
        try {
            return id.equals(rs.getString(2)) && password.equals(rs.getString(3));
        } catch (SQLException e) {
            return false;
        }
        //  return true;
    }

    public static boolean checkUserID(String id) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from idpass where id = ?";

        st = con.prepareStatement(sql);
        st.setString(1, id);
        rs = st.executeQuery();

        rs.next();
        try {
            return id.equals(rs.getString(2));
        } catch (SQLException e) {
            return false;
        }
        //  return true;
    }

    public static boolean checkAdminIDPassword(String id, String password) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from adminidpass where id = '" + id + "'";

        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        rs.next();
        try {
            return id.equals(rs.getString(1)) && password.equals(rs.getString(2));

        } catch (SQLException e) {

            return false;
        } finally {
            con.close();
        }
    }

    public static boolean checkRollNumber(int roll) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;                           //not complide

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from marks where rollnumber = '" + roll + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));
            return true;     //if roll Number is Exist t
        } catch (SQLException e) {
            return false; //if roll Number is  not Exist give error and return false
        } finally {
            con.close();
        }
    }

    public static boolean checkRegistrationNumberSTRegi(int regi) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs = null;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from stregistration where registration_num = '" + regi + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getString(1));
            return true;         //if Registration Number is Exist t
        } catch (SQLException e) {
            System.out.println(e);
            return false;  //if Registration Number is  not Exist give error and return false
        } finally {
            con.close();
        }
    }

    public static int storeMarks(int roll, int regi, int physics, int chemestry, int math, int hindi, int english) {

        PreparedStatement ps = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        Connection con = null;
        String cmd = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

//            UPDATE table_name
//            SET column1 = value1, column2 = value2, ...
//WHERE condition;
            cmd = "UPDATE marks SET physics = ?,chemistry = ?, math = ?,english = ?,hindi = ? WHERE rollnumber = " + roll;
            System.out.println(cmd);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            ps = con.prepareStatement(cmd);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {

            ps.setInt(1, physics);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {

            ps.setInt(2, chemestry);
        } catch (SQLException e) {
            System.out.println(e);

        }
        try {

            ps.setInt(3, math);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {

            ps.setInt(4, english);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("4");
        }
        try {

            ps.setInt(5, hindi);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            return ps.executeUpdate();

        } catch (SQLException e) {
            return 0;
        } finally {
            try {

                con.close();

            } catch (SQLException ex) {
                // Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static boolean checkMarksExist(int roll) throws ClassNotFoundException, SQLException {

        PreparedStatement st;
        Connection con;
        ResultSet rs;
        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from marks where rollnumber = '" + roll + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getInt(4));
            return rs.getInt(4) > 0; //if Marks is Existt
        } catch (SQLException e) {
            return false; //if Marks is  not Exist give error and return false
        } finally {
            con.close();
        }
    }

    public static int ganrateRollNumber(int regi) {

        PreparedStatement ps = null;
        Connection con = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

        } catch (SQLException e) {
        }

        String cmd = "insert into marks(registration_num) values(?)";
        try {

            ps = con.prepareStatement(cmd);

            ps.setInt(1, regi);
        } catch (SQLException e) {

        }

        int i = 0;
        try {
            return ps.executeUpdate();
        } catch (SQLException | NullPointerException e) {
            return -1;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void showByName(DefaultTableModel model, String name) {

        Connection con = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        PreparedStatement ps;
        PreparedStatement ps1 = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

        } catch (SQLException e) {
        }

        String sql = "SELECT * FROM marks";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (SQLException e) {
        }

        String sql1 = "SELECT * FROM stregistration where firstame like '%" + name + "%'";

        try {
            ps1 = con.prepareStatement(sql1);

            rs1 = ps1.executeQuery();
        } catch (SQLException e) {
        }
        try {
            while (rs.next() && rs1.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs1.getInt(1), rs1.getString(2),
                    rs1.getString(3), rs1.getString(4)});
            }
        } catch (SQLException ex) {

        }
        try {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Exception");
            }
        }
    }

    public static boolean getMarks(int registration) {

        PreparedStatement st = null;
        Connection con = null;
        ResultSet rs = null;
        String path = "jdbc:mysql://localhost:3306/marksheet";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(path, "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM marks WHERE registration_num = ?";
        try {
            st = con.prepareStatement(sql);
        } catch (SQLException ex) {

        }
        try {
            System.out.println("------------------");
            st.setInt(1, registration);
            rs = st.executeQuery();
        } catch (SQLException ex) {

        }
        try {
            System.out.println("------------------");
            rs.next();
            System.out.println("//////////////////");
            System.out.println(rs.getInt(3));
            return true;
        } catch (SQLException ex) {
            //  Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }
    }

    public static int getRegistrationId(String userId) {

        PreparedStatement st = null;
        Connection con = null;
        ResultSet rs = null;
        String path = "jdbc:mysql://localhost:3306/marksheet";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(path, "root", "root");

        } catch (SQLException ex) {
            //   Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = " SELECT registration_num FROM idpass WHERE  id = '" + userId + "'";
        try {
            st = con.prepareStatement(sql);

        } catch (SQLException ex) {

        }
        try {
            //   st.setString(1, userId);
            rs = st.executeQuery();

        } catch (SQLException ex) {

        }
        try {
            rs.next();
            return rs.getInt(1);
        } catch (SQLException ex) {
            //  Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }
    }

    public static int getRollNumber(int regi) {

        PreparedStatement st = null;
        Connection con = null;
        ResultSet rs = null;
        String path = "jdbc:mysql://localhost:3306/marksheet";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(path, "root", "root");

        } catch (SQLException ex) {
            //Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = " SELECT rollnumber FROM marks WHERE  registration_num = " + regi + "";
        try {
            st = con.prepareStatement(sql);

        } catch (SQLException ex) {

        }
        try {
            //   st.setString(1, userId);
            rs = st.executeQuery();

        } catch (SQLException ex) {

        }
        try {
            rs.next();

            return rs.getInt(1);
        } catch (SQLException ex) {
            //  Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }
    }

    public static int StudentDataUpdate(String update, String updateValue, int roll, int regiNum) {
        PreparedStatement ps = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        Connection con = null;
        String cmd = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

//            cmd = "UPDATE marks SET physics = ? WHERE rollnumber = " + roll;
            //System.out.println(cmd);
        } catch (SQLException e) {
            System.out.println(e);
        }
        switch (update) {
            case "Name" -> {

                cmd = "UPDATE stregistration SET firstame = ? WHERE registration_num = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, regiNum);
                } catch (SQLException ex) {

                }
            }
            case "Last Name" -> {

                cmd = "UPDATE stregistration SET lastname = ? WHERE registration_num = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, regiNum);
                } catch (SQLException ex) {

                }
            }
            case "Father Name" -> {
                cmd = "UPDATE stregistration SET father = ? WHERE registration_num = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, regiNum);
                } catch (SQLException ex) {

                }
            }
            case "Mother Name" -> {
                cmd = "UPDATE stregistration SET mother = ? WHERE registration_num = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, regiNum);
                } catch (SQLException ex) {

                }
            }
            case "Mobile" -> {
                cmd = "UPDATE stregistration SET mobile = ? WHERE registration_num = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, regiNum);
                } catch (SQLException ex) {

                }
            }
            case "Hindi" -> {
                cmd = "UPDATE marks SET hindi = ? WHERE rollnumber = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, roll);
                } catch (SQLException ex) {
                }
            }
            case "English" -> {
                cmd = "UPDATE marks SET english = ? WHERE rollnumber = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, roll);
                } catch (SQLException ex) {
                }
            }
            case "Mathes" -> {
                cmd = "UPDATE marks SET math = ? WHERE rollnumber = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, roll);
                } catch (SQLException ex) {
                }
            }
            case "Physics" -> {
                cmd = "UPDATE marks SET physics = ? WHERE rollnumber = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, roll);
                } catch (SQLException ex) {
                }
            }
            case "Chemestry" -> {
                cmd = "UPDATE marks SET chemistry = ? WHERE rollnumber = ?";
                try {
                    ps = con.prepareStatement(cmd);
                    ps.setString(1, updateValue);
                    ps.setInt(2, roll);
                } catch (SQLException ex) {
                }
            }
        }

        try {
            return ps.executeUpdate();

        } catch (SQLException e) {
            return 0;
        } finally {
            try {

                con.close();

            } catch (SQLException ex) {
                // Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static int removeStudentData(int roll, int regi) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

            String sql = "delete from marks where rollnumber = ?";
            String sql1 = "delete from stregistration where registration_num = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, roll);
            ResultSet rs = ps.executeQuery();

            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, regi);
            ResultSet rs1 = ps1.executeQuery();

        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Exception");
            }
        }
        return 0;
    }
}

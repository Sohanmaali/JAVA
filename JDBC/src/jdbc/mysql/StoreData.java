package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class StoreData {

    public static void main(String[] args)  {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
        String quary = "INSERT INTO student VALUES(?,?,?,?)"; //insert into Emp values(
        PreparedStatement st = con.prepareStatement(quary);
        st.setInt(1, 101);
        st.setString(2, "Mohan");
        st.setString(3, "Kamal");
        st.setInt(4, 100);
        if (st.executeUpdate() > 0) {
            System.out.println("Data Insert Success");
        } else {
            System.out.println("Data Insert Fail");
        }
        }
        catch(ClassNotFoundException| SQLException e)
                {System.out.println(e);}
    }
}

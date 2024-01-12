package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Sohan_Maali
 */
public class CreateTable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mySql.cj.jdbc.Driver"); //com.mysql.cj.jdbc.Driver
//jdbc:mysql://localhost:3306/Infojava
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
        Statement st = con.createStatement();
        int i = st.executeUpdate("create table Student (roll int, name varchar (20),father varchar(20), mark int)");
        if(i>0)
        {
            System.out.println("Tabel Created");
        }else
        {
            System.out.println("Tabel not Create");
        }
        
    }
}

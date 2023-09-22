
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mohan_Maali
 */
class IPADD {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        // Getting the connection
        // String host = "jdbc:mysql://ipAddress:192.168.43.228:3306/temp?useSSL=false";
        //
        String host = "jdbc:mysql://localhost:3306/mphan";

        Connection con = DriverManager.getConnection(host, "root", "root");

        System.out.println("Connection Succesfull......");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO tem VALUES(2,'sohan')");

        // InputStream in = new FileInputStream( "D:/sohan/mohan.jpg");
        // pstmt.setBlob(1, in);
        // Executing the statement
        pstmt.executeUpdate();
        System.out.println("Record inserted......");

    }

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.net.InetAddress;
import java.net.UnknownHostException;


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
    public static void main(String[] args) throws ClassNotFoundException, SQLException, UnknownHostException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());
        System.out.println(" Getting the connection");
        String host = "jdbc:mysql://127.0.0.1:3306/mohan?useSSL=false";

//        String host = "jdbc:mysql://localhost:3306/mohan";
        Connection con = DriverManager.getConnection(host, "root", "root");

        System.out.println("Connection Succesfull......");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO tem VALUES(3,'rohan')");

        // InputStream in = new FileInputStream( "D:/sohan/mohan.jpg");
        // pstmt.setBlob(1, in);
        // Executing the statement
        pstmt.executeUpdate();
        System.out.println("Record inserted......");

    }

}

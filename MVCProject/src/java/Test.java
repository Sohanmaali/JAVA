import com.mvcprojectdb.services.GetConnection;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class RegistrationDto {

       private static SecretKeySpec secretKey;
    private static byte[] key;
   public boolean login(RegistrationDao dao) {
    Connection con = GetConnection.getConnectin();
    boolean b = false;
    ResultSet rs = null;
    if (con != null) {
        String sql = "select * from Registration where email = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dao.getEmail());
            rs = ps.executeQuery();
            if (rs.next()) {
                String encryptedPasswordFromDB = rs.getString("password"); // Get the encrypted password from the database
                String decryptedPassword = decrypt(encryptedPasswordFromDB); // Decrypt the password from the database
                if (decryptedPassword.equals(dao.getPassword())) { // Compare the decrypted password with the input password
                    b = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return b;
}

    public boolean registration(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "insert into Registration (name,father,email,mobile,password) values (?,?,?,?,?)";
            try {
                String encryptedPassword=encrypt(dao.getPassword());
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getName());
                ps.setString(2, dao.getFather());
                ps.setString(3, dao.getEmail());
                ps.setString(4, dao.getMobile());
                ps.setString(5,encryptedPassword );
                System.out.println("---------1-------------------");
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }


     public static void setKey(String myKey) {
        try {
            key = myKey.getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); // use only first 128 bit
            secretKey = new SecretKeySpec(key, "AES");
        } catch (Exception e) {
            e.printStackTrace();
         }
    }

    public static String encrypt(String strToEncrypt) {
        try {
            setKey("encryptionKey"); // You can modify the encryption key here
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public static String decrypt(String strToDecrypt) {
        try {
            setKey("encryptionKey"); // You can modify the encryption key here
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
//            System.out.println("Input length: " + strToDecrypt.length()); // Log the length of the input string
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}
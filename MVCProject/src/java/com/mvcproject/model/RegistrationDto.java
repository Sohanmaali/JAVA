package com.mvcproject.model;

import static com.mvcproject.model.RegistrationDto.decrypt;
import com.mvcprojectdb.services.GetConnection;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
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
                    dao.setId(rs.getInt(1));
                    dao.setName(rs.getString(2));
                    dao.setFather(rs.getString(3));
                    dao.setEmail(rs.getString(4));
                    dao.setMobile(rs.getString(5));
                    dao.setPassword(rs.getString(6));
//                    String encryptedPasswordFromDB = rs.getString("password"); // Get the encrypted password from the database
//                    String decryptedPassword = decrypt(encryptedPasswordFromDB); // Decrypt the password from the database
//                    if (decryptedPassword.equals(dao.getPassword())) { // Compare the decrypted password with the input password
                    b = true;
//                    }
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
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getName());
                ps.setString(2, dao.getFather());
                ps.setString(3, dao.getEmail());
                ps.setString(4, dao.getMobile());
                ps.setString(5, dao.getPassword());
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean updateProfile(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "UPDATE Registration SET name =  ?,father =  ?,email =?, mobile =?, password =? WHERE  email =  ? ";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getName());
                ps.setString(2, dao.getFather());
                ps.setString(3, dao.getEmail());
                ps.setString(4, dao.getMobile());
                ps.setString(5, dao.getPassword());
                ps.setString(6, dao.getEmail());
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean changePassword(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "update Registration set password = ? where email = ? and password = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getPassword());
                ps.setString(2, dao.getEmail());
                ps.setString(3, dao.getPassword());
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean changeName(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "update Registration set name = ? where email = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getName());
                ps.setString(2, dao.getEmail());
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean changeFather(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "update Registration set father = ? where email = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getFather());
                ps.setString(2, dao.getEmail());
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean changeMobile(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "update Registration set mobile = ? where email = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getMobile());
                ps.setString(2, dao.getEmail());
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean changeEmail(RegistrationDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "update Registration set email = ? where email = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getEmail());
                ps.setString(2, dao.getEmail());
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
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
        }
    }

    public static String encrypt(String strToEncrypt) {
        try {
            setKey("encryptionKey"); // You can modify the encryption key here
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
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
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}

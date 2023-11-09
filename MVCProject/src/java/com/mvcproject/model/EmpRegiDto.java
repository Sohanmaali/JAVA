/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvcproject.model;

import static com.mvcproject.model.RegistrationDto.decrypt;
import com.mvcprojectdb.services.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sohan_Maali
 */
public class EmpRegiDto {

    public boolean login(EmpRegiDao dao) {
        Connection con = GetConnection.getConnectin();
        boolean b = false;
        ResultSet rs = null;
        if (con != null) {
            String sql = "select * from EmployeeRegi where email = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dao.getEmail());
                rs = ps.executeQuery();
                if (rs.next()) {
//                    String encryptedPasswordFromDB = rs.getString("password"); // Get the encrypted password from the database
//                    String decryptedPassword = decrypt(encryptedPasswordFromDB); // Decrypt the password from the database
//                    if (decryptedPassword.equals(dao.getPassword())) { // Compare the decrypted password with the input password
                    dao.setId(rs.getInt(1));
                    dao.setName(rs.getString(2));
                    dao.setFather(rs.getString(3));
                    dao.setEmail(rs.getString(4));
                    dao.setMobile(rs.getString(5));
                    dao.setPassword(rs.getString(6));
                    b = true;
//                    }
                }
            } catch (SQLException e) {
            }
        }
        return b;
    }

    public boolean registration(EmpRegiDao dao) {
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            String sql = "insert into EmployeeRegi (name,father,email,mobile,password) values (?,?,?,?,?)";
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
}

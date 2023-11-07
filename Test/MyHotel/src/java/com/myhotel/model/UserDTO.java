package com.myhotel.model;

import com.myhotel.service.GetConnection;
import java.sql.*;

public class UserDTO {

    public boolean Login(UserDAO udao) {

        boolean b = false;

        Connection con = GetConnection.getConnection();

        String query = "select * from userinfo where username =? AND pasword =?";

        if (con != null) {

            try {
                PreparedStatement ps = con.prepareStatement(query);

                ps.setString(1, udao.getUserName());
                ps.setString(2, udao.getPassword());
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    b = true;
                }

            } catch (SQLException e) {

                b = false;
            }

        }
        return b;
    }

//    ========data inser===============
    public boolean insert(UserDAO udao) {
        Connection con = GetConnection.getConnection();
        String query = "insert into userinfo (name,username, email,mobile,gender, password) values(?,?,?,?,?,?)";
        boolean result = false;

        if (con != null) {
            try {

                PreparedStatement ps = con.prepareStatement(query);

                System.out.println(udao.getName());

                ps.setString(1, udao.getName());
                ps.setString(2, udao.getUserName());
                ps.setString(3, udao.getEmail());
                ps.setString(4, udao.getMobile());

                ps.setString(5, udao.getGender());
                ps.setString(6, udao.getPassword());

                if (ps.executeUpdate() > 0) {

                    result = true;
                }

            } catch (SQLException e) {

                System.out.println(e);
                result = false;
            }

        }

        return result;
    }

}

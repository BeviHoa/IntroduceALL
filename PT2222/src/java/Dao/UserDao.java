/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hongd
 */
public class UserDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs =null;
    
    public User login(String acc, String pass){
        String query = "Select * from Account where accountid = ? and password = ? ";
        try {
            conn = new DBContext.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, acc);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new User(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("Connection error! "+e);
        }
        return null;
    }
    public static void main(String[] args) {
        Dao.UserDao dao = new UserDao();
        User a = dao.login("mra", "mrb");
        System.out.println(a.getAccountid());
    }
}

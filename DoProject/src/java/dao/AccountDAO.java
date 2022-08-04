/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bean.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thinh
 */
public class AccountDAO extends BaseDAO{
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<String> getAllEmail() {
        String query = "SELECT Email FROM [PracticeQuizSystem].[dbo].[Account]";
        List<String> email = new ArrayList<>();
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                email.add(rs.getString(1));
            }
        } catch (Exception e) {
        }
        return email;
    }
    
    public Account login(String user, String pass) {
        String query = "SELECT * FROM [PracticeQuizSystem].[dbo].[Account] WHERE Email = ? AND Password = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void register(String email, String pass, String name, String created) {
        String query = "INSERT INTO [PracticeQuizSystem].[dbo].[Account] VALUES (?, ?, ?, NULL, NULL, NULL, NULL, 1, ?, NULL);";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            ps.setString(3, name);
            ps.setString(4, created);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        dao.register("thinh", "hiep", "hiep", "2022-12-20");
    }
}

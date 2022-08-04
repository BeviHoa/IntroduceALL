/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class AccountDAO extends DBContext{
    public Account login(String accountId, String password){
        try {
            String sql="";
            PreparedStatement ps = connection.preparestatement(sql);
            ps.getString(1, accountId);
            ps.getString(2, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Account account = new Account(rs.getString(1), rs.getString(2));
                return account;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}

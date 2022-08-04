/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author Admin
 */
public class DAO extends DBContext{
    public Account login(String id, String pass){
        String sql = "select * from Account\n"
                + "where accountid = '?' and [password] = '?'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            st.setString(1, id);
            st.setString(2, pass);
            while(rs.next()){
                return new Account(rs.getString(1),  rs.getString(2));
            }
        } catch (SQLException e) {
        }
        
        return null;
    }
}

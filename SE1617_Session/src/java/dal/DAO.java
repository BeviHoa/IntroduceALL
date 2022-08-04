/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Admin;

/**
 *
 * @author Admin
 */
public class DAO extends DBContext {
    public Admin check(String user, String pass){
        String sql="select * from Admin where Username=? and Password=?";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new Admin(user, pass, rs.getInt("role"));
            }
        } catch (Exception e) {
            
        }
        return null;
    }
    
}

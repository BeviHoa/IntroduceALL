/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khanh doan
 */
public class CategoryDAO extends BaseDAO{

    public ArrayList<Category> getAll() {
         ArrayList<Category> listcate = new ArrayList<>();
       try {
           String sql = "SELECT * FROM [Category]";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Category b = new Category();
               b.setCateid(rs.getInt(1));
               b.setCatename(rs.getString(2));          
               listcate.add(b);
           }
       } catch (SQLException ex) {
           Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listcate;
    }
    
}

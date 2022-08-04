/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import bean.Blog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BlogDAO extends BaseDAO{

    public ArrayList<Blog> getAll() {
        ArrayList<Blog> blogs = new ArrayList<>();
       try {
           String sql = "SELECT * FROM [Post] ORDER BY [PostDate] DESC";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Blog b = new Blog();
               b.setId(rs.getInt(1));
               b.setThumbnail(rs.getString(2));
               b.setTitle(rs.getString(3));
               b.setPostdate(rs.getDate(4));
               b.setCategory(rs.getInt(5));
               b.setPostdetail(rs.getString(6));
               b.setBrief_info(rs.getString(7));             
               b.setAuthor(rs.getString(8));
               blogs.add(b);
           }
       } catch (SQLException ex) {
           Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return blogs;
    }
     public ArrayList<Blog> getTop3Post() {
        ArrayList<Blog> blogs = new ArrayList<>();
       try {
           String sql = "SELECT TOP 3 * FROM [Post] ORDER BY [PostDate] DESC";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Blog b = new Blog();
               b.setId(rs.getInt(1));
               b.setThumbnail(rs.getString(2));
               b.setTitle(rs.getString(3));
               b.setPostdate(rs.getDate(4));
               b.setCategory(rs.getInt(5));
               b.setPostdetail(rs.getString(6));
               b.setBrief_info(rs.getString(7));             
               b.setAuthor(rs.getString(8));
               blogs.add(b);
           }
       } catch (SQLException ex) {
           Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return blogs;
    }
     
     public ArrayList<Blog> getListByPage(ArrayList<Blog> list, int start, int end) {
        ArrayList<Blog> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
     
     public ArrayList<Blog> getListByCate(String id){
         ArrayList<Blog> blogs = new ArrayList<>();
       try {
           String sql = "SELECT * FROM [Post] WHERE [CategoryID] = ? ORDER BY [PostDate] DESC ";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, id);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Blog b = new Blog();
               b.setId(rs.getInt(1));
               b.setThumbnail(rs.getString(2));
               b.setTitle(rs.getString(3));
               b.setPostdate(rs.getDate(4));
               b.setCategory(rs.getInt(5));
               b.setPostdetail(rs.getString(6));
               b.setBrief_info(rs.getString(7));             
               b.setAuthor(rs.getString(8));
               blogs.add(b);
           }
       } catch (SQLException ex) {
           Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return blogs;
     }
}

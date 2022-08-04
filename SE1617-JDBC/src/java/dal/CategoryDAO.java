/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
// dao la nhung tap lenh su ly du lieu
//khi thao tÃ¡c vá»›i cÆ¡ so du lieu thÃ¬ pháº£i cÃ³ conection nÃªn ta pháº£i káº¿ thá»«a
public class CategoryDAO extends DBContext{
    // láº¥y táº¥t du lieu tu bang categories
    // select * from Categories
    public List<Category> getAll()
    {// tra ve 1 ds cac category hay cÃ²n gá»�i la getAll
       List<Category> list = new ArrayList <>();
       String sql = "select * from Categories";
       
       try{
       PreparedStatement st=connection.prepareStatement(sql);
       ResultSet rs = st.executeQuery();// chi chay cho lenh select
       //excuteupdate chayj cho tat ca cac lenh
       while(rs.next())// chya tu dau den het cac ban ghi
       {
           Category c = new Category();
           c.setId(rs.getInt("id"));
           c.setName(rs.getString("name"));
           c.setDescribe(rs.getString("describe"));
                   list.add(c);
       }
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
               
 //goi den co so du lieu luon dung try catch      
       return list;
    }
    
    //dlete from categories where id=4
    public void delete(int id)
    {
        String sql = "delete from Catergories where id=?";
        try
        {
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1,id);
            st.executeUpdate();//1,0
            
            
        }
        catch(SQLException e)
                {
                    System.out.println(e);
                }
    }
    
    //check xem co trung id ko
    public Category getCaterlogyByID(int id)
    {
         String sql = "select * from Categories where id=?";
       
       try{
       PreparedStatement st=connection.prepareStatement(sql);
       st.setInt(1, id);
       ResultSet rs = st.executeQuery();
       if(rs.next())// chya tu dau den het cac ban ghi
           //vi tr ve nhieu nhat 1 ban ghi do id ko dc phep trung nen ta dung if ko dung while
       {
           Category c = new Category();
           c.setId(rs.getInt("id"));
           c.setName(rs.getString("name"));
           c.setDescribe(rs.getString("describe"));
                  return c;//neu co tra ve ban ghi ko thi tra ve null
       }
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       return null;
    }
    
    // insert into Categories values(7,'KKKK','Mong')
// insert them thong tin
    public void insert(Category c)
{
    String sql ="insert into Categories values(?,?,?)";
    try {
        PreparedStatement st=connection.prepareStatement(sql);
        st.setInt(1, c.getId());
        st.setString(2, c.getName());
        st.setString(3, c.getDescribe());
        st.executeUpdate();//tat ca cac lenh deu chay upadate tru lenh select
    } 
    catch (SQLException e) {
        System.out.println(e);
    }
}
    public void update(Category c)
    {
        String sql="update Categories set name=?,describe=? where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,c.getName());
            st.setString(2, c.getDescribe());
            st.setInt(3, c.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
                    
        }
            
    }

// ltra xem co ket noi dc voi sql ko
            public static void main(String[] args) {
        CategoryDAO c = new CategoryDAO();
        //tra ve 1 danh sach
        List<Category> list = c.getAll();
                System.out.println(list.get(0).getName());
    }
}

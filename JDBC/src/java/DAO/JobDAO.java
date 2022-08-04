/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Jobs;
import DAO.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VinhPhu
 */
public class JobDAO extends DBContext{
      public List<Jobs> getALl() {
        List<Jobs> list = new ArrayList<>();
        String sql = "select * from Jobs";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Jobs j = new Jobs();
                j.setId(rs.getInt("ID"));
                j.setName(rs.getString("Name"));
                j.setSalary(rs.getDouble("Salary"));
                j.setDate(rs.getString("Datecreated"));
                String sc="";
                if(rs.getString("Activated").equals("1")){
                    sc = "yes";
                }else{
                    sc = "no";
                }
                j.setActivated(sc);
                list.add(j);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    } 
    public void insert(Jobs j){
        String sql = "insert into Jobs values(?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);         
            st.setString(1, j.getName());
            st.setDouble(2, j.getSalary());
            st.setString(3, j.getDate());
            st.setString(4, j.getActivated());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }   
    }
       public static void main(String[] args) {
        JobDAO c = new JobDAO();
        List<Jobs> list = c.getALl();
        System.out.println(list.get(4).getSalary());
    }
}

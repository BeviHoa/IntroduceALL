/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import model.Skill;

/**
 *
 * @author Admin
 */
public class DAO extends DBContext{
    public List<Skill> getAll(){
        List<Skill> list=new ArrayList<>();
        String sql="select * from skill";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                list.add(new Skill(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
        }
        return list;
        
    }
    
    public void insert(Employee e){
        try {
            String sql="insert into Employee values(?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, e.getId());
            st.setString(2, e.getName());
            st.executeUpdate();
            
            
            String sql1="insert into Employee_Skill value(?,?)";
            for(Skill i:e.getSkills()){
                PreparedStatement st1=connection.prepareStatement(sql1);
                st1.setInt(1, i.getId());
                st1.setInt(2, i.getId());
                st1.executeUpdate();
            }   
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}

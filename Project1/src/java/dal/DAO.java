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
import model.Group;
import model.Student;

/**
 *
 * @author Admin
 */
public class DAO extends DBContext{
    public List<Group> getAll(){
        List<Group> list = new ArrayList<>();
        String sql ="select * from Groups";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                list.add(new Group(rs.getInt("GroupID"), rs.getString("GroupName"), rs.getString("StartDate"), rs.getBoolean("Status")));
            }
        } catch (SQLException e){
            
        }
        return list;
    }
    public List<Student> getStudentsByDid(int gid){
        List<Student> list = new ArrayList<>();
        String sql="select StudentID, StudentName, Address, s.Status, s.GroupID, GroupName, StartDate, g.Status as GStatus from Student s inner join Groups g on s.GroupID = g.GroupID";

        if(gid != 0){
            sql += " where g.GroupID="+gid;
        }
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Group d = new Group(rs.getInt("GroupID"), rs.getString("GroupName"), rs.getString("StartDate"), rs.getBoolean("GStatus"));
                Student e = new Student(rs.getString("StudentID"), 
                        rs.getString("StudentName"), 
                        rs.getString("Address"), rs.getBoolean("Status"), d);
                list.add(e);
            }
        } catch (SQLException e){
            
        }
        return list;
    }
}

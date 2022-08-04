/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hongd
 */
public class EventDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs =null;
    
    public List<Event> getAll(){
        String query = "Select * from [Event]";
        List<Event> list = new ArrayList<>();
        try {
            conn = new DBContext.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Event(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5)));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return list;
    }
    
    public List<Event> getByName(String acc){
        String query = "Select * from Event where created_by = ? and isEnabled = 1 ";
        List<Event> list = new ArrayList<>();
        try {
            conn = new DBContext.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, acc);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Event(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5)));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return list;
    }
    
    public static void main(String[] args) {
        Dao.EventDao dao = new EventDao();
        List<Event> list = dao.getByName("mra");
        for (Event event : list) {
            System.out.println(event.getId());
        }
        
    }
}

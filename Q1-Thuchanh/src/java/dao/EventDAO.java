package dao;


import context.DBContext;
import model.Event;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EventDAO extends DBContext{
    public List<Event> getAll(){
        try {
            List<Event> list = new ArrayList<>();
            String sql="select * from Event";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Event event = new Event(rs.getInt(1),
                        rs.getString(2), rs.getDate(3), rs.getBoolean(4),
                        rs.getString(5));
                        list.add(event);
            }
            return list; 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}

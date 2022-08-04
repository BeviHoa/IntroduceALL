/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Event;

/**
 *
 * @author Admin
 */
public class EventDAO extends DBContext{
    public List<Event> getAll(){
        List<Event> std = new ArrayList<>();
        String sql = "select * from [Event]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Event e = new Event(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getInt(4), 
                        rs.getString(5));
                 std.add(e);
            }
        } catch (Exception e) {
        }
        return std;
        
    
    

}}

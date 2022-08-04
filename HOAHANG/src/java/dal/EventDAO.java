/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Event;

/**
 *
 * @author VinhPhu
 */
public class EventDAO  extends DBContext{
    public List<Event> getAllEvent() {
        List<Event> list = new ArrayList<>();
        String sql = "select * from Event";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Event(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getBoolean(4), rs.getString(5)));               
            }
        } catch (SQLException e) {
        }
        return list;
    }
}

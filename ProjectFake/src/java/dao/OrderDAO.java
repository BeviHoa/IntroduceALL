/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TRUNG KIEN
 */
public class OrderDAO extends DBContext {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public void addOrder(double total, int cud, String address) throws Exception {
        String sql = "insert into Orders values(?,?,getdate(),?)";
        try {
            
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);           
            rs = ps.executeQuery();
            
            ps.setDouble(1, total);
            ps.setInt(2, cud);
            ps.setString(3, address);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void addOrderDetail(List<Item> list) throws Exception {
        int oid = getLastOrderID();
        for (Item item : list) {
            System.out.println(item);
            String sql = "insert into OrderDetails values(?,?,?,?)";    //oid, pid, quantity, unitprice
            try {
                conn = new DBContext().getConnection();//mo ket noi voi sql
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                ps.setInt(1, oid);
                ps.setInt(2, item.getId());
                ps.setInt(3, item.getAmount());
                ps.setInt(4, item.getPrice());

                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public int getLastOrderID() throws Exception {
        int oid = 0;
        String sql = "select top(1) OrderId from Orders order by OrderId desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);           
            rs = ps.executeQuery();
            
            if (rs.next()) {
                oid = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return oid;
    }

    public static void main(String[] args) {
        OrderDAO d = new OrderDAO();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/dd/MM");
        Date date = new Date();
//        System.out.println(formatter.format(date));
        
        List<Item> list = new ArrayList<>();
        list.add(new Item(4, "Black jacket", "https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/15.jpg", 219, 2));

        
    }
}

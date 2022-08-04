/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Product;
import entity.StatisticByDate;
import entity.StatisticItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class StatisticDAO  {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<StatisticItem> getData(String from, String to) {
        List<StatisticItem> list = new ArrayList<>();
        String query = "select p.ProductId, p.Name, p.Price, sum(Quantity) as 'Total Quantity', sum(Quantity*UnitPrice) as 'Total sales'\n"
                + "from Orders o\n"
                + "join OrderDetails od on o.OrderId = od.OrderId\n"
                + "join Products p on od.ProductId = p.ProductId\n"
                + "where o.Date between ? and ?\n"
                + "group by p.ProductId, p.Name, p.Price\n"
                + "order by [Total sales] desc";
        try {
            ps = conn.prepareStatement(query);

            ps.setString(1, from);
            ps.setString(2, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new StatisticItem(
                        rs.getInt(1), //Id
                        rs.getString(2), //Name
                        rs.getInt(3), //Price
                        rs.getInt(4), //Total quantity
                        rs.getDouble(5) //Total sales
                ));
            }
        } catch (Exception e) {
            System.out.println("loi r");
        }
        return list;

    }

    public List<StatisticItem> getStatCategory(String from, String to) {
        List<StatisticItem> list = new ArrayList<>();
        String query = "select p.Category, sum(Quantity) as 'Total Quantity', sum(Quantity*UnitPrice) as 'Total sales'\n"
                + "from Orders o\n"
                + "join OrderDetails od on o.OrderId = od.OrderId\n"
                + "join Products p on od.ProductId = p.ProductId\n"
                + "where o.Date between ? and ?\n"
                + "group by p.Category";
        try {
            ps = conn.prepareStatement(query);

            ps.setString(1, from);
            ps.setString(2, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new StatisticItem(
                        rs.getString(1), //Category
                        rs.getInt(2), //Total quantity
                        rs.getDouble(3) //Total sales
                ));
            }
        } catch (Exception e) {
            System.out.println("loi r");
        }
        return list;

    }

    public double getTotalSalesById(int id, String from, String to) {
        double sales = 0;
        String query = "select p.ProductId, p.Name, sum(Quantity*UnitPrice) as 'Total sales'\n"
                + "from Orders o\n"
                + "join OrderDetails od on o.OrderId = od.OrderId\n"
                + "join Products p on od.ProductId = p.ProductId\n"
                + "where o.[Date] between ? and ?\n"
                + "group by p.ProductId, p.Name, p.Price";
        try {
            ps = conn.prepareStatement(query);
//            SimpleDateFormat formatIn = new SimpleDateFormat("yyyy-MM-dd");
//            SimpleDateFormat formatOut = new SimpleDateFormat("yyyy-dd-MM");
//            Date fromDate = formatIn.parse(from);
//            Date toDate = formatIn.parse(to);
//            Date today = new Date();
//            if (toDate.after(today)) {
//                toDate = today;        //SQL can't parse day > current day
//            }
//            String fromS = formatOut.format(fromDate);
//            String toS = formatOut.format(toDate);
            ps.setString(1, from);
            ps.setString(2, to);
            rs = ps.executeQuery();
            if (rs.next()) {
                sales = rs.getDouble(3);
            }
        } catch (Exception e) {

        }
        return sales;
    }

    public HashMap<Integer, Double> getSalesMonthly() {
        HashMap<Integer, Double> sales = new HashMap<>();

        for (int i = 1; i <= 12; i++) {
            sales.put(i, getSalesByMonth(i));
        }
        return sales;
    }

    public double getSalesByMonth(int month) {
        double sales = 0;
        String query = "select sum(o.Total) as 'Total Sales' \n"
                + "from Orders o \n"
                + "where month(o.[Date]) = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, month);
            rs = ps.executeQuery();
            if (rs.next()) {
                sales = rs.getDouble(1);
            }
        } catch (Exception e) {

        }
        return sales;
    }

    public SortedMap<Integer, Double> getSalesDay(int month) {
        SortedMap<Integer, Double> sales = new TreeMap<>();
        String query = "select day(o.Date) as 'Day', sum(o.Total) as 'Total Sales' \n"
                + "from Orders o \n"
                + "where month(o.[Date]) = ?\n"
                + "group by day(o.Date)\n"
                + "order by day(o.Date)";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, month);
            rs = ps.executeQuery();
            while (rs.next()) {
                sales.put(rs.getInt(1), rs.getDouble(2));
            }
        } catch (Exception e) {

        }
        return sales;
    }

    public static void main(String[] args) {
        String f = "2022-03-06";
        String t = "2022-03-19";

        StatisticDAO d = new StatisticDAO();
//        List<StatisticItem> l = d.getStatCategory(f, t);
//        for (StatisticItem statisticItem : l) {
//            System.out.println(statisticItem);
//        }
        SortedMap<Integer, Double> sales = d.getSalesDay(3);
        for (int key : sales.keySet()) {
            System.out.println(key + "  value: " + sales.get(key));
        }

//        System.out.println("thang 3:" + d.getSalesByMonth(3));
    }

}

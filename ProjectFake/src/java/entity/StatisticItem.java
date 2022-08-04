/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TRUNG KIEN
 */
public class StatisticItem {
    private int id;
    private String category, name;
    private int price;
    private int quantity;
    private double sales;

    public StatisticItem() {
    }

    public StatisticItem(int id, String name, int price, int quantity, double sales) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sales = sales;
    }

    public StatisticItem(String category, int quantity, double sales) {
        this.category = category;
        this.quantity = quantity;
        this.sales = sales;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "StatisticItem{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", sales=" + sales + '}';
    }
    
    
}

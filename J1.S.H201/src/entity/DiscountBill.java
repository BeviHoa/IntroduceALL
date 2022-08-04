/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Ryuu
 */ 
//để tính chiết khấu cho các khách hàng ưu tiên
public class DiscountBill extends GroceryBill {

    private boolean preferred;
    private int discountCount;
    private double discountAmount; // số tiền triết khấu

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.discountCount = 0;
        this.discountAmount = 0;
        this.preferred = preferred;
    }

    @Override
    public void add(Item i) {
        super.add(i);
        //discountAmount = 40
        if (preferred && i.getDiscount() > 0.0) {// nếu mà là cái ưu thích và có discount > 0
            discountCount++; // số chiếu khấu sẽ tăng lên
            //apple - 15
            discountAmount += i.getDiscount();// số tiền triết khấu 
        }
    }

    @Override
    public double getTotal() {
        //900 - 40 = 860
        return super.getTotal() - discountAmount;
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return (discountAmount * 100) / super.getTotal();
    }
}
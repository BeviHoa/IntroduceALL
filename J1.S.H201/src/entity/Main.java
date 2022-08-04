/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author Ryuu
 */
public class Main {
    private static final Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        Item apple = new Item("Apple", 150.0, 25.0);
        Item orange = new Item("Orange", 400.0, 0.0);
        Item banana = new Item("Banana", 350.0, 50.0);
        
        //nv mới
        Employee e = new Employee("Hoa");
        
        //Tạo hóa đơn chiết khấu
        DiscountBill bill = new DiscountBill(e, true);
        
        //Add vào bill
        bill.add(apple);
        bill.add(orange);
        bill.add(banana);
        
        //in biên lai
        bill.printReceipt();
        
        
//        1. Thêm mục - Thêm mục vào danh sách
//        2. Khai báo người dùng
//        3. Khai báo hóa đơn - đúng hay sai (ưu tiên hay không)
//        4. Thêm người dùng phụ thuộc vào hóa đơn?
        
        
        System.out.println("Number of discount: " + bill.getDiscountCount());
        System.out.println("Amount of discount: " + bill.getDiscountAmount());
        System.out.println("Percent discount: " + bill.getDiscountPercent() + "%");
        System.out.println("So tien "+e.getName()+" can phai tra: " + bill.getTotal());
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.TreeMap;

public class Cart {

    private TreeMap<Product, Integer> list;
    
    private long cartID;
   

    public Cart() {
        list = new TreeMap<>();
        cartID = System.currentTimeMillis();
    }

    public Cart(TreeMap<Product, Integer> list, long cartID, int quantity) {
        this.list = list;
        this.cartID = cartID;
        
    }

    public TreeMap<Product, Integer> getList() {
        return list;
    }

    public void setList(TreeMap<Product, Integer> list) {
        this.list = list;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }
    

    
}

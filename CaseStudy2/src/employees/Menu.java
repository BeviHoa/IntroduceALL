/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Menu extends Vector<String> {
    public Menu() {
        super();
    }
    void addMenuItem(String S){
        this.add(S);
    }
    int getUserChoice(){return 0;};
    
}
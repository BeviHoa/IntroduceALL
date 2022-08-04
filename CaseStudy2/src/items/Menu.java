/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import java.util.Vector; 
import java.util.Scanner; 

public class Menu extends Vector <String> {
    public Menu() { super(); } 
    void addMenuItem(String s) {this.add(s);}
    int getUserChoice () {return 0;}; 
}


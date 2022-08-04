/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap;

/**
 *
 * @author Admin
 */
public class Node {
    Person info;
    Node next;

    

    public Node(Person x, Node p) {
        info = x;
        next = p;
    }

    Node(Person x) {
        info = x;
        next = null;
    }

    @Override
    public String toString() {
        return "Node" + "info = "+info+", next= "+next;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Node {
    int data; //data of Node
    Node next;
    //create a new Node 
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    Node(int data) {
        this(data,null);
    }
}
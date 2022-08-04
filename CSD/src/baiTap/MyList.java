/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


/**
 *
 * @author Admin
 */
public class MyList {
    Node head, tail;

    public MyList() {
        head = tail = null;
    }
    void clear(){
        head = tail = null;
    }
    boolean isEmpty(){
        return (head==null);
    }
    
    void addLast(Person x){
        Node q = new Node(x);
        if(isEmpty()){
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }
    public void addFirst(Person x) 
    {
        Node p = new Node(x);
        if(isEmpty())
        {
            head = tail = p;
        }
        else
        {
            p.next = head; head = p;
        }
    }
    
    void visit(Node p){
        if(p != null){
            System.out.println(p.info +" ");
        }
    }
    
    void traverse(){
        Node p = head;
        while(p != null){
            visit(p);
            p = p.next;
        }
    }
    
    void addLastMany(String[] a, String[] b, String[] c){
        
    }
    
    void loadFromFile(String filename) throws IOException{
        try {
            File f = new File(filename);
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while((details = bf.readLine()) != null){
                StringTokenizer st = new StringTokenizer(details, "|");
                String current_id = st.nextToken();
                String current_name = st.nextToken();
                int current_age = Integer.parseInt(st.nextToken());
                this.addLast(new Person(current_id, current_name, current_age));
            }
            fr.close();
            bf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void saveToFile(String filename){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        
        try{
            File f = new File(filename);
            FileWrite fw = new 
            Node current = head;
            while(current != null){
                Person x = current.info;
                pw.println(x.getId() + "|" + x.getName()+"|"+x.getAge());
                current = current.next;
            }
            fw.close();
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}


import java.util.Iterator;
import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyList {
    Node head,tail;
    
    public MyList() {head = tail = null;}
    
    //return true if Mylist is empty otherwise return false
    public boolean isEmpty() {return head == null;}
    
    //1.insert a new node to the beginning of list
    public void addFirst(int x) 
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
    
    //2.append a new node to the end of list
    public void addLast(int x) 
    { 
        Node p = new Node(x);
        if(isEmpty()) 
        {
            head = tail = p;
        }
        else 
        {
            tail.next = p; tail = p;
        }
    }
    
    //3.add a node with value x  after the node p
    void addAfter( Node p,int x)
    {
        Node temp = new Node(x);
        Node result = search(p.data);
        if(isEmpty())
            head = tail = p;
        else
        {
            if(result == null)
                System.out.println("Not found!!!");
            else
            {
                temp.next = result.next;
                result.next = temp;
            }           
        }
    }

    //4.output list
    public void traversal() 
    {        
        Node p = head;
        System.out.print("List:");
        while(p != null) 
        {
            System.out.print(p.data +"  "); 
            p = p.next;
        }
        System.out.println("");
        
    }
    
    //5.delete the head and return its info.    
    public int deleteFromHead()
    {
        Node p = head;
        if(isEmpty())
            head = tail = null;
        else
        {
            head = head.next;
        }
        return p.data;
    }
    
    //6.delete the tail and return its info.
    public int deleteFromTail()
    {
        Node p = null;
        Node tmp = head;
        if (isEmpty()) 
            System.out.println("List null");
        else 
        {
            while (tmp != tail) 
            {
                p = tmp;
                tmp = tmp.next;
            }
            p.next = null;
            tail = p;
        }
        return tmp.data;
    }
    
    //7. delete the node after the node  p  and return its info.
    public int deleteAfter(Node p)
    {
        Node result = search(p.data);
        if(isEmpty())
            head = tail = p;
        else
        {
            if(result == null)
                System.out.println("Not found!!!");
            else
            {
                result.next = null;
            }           
        }
        return result.data;
    }
    
    //8.delele the first node whose info is equal to  x.
    public void dele(int x)
    {
        Node result = search(x);
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            Node tmp = head;
            Node p1 = null;
            if(result == null)
                System.out.println("Not found!!!");
            else
            {
                if(x == head.data)
                {
                     deleteFromHead();
                     return; 
                }
                else if(x == tail.data)
                {
                    deleteFromTail(); 
                    return;
                }
                else
                {
                    boolean flag = false;
                    while (tmp != null) {
                        if (tmp.data == x) {
                            flag = true;
                            break;
                        }
                        p1 = tmp;
                        tmp = tmp.next;
                    }
                    if (flag) 
                        p1.next = p1.next.next;
                }
            } 
        }
    }
    
    //9.return the first Node which infor = given x otherwise return null
    public Node search(int x) 
    {
        Node p = head;
        if(isEmpty())
            System.out.println("List is empty:");
        else
        {
            while(p != null) 
            {   
                if(p.data == x)                
                    break;                
                p = p.next;
            }
        }
        return p;
    }
    
    //10.return number of nodes in the list
    public int size() 
    {
        Node p = head; int c = 0;
        while(p != null) 
        {
            c++; p = p.next;
        }
        return c;
    }
    
    //return a Node at position k
    public Node Pos(int k) 
    {
        Node p = head; int c = 0;
        while(p != null && c < k)
        {
            c++; p = p.next;
        }
        return p;
    }
    
    //11.delete an i-th node on the list. Besure that such a node exists.
    public void deleByPos(int i)
    {
        Node p = Pos(i);
        dele(p.data);
    }
    

    
    //12.sort the list ascending 
    public void sort() 
    {
        int n = size();
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            for (int i = 0; i < n - 1; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    Node pi = Pos(i), pj = Pos(j);
                    if(pi.data > pj.data) {
                    int t = pi.data; pi.data = pj.data; pj.data = t;}
                }
            }
        }
    }
    

    //13.remove a node from the list
    public void remove(Node p) 
    {
        if(p == null) return;
        //find q where q.next = p
        Node f = head, q = null;
        while(f != null && f != p) 
        {
            q = f; f = f.next;
        }
        //remove head
        if(q == null) 
        {
            head = head.next;
            if(head == null) tail = null;
        }
        else 
        {
            q.next = p.next;
            if(p == tail) tail = q;
        }
        p.next = null;
    }
    
    //14.create and return array containing info of all nodes in the list.
    public int [] to_Array()
    {

        // Find the length of the
        // given linked list
        Node curr = head;
        int len = size();

        // Create an array of the
        // required length
        int []arr = new int[len];

        int index = 0;
        Node temp = head;

        // Traverse the Linked List and add the
        // elements to the array one by one
        while (temp != null)
        {
            arr[index++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }
    
    //15.Merge two ordered singly linked lists of integers into one ordered list.
    
    //16.add a node with value x  before the node p.
    public void addBefore(Node p,int x)
    {
        Node result = new Node(x);
        Node current = search(p.data);
        Node temp1 = null;
        Node temp2 = head;
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            if(current == null)
                System.out.println("Not found!!!");
            else
            {
                while(temp2 != current)
                {
                    temp1 = temp2;
                    temp2 = temp2.next;
                }
                temp1.next = result;
                result.next = temp2;                
            }
        }
    }
    
    //17. --> main
    
    //18.find and return the maximum value in the list. 
    public int find_Max()
    {
        int max = Pos(0).data;
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            for (int i = 0; i < size(); i++) {
                if(Pos(i).data > max)
                    max = Pos(i).data;
            }           
        }
        return max;
    }
    
    //19.find and return the minimum value in the list. 
    public int find_Min()
    {
        int min = Pos(0).data;
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {        
            for (int i = 0; i < size(); i++) {
                if(Pos(i).data < min)
                    min = Pos(i).data;
            }
        }
        return min;
    }
    
    //20.return the sum of all values in the list. 
    public int find_Sum()
    {
        int sum = 0;
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {        
            for (int i = 0; i < size(); i++) {
                    sum  += Pos(i).data;
            }
        }
        return sum;
    }
    
    //21.return the average of all values in the list.
    public int find_Avg()
    {
        int Average = 0;
        if(isEmpty())    
            System.out.println("List is empty!!!");                   
        else
            Average = find_Sum()/size();
        return Average;
    }
    
    //22.check and return true if the list is sorted(ascending), return false if the list is not sorted.
    public boolean Check_Sorted()
    {
        int n = size();
        int count = 0;
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            for (int i = 0; i < n - 1 ; i++) 
            {
                for (int j = i + 1; j < n ; j++) 
                {
                    Node pi = Pos(i), pj = Pos(j);
                    if(pi.data > pj.data) 
                        count++;                   
                }
                if(count > 0)
                    return false;
                else
                    return true;
            }
        }            
        return true;
    }
    //23.insert node with value x into sorted list so that the new list is sorted.
    public void Insert_Sort(int x)
    {
        Node p = new Node(x);
        if(isEmpty())
        {
            head = tail = p;
        }
        else
        {
            addFirst(x);
            sort();
        }
    }
   
    //24.reverse a list
    public void reverse() 
    {
        int n = size();
        for(int i = 0, j = n - 1; i < j; i ++, j --) 
        {
           Node pi = Pos(i), pj = Pos(j);
           int t = pi.data; pi.data = pj.data; pj.data = t;
        }
    }
    
    //25.Check whether two singly linked list have the same contents.
    // o ham main\
    
    protected Node findPrev(Node x){
        Node h = head;
        while(h !=  null){
            if(h.next != null){
                if(h.next == x){
                return h;
            }
        }
        h = h.next;
    }
    return null;
}
    
    public void deleteNode(Node x){
        if(head == x) head = x.next;
        if(tail == x) tail = findPrev(x
        if(x != head && x != tail){
            Node p = findPrev(x);
            if(p != null) p.next = x.next;
        }
}
    
    
    
    void addLast(String xName, int xAge)
   {
       Node p = new Node(new Person(xName, xAge))
       if(xName.charAt(0) == 'B' || xAge < 17 ){
           return;
       }
        if(isEmpty()) 
        {
            head = tail = p;
        }
        else 
        {
            tail.next = p; tail = p;
        }

   }
    
     protected Node findPrev(Node x){
        Node h = head;
        while(h !=  null){
            if(h.next != null){
                if(h.next == x){
                return h;
            }
        }
        h = h.next;
    }
    return null;
}
   
    public void deleteNode(Node x){
        if(head == x) head = x.next;
        if(tail == x) tail = findPrev(x);
        if(x != head && x != tail){
            Node p = findPrev(x);
            if(p != null) p.next = x.next;
        }
}
    
    
    
}



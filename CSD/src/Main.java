/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class Main {
    public static void main(String[] args) throws Exception {
       
        MyList m = new MyList(); 
        
        m.addLast(10);//10
        m.addLast(30);//10 30
        m.addFirst(60);//60 10 30
        m.addFirst(40);//40 60 10 30
        m.addFirst(50);//50 40 60 10 30
        

        Node p = new Node(60);
//        m.addAfter(p, 70);
//        m.traversal();
    Lib.viewFile("f1.txt");

//        System.out.println("List before delete");
//        m.traversal();
//        System.out.println("info node deleted:"+ m.deleteFromHead());
//        m.traversal();

//        System.out.println("List before delete");
//        m.traversal();
//        System.out.println("info node deleted:"+ m.deleteFromTail());
//        m.traversal();

//        System.out.println("List before delete");
//        m.traversal();
//        System.out.println("info node deleted:"+ m.deleteAfter(p));
//        m.traversal();
        
//        m.dele(40);
//        m.traversal();
 
//        m.deleByPos(2);
//        m.traversal();
        
//        System.out.print("Array containning info of all nodes in the list:");
//        for (int i = 0; i < m.to_Array().length; i++)
//        {
//            System.out.print(m.to_Array()[i]+" ");
//        }

//        System.out.println("List before add:");
//        m.traversal();
//        m.addBefore(p, 90);
//        System.out.println("List after add:");
//        m.traversal();
        
//        System.out.println("Max = "+ m.find_Max());
//        System.out.println("Min = "+ m.find_Min());
//        System.out.println("Sum = "+ m.find_Sum());
//        System.out.println("Sum = "+ m.find_Avg());
    
//        m.Insert_Sort(20);
//        m.traversal();

//        //22.
        m.traversal();
        System.out.println("list was sorted ?:" + m.Check_Sorted());
        
        MyList n = new MyList();         
        n.addLast(10);//10
        n.addLast(30);//10 30
        n.addFirst(60);//60 10 30
        n.addFirst(40);//40 60 10 30
        n.addFirst(50);//50 40 60 10 30
        //17.
//        m.traversal();
//        for (int i = 0; i < n.size(); i++) {
//            m.addLast(n.Pos(i).data);
//        }
//        m.traversal();
//       //25. 
//        if(m.size() != n.size())
//            System.out.println("don't same:");
//        else
//        {
//            int count = 0;
//            for (int i = 0; i < m.size(); i++) {
//                for (int j = 0; j < n.size(); j++) {
//                    Node pi = m.Pos(i), pj = n.Pos(j);
//                    if(pi.data == pj.data)
//                        count++;
//                }
//            }
//            if(count == m.size())
//                System.out.println(" two singly linked list have the same contents:");
//            else
//                System.out.println("don't same:");
//        }
        
        
        
        
    }
}

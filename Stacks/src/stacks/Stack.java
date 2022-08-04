package stack.and.queue;


public class Stack {
       Node head, tail;
    
    public Stack() {
        head = tail = null;
    }
    //1. //trả về true nếu ngăn xếp trống và ngược lại là false.
    public boolean isEmpty() {
        return head == null;
}
    
    //2.xóa
     public void clear() {
         head = tail = null;
     }
     
     
     //3.chèn 1 nút có giá trị x vào đầu danh sách
      public void font(int x)  {
        Node p = new Node(x);
     if(isEmpty()) {head = tail = p;}
     else {p.next = head; head = p;}
    }
      
      //4.xóa phần tử top
        public Object pop() 
    {
        if(isEmpty()) 
            return null;
     Object info = head.info;
     head = head.next;
     return info;
    }
        
        //5.trả về giá trị đầu danh sách
         public Object top() 
    {
        if(isEmpty()) 
            return null;
     Object info = head.info;
     return info;
    }
         
         //6.hiển thị danh sách
           public void traversal() {
        Node p = head;
     while(p != null) 
     {
         System.out.print(p.info +"  "); 
      p = p.next;
     }
      System.out.println("");
    }
}
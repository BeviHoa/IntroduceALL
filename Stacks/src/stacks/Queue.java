package stack.and.queue;


public class Queue {

    static void traverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
      Node head, tail;
    
    public Queue() {
        head = tail = null;
    }
    //1. //trả về true nếu ngăn xếp trống và ngược lại là false.
    public boolean isEmpty() {
        return head == null;
    }
    
    //3.chèn một nút có giá trị x vào cuối hàng đợi.
      public void enqueue(int x) {  //chèn một nút có giá trị x vào cuối hàng đợi.
      Node p = new Node(x);
     if(isEmpty()) 
         head = tail = p;
     else {
         tail.next = p; 
         tail = p;
     }
    }
        // 4.loại bỏ phần tử đầu tiên trên hàng đợi và trả về giá trị của nó; ném Ngoại lệ cho hàng đợi trống.
       public Object dequeue(){
        if(isEmpty()) 
            return null;
     Object info = head.info;
     head = head.next;
     return info;
    }
       
       
       //5.return value of  the first node of the queue; throw Exception for empty queue.
      public Object front()
    {
        if(isEmpty()) 
            return null;
     Object info = head.info;
     return info;
    }
      
      //4.  // loại bỏ phần tử đầu tiên trên hàng đợi và trả về giá trị của nó; ném Ngoại lệ cho hàng đợi trống.
       public void traversal() {
        Node p = head;
     while(p != null) 
     {
         System.out.print(p.info +"  "); 
      p = p.next;
     }
      System.out.println("");
    }
       
       
       // 2.clear the queue.
        public void clear() { 
            head = tail = null;
        }
}
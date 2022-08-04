/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.and.queue;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args)
    {
 
//        MyStack stack = new MyStack();
// 
//        stack.push(18);
//        stack.push(74);
//        stack.push(62);
//        stack.push(13);
//        stack.push(51);
// 
//        System.out.println(stack.pop()+ " popped from stack");
//        stack.traverse();
//   
//        System.out.println("Top element is " + stack.top());
   
        Queue queues = new Queue();
         
    queues.enqueue(18);
    queues.enqueue(13);
    queues.enqueue(34);
    queues.enqueue(51);
    queues.enqueue(90);
 
    System.out.println(queues.dequeue());
    System.out.println(queues.dequeue());
    System.out.println(queues.dequeue());
//    Queue.traverse();
        System.out.println("Tra ve phan tu dau tien:"+queues.front());

            
}
    
    
    }
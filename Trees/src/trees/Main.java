/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        int []x = {3,6,7,56,7,3};
        
        tree.insert(0);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        System.out.println(x);
       // tree.inOrder(tree.root);
        tree.postOrder(tree.root);
        
        
        
        
        
    }
  

}

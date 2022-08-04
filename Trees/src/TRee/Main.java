package TRee;

import TreeOPP.*;

public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        Person s= new Person( "Nguyen Duc Toan ", 85);
        Person a= new Person( "Nguyen Duc A ", 6);
        Person b= new Person( "Nguyen Duc B ", 7);
        Person c= new Person( "Nguyen Duc C ", 8);
        Person d= new Person( "Nguyen Duc D ", 9);
        Person e= new Person( "Nguyen Duc E ", 1);
        
        tree.insert(s);
        tree.insert(a);
        tree.insert(b);
        tree.insert(c);
        tree.insert(d);
        tree.insert(e);
//        tree.insert(e);
//        tree.insert(e);
        
        
    

        System.out.println("");
        tree.balance(tree.root);
        
        System.out.println("");
//        System.out.println("search parent: "); //hom sau hoi co
//        tree.visit(tree.searchParent(tree.root, "HE153442"));
//        System.out.println();
        if(tree.search(tree.root, "HE153439")!=null){
            System.out.println("fount");
        }
        else System.out.println("not fount");
//        tree.deleteByCopy(c);
//        tree.BFT(tree.root);
//        System.out.println("");
       
      
        System.out.println("");
        
    }
}

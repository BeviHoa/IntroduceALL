package TreeOOP;

public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        Student s= new Student("HE153439", "Nguyen Duc Toan ", "8.5");
        Student a= new Student("HE153440", "Nguyen Duc A ", "6");
        Student b= new Student("HE153441", "Nguyen Duc B ", "7");
        Student c= new Student("HE153442", "Nguyen Duc C ", "8");
        Student d= new Student("HE153443", "Nguyen Duc D ", "9");
        Student e= new Student("HE153444", "Nguyen Duc E ", "1");
        
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
        tree.deleteByMerging(d);
      
        System.out.println("");
        
    }
}

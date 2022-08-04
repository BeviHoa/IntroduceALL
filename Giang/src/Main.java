
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BStree tree = new BStree();
        tree.Q1_readFile("Car.txt");
//        tree.postOrder(tree.root);
//        tree.saveFile("q2.txt");
//        //System.out.println(tree.s);
////        tree.visit(tree.BFT(tree.root));
        tree.deleteByCopy();
        tree.Q3_saveFile("Q3.txt");
        
        //q4
        System.out.println("Q4:");
        tree.balance();
        tree.preOrder(tree.root);
        
        
        
    }
}

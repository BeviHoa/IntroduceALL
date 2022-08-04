package TRee;


import TreeOPP.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import sun.misc.Queue;

public class BSTree {
    Node root;

    public BSTree() {root = null;}
    
    public boolean isEmpty() {return root == null;}
    
    public void visit(Node p) 
        {if(p == null) return;
            System.out.print(p.info.toString());
        }
    //return a Node which has key = given key in the tree p
    public Node search(Node p, String key) 
        {if(p == null)
            return null;
        if(p.info.name.equals(key)) 
            return p;
        else if(p.info.name.compareToIgnoreCase(key)>0) 
            return search(p.left, key);
        else 
            return search(p.right, key);
        }
    public Node searchParent(Node p, String key){
        Node parent=null;
        if(p == null) 
            return null;
        parent =p;
        if(p.info.name.equals(key))
            return parent;
        else if(p.info.name.compareToIgnoreCase(key)<0) 
            return search(p.left, key);
        else 
            return search(p.right, key);
    }
    //insert a key x to the tree
    public void insert(Person x) {}
    
    //preorder a tree
    public void preOrder(Node p) {
        if(p == null) 
            return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    //postorder a tree
    public void postOrder(Node p) {
        if(p == null) 
            return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    //inorder a tree
    public void inOrder(Node p) {
        if(p == null) 
            return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);      
    }

//    public void BFT(Node p){
//        if(p == null) 
//            return;
//        MyQueue m = new MyQueue();
//        m.enqueue(p);
//        while(!m.isEmpty()) {
//            Node q = (Node)m.dequeue();
//            visit(q);
//            System.out.println("");
//            if(q.left != null) 
//                m.enqueue(q.left);
//            if(q.right != null) 
//                m.enqueue(q.right);
//        }
//    }
    //height of tree
    int height(Node p)
        {if(p==null) {
            return 0;}
        else{
            int lDepth=height(p.left);
            int rDepth=height(p.right);
            if (lDepth > rDepth) 
                return (lDepth + 1);
            else return (rDepth + 1);
    }
        }
    
//    public void deleteByCopy(Person x) 
//        {Node p = search(root, x.id);
//        if(p==null) {
//            System.out.println("Key "+x+" does not exists, deletion failed"); return;}
//     
//        Node parent = null, q = root;
//        while(q!=p){
//            parent=q; 
//            if(q.info.id.compareToIgnoreCase(x.id)>0) 
//                q=q.left;
//            else 
//                q=q.right;
//        }
//      //1.p has no child
//            if(p.left==null&&p.right==null) {
//                if(parent==null) 
//                    root=null;
//                else if(parent.left==p) 
//                    parent.left=null;
//                else parent.right = null;
//      }
//      //2.p has left child only
//            else if(p.left!=null&&p.right==null) {
//                if(parent==null) 
//                    root=p.left;
//                else if(parent.left==p) 
//                    parent.left=p.left;
//                else 
//                    parent.right=p.left;
//      }
//      //3.p has right child only
//            else if(p.left==null&&p.right!=null) {
//                if(parent==null) 
//                    root=p.right;
//                else if(parent.left==p) 
//                    parent.left=p.right;
//                else 
//                    parent.right=p.right;
//      }
//      //4.p has both child
//            else if(p.left!=null&&p.right!=null) {
//       //tim node lon nhat ben con trai cua p -> rm la con phai nhat
//       //cua con trai cua p
//        Node parentRm = null;
//        Node rm = p.left;
//            while(rm.right != null) {
//                parentRm=rm;
//                rm=rm.right;
//            }
//            p.info = rm.info;
//       //delete rm
//            if(parentRm==null) 
//                p.left=rm.left;
//            else 
//                parentRm.right=rm.left;
//      }
//    }
    
    
    void deleteByCopying(Student x){
        Node p = root;
        Node parent = null;
        while(p != null){
            if(p.info == x) break;
            parent = p;
            if(p.info.name.compareToIgnoreCase(x.id) > 0)
                p = p.left;
            else
                p = p.right;
        }
        if(p == null) return;
        
        //1. p la node lá, không có node con
        if((p.left == null) && (p.right == null)){
            if(parent == null){
                root = null;
                return;
            }
            
            if(parent.left == p)
                parent.left = null;
            else
                parent.right = null;
        }
        
        //2.p chỉ có 1 con(trái hoặc phải)
        
        
        if(parent == null){
            root = null;
            return;
        }
        if((p.left != null) && (p.right == null)){// có con trái k có con phải
            if(parent.left == p)
                parent.left = p.left;
            else
                parent.right = p.left;
        }
        
        if((p.left == null) && (p.right != null)){
            if(parent.right == p)
                parent.right = parent.right;
            else
                parent.left = p.right;
        }
        
        
        //3. p có 2 con
        if((p.left != null) && (p.right != null)){
       
        Node rm = p.left;
        Node parenRm = null;
        while(rm.right != null){
            parenRm = rm;
            rm = rm.right;
        }
        p.info = rm.info; //copy gtri cua rm vao p, xoa gtri cu cua p
        if(parenRm == null){
            p.left = rm.left;
        }
        else{
            parenRm.right = rm.left;
        }
            
        }  
    }
    
    
    public void deleteByMerging(Person x) {
        Node p = search(root, x.name);
        if(p==null) {System.out.println("Key "+x+" does not exists, deletion failed");return;}
     //find f is father of p
        Node f = null, q = root;
        while(q!=p) {
            f=q;
            if(q.info.name.compareToIgnoreCase(x.name)>0) 
                q=q.left;
            else 
                q=q.right;}
     //1.p has no child
        if(p.left==null&&p.right==null) {
            if(f==null) 
                root=null;
            else if(f.left==p) 
                f.left=null;
            else f.right=null;
        }
     //2.p has left child only
        else if(p.left!=null && p.right==null) {
            if(f==null) 
                root=p.left;
            else if(f.left==p) 
                f.left=p.left;
            else f.right=p.left;
        }
     //3.p has right child only
        else if(p.left==null && p.right!=null) {
            if(f==null) 
                root=p.right;
            else if(f.left==p) 
                f.left=p.right;
            else f.right=p.right;
        }
     //4.p has both child
        else if(p.left!=null && p.right!=null) {
      //tim q la node lon nhat ben con trai cua p -> q la con phai nhat
      //cua con trai cua p
        q=p.left;
        Node t=null;
        while(q.right!=null) {
            t=q; 
            q=q.right;
        }
        Node rp=p.right;
        q.right=rp;
        if(f==null) 
            root=p.left;
        else if(f.left==p) 
            f.left=p.left;
        else f.right=p.left;
     }
    }
    //balancing a BST
    //inorder a BST and save all items to an array
    public void buildArray(ArrayList a, Node p) {
        if(p == null) return;
        buildArray(a, p.left);
        a.add(p);
        buildArray(a, p.right);
    }
    //insert all items from an array to a new BST
    public void balance(ArrayList a, int f, int l) {
        if(f > l) return;
        int m = (f + l) / 2;
        Node p = (Node)a.get(m);
        insert(p.info);
        balance(a, f, m - 1);
        balance(a, m + 1, l);
    }
    
    public void balance(Node p) {
        ArrayList a = new ArrayList();
        buildArray(a, p);
        int l = a.size(), f = 0;
     //create a new tree and insert all items from a to the BST
        BSTree t = new BSTree();
        t.balance(a, f, l - 1);
        root = t.root;
    }
    /*Part 3___________________________________________________________________*/
    public Node rotateLeft(Node p) {
        if(p.right == null) return p;
        Node p1 = p.right;
        p.right = p1.left;
        p1.left = p;
        return p1;
    }
    
    public Node rotateRight(Node p) {
        if(p.left == null) return p;
        Node p1 = p.left;
        p.left = p1.right;
        p1.right = p;
        return p1;
    }
    
    void insert(String xName, int xAge)
     {//You should insert here statements to complete this function
         if(xName.charAt(0) == 'B'|| xAge > 100)
            return;
        Node p = new Node(new Person(xName,xAge));
        Node f = null, q = root;
        while (q != null) {
            if (q.info == p.info) {               
                return;
            }
            if (q.info.age < p.info.age) {
                f = q;
                q = q.right;
            } else {
                f = q;
                q = q.left;
            }
        }
        if (f == null) {
            root = p;
        } else if (p.info.age > f.info.age) {
            f.right = p;
        } else {
            f.left = p;
        }

    }
    
//        int height(Node p) {
//        if (p == null) {
//            return 0;
//        } else {
//            int lDepth = height(p.left);//compute the depth of each subtree
//            int rDepth = height(p.right);
//            if (lDepth > rDepth) {
//                return (lDepth + 1);//use the larger one
//            } else {
//                return (rDepth + 1);
//            }
//        }
//    }
    public void Q2_saveFile(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(data));
        Node p = root;
        if (p == null) {
            return;
        }
        MyQueue m = new MyQueue();
        m.enqueue(p);
        while (!m.isEmpty()) {
            Node q = (Node) m.dequeue();
            writer.write(q.info.toString());
            if (q.left != null) {
                m.enqueue(q.left);
            }
            if (q.right != null) {
                m.enqueue(q.right);
            }
        }
     
        writer.close();
    }
    
    public int count(Node p){
	 if(p==null) return(0);
	   int k,h,r;
	   k = count(p.left);
	   h = count(p.right);
	   r = k+h+1;
	   return(r);
	 }
    
    
    Node breadth3(Node p) throws InterruptedException {
        if (p == null) {
            return null;
        }
        Queue q = new Queue();
        q.enqueue(p);
        Node f;
        while (!q.isEmpty()) {
            f = (Node) q.dequeue();
            if (f.left != null) {
                rotateRight(root.left);
            }
            if (f.left != null) {
                q.enqueue(f.left);
            }
            if (f.right != null) {
                q.enqueue(f.right);
            }
        }
        return null;
    }
  
    
}

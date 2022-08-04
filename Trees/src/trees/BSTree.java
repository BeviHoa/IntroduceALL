/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BSTree {
    Node root;
    
    public BSTree(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    void clear(){
        root = null;
    }
    
    public Node search(Node p, int key){
        if(p == null) return null;
        if(p.info == key) return p;
        else if(p.info > key) return search(p.left, key);
        else return search(p.right, key);
    }
    
    public void insert(int x){
        Node p = new Node(x);
        Node f = null;
        Node q = root;
        while(q != null){
          if(q.info == x){
              System.out.println("Không được nhập trùng nhau");
              return;
            }
          if(q.info < x){
              f = q;
              q = q.right;
          }else{
              f = q;
              q = q.left;
          }          
        }
        if(f == null) root = p;
        else if(p.info > f.info) f.right = p;
        else f.left = p;
    }
    
    public void visit(Node p){
        if(p == null) return;
        System.out.println(p.info + " ");
    }
    
    public void preOrder(Node p){
        if(p == null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    
    public void postOrder(Node p){
        if(p == null) return;
        if(p.info >= 10 && p.info <=30)
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
        
    }
    
    public void inOrder(Node p){
        if(p == null) return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    
    
    void breadth(){
        if(isEmpty()) return;
        MyQueue mq = new MyQueue();
        mq.enqueue(root);
        Node p;
        while(!mq.isEmpty()){
            p = mq.dequeue();
            visit(p);
            if(p.left != null)
                mq.enqueue(p.left);
            if(p.right != null)
                mq.enqueue(p.right);
        }
        System.out.println();
    }
    public int count(Node root){
        if(root == null) return 0;
        else{
        return 1 + count(root.left) + count(root.right);
        }
    }
    
    public Node dele(Node root, int x){
        if(root == null) return null;
        root.left = dele(root.left, x);
        root.right = dele(root.right, x);
        
        if(root.data == x && root.left == null
                && root.right == null){
            return null;
        }
        return root;
    }
    
//    void XoaNode(Node root, int x) // x chính là giá trị của cái node cần xóa
//{
//    // nếu như cây đang rỗng
//    if (root == null)
//    {
//        return; // kết thúc hàm
//    }
//    else
//    {
//        // nếu như x nhỏ hơn node gốc
//        if (x < root.info)
//        {
//            XoaNode(root.left,x); // duyệt sang nhánh trái của cây 
//        }
//        else if (x > root.info)
//        {
//            XoaNode(root.right, x); // duyệt sang nhánh phải của cây 
//        }
//        else 
//        {
//            Node p = root; // node X là node thế mạng - tí nữa chúng ta sẽ xóa nó
//            // nếu như nhánh trái bằng NULL <=> đây là cây có 1 con chính là con phải
//            if (root.left == null)
//            {
//                // duyệt sang phải của cái node cần xóa để cập nhật mối liên kết giữa node 
//                // cha của node cần xóa với node con của node cần xóa
//                root = root.right; 
//            }
//            else if (root.right == null)
//            {
//                // duyệt sang trái của cái node cần xóa để cập nhật mối liên kết giữa node 
//                // cha của node cần xóa với node con của node cần xóa
//                root = root.left;
//            }
//            delete p; // xóa node cần xóa
//        }
//    }
//}
    
    public Node min(Node node){
        Node current = node;
        if(current.left != null){
            return min(node.left);
        }
        return node;
    }
    
    
    public Node max(Node node){
        Node current = node;
        if(current.right != null){
            return max(node.right);
        }
        return node;
    }
    
    public int min(){
       Node current = root;
       if(root == null){
           return 0;
       }
       while(current.left != null){
           current = current.left;
       }
       return current.info;
    }
    
     public int max(){
       Node current = root;
       if(root == null){
           return 0;
       }
       while(current.right != null){
           current = current.right;
       }
       return current.info;
    }
    
    public int sum(Node p){
        if(p == null) return 0;
        else 
            return p.info + sum(p.left) + sum(p.right);
    }
    
    public int avg (Node p){
        if(p == null) return 0;
        else return sum(p) / ( 1 + avg(p.left) + avg(p.right));
        
        
    }
    
    public int height(Node p){
        if (p == null) return 0;
        else{
            int chieuSauT = height(p.left);
            int chieuSauP = height(p.right);
            if(chieuSauT > chieuSauP)
                return chieuSauT + 1;
            else return chieuSauP + 1;
        }
    }
    
//    public int cost(Node p){
//        if(p == null) return 0;
//        else{
//            
//        }
//    }
    
    
//    void insert(int x){
//        Node newNode = new Node(x);
//        if(isEmpty()){
//            root = newNode;
//            return;
//        }
//        Node p = root;
//        Node parent = null;
//        while(p != null){
//            if(p.info == x){
//                System.out.println("x đã tồn tại");
//                return;
//            }
//            parent = p;
//            if(p.info > x)
//                p = p.left;
//            else
//                p = p.right;
//        }
//        //p = null
//        //x chưa có trong tree, cần thêm x vào
//        //parent là node lá
//        //x được thêm vào con của parent 
//        // cần xđ thêm x vào trái hay phải của parent
//        if(parent.info > x)
//            parent.left = newNode;
//        else
//            parent.right = newNode;
//    }
    
    void deleteByCopying(int x){
        Node p = root;
        Node parent = null;
        while(p != null){
            if(p.info == x) break;
            parent = p;
            if(p.info > x)
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
    
    public void deleteByMerging(int x) {
        Node p = root;
        Node parent = null;
        while(p != null){
            if(p.info == x) break;
            parent = p;
            if(p.info > x)
                p = p.left;
            else
                p = p.right;
        }
        if(p == null) return;
     //1.p has no child
     if(p.left == null && p.right == null) {
      if(parent == null) 
        root = null;
            return;
     }
        if(parent.left == p) 
          parent.left = null;
        else 
          parent.right = null;
     }
    
    
    //xoay bên trái
/*
       a                            b
     b            -->            a     c
   c                                   
   */     

 public Node rotateLeft(Node a) {
     if(a.right == null) return a;// neu cay con ben trai bang null thi tra ve a,a o day la goc
     Node b = a.right;// b la con cua a va b<a
     a.right = b.left;
     b.left = a;
     return b;
    }
 
 // xoay ben phai
 
 /*
     a                                    b
    b                     -->          c     a
  c       
*/     
 public Node rotateRight(Node a) {
     if (a.left == null) {// nếu cây con bên trái bằng null thì tra ve a
         return a;// a ơ day la goc
     }
     Node b = a.left;// b la con a va b>a
     a.left = b.right;
     b.right = a;
     return b;
    } 
 
    
//    public Node rotateLeft(Node a) {
//     if (a.right == null) {
//         return a;
//     }
//     Node b = a.right;
//     a.right = b.left;
//     b.left = a;
//     return b;
//    } 
 
 // cân bằng cây
    
 // sap xep lai mang
    public void buildArray(ArrayList a, Node p) {
     if(p == null) return;
     buildArray(a, p.left);//  coppy các node bên trái của cây vào bên trái của mảng
     a.add(p);
     buildArray(a, p.right);// coppy các node bên phải của cây vào bên phải của mảng
    }
    
    //coppy tât ca cac node cua cay vao mọt mảng mới 
    public void balance(ArrayList a, int first, int last) {
       if(first <= last) 
        {
            int m = (first + last) / 2;// m là điểm giữa, lấy điêm giữa làm gốc sau đó chia đôi nó sang hai bên 
            Node p = (Node)a.get(m);
            insert(p.info);
            balance(a, first, m - 1);// cân bằng cây từ đầu đến cây con bên trái
            balance(a, m + 1, last);// cân bằng cây từ cây con bên phải đến cuối
        }
        else
        {
            return;
        }
    }
    
    //Call balance() method to rebuild the tree
    public void balance(Node p) {
     ArrayList a = new ArrayList();
     buildArray(a, p);
     int last = a.size(), first = 0;
    // tạo một cây mới và chèn tất cả các mục từ a vào BST
     BSTree t = new BSTree();
     t.balance(a, first, last - 1);
     root = t.root;
    }
//    public int treeLevel(Node p){
//        if(p == null) return -1;
//        return 1 + maxztreeLevel(p.left), treeLevel(p.right));
//    }
//    public void updateTreeAvl(Node p){
//        
//    }

    
}


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

public class BStree {

    Node root;

    public BStree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(p.info.toString());
    }

    //return a Node which has key = given key in the tree p
    public void Q1_readFile(String fname) throws IOException {
        try (RandomAccessFile f = new RandomAccessFile(fname, "r")) {
            String s;
            String[] a;
            String id;
            int price;
            Car C;
            while (true) {
                s = f.readLine();
                if (s == null || s.trim().equals("")) {
                    break;
                }
                a = s.split("[|]");
                id = a[0].trim() + "";
                price = Integer.parseInt(a[1].trim());
                C = new Car(id, price);
                if (!id.substring(0, 1).equals("B") && price <= 20) {
                    insert(new Car(id, price));
                }
            }
            //postOrder(root);
        }
    }

    //height of tree
    int height(Node p) {
        if (p == null) {
            return 0;
        } else {
            int lDepth = height(p.left);//compute the depth of each subtree
            int rDepth = height(p.right);
            if (lDepth > rDepth) {
                return (lDepth + 1);//use the larger one
            } else {
                return (rDepth + 1);
            }
        }
    }

    public void Q3_saveFile(String data) throws IOException {
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

    void insert(Car x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node f = null, p = root;
        while (p != null) {
            f = p;//luu lai gia tri cua p
            if (p.info.getId().compareToIgnoreCase(x.getId()) > 0) {//p>x->p sang ben phai
                p = p.left;
            } else {
                p = p.right;
            }
        }
        //f la node leaf, p=null, x la con cua f
        if (f.info.getId().compareToIgnoreCase(x.getId()) > 0) {//xac dinh x la con trai hay phai cua f
            f.left = new Node(x);
        } else {
            f.right = new Node(x);
        }
    }

    //Q3
    public void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    public Node BFT(Node p) {//search node have 2sons and height < 5, write the tree to file
        if (p == null) {
            return null;
        }
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node r = null;
        while (!q.isEmpty()) {
            r = (Node) q.dequeue();
            if (r.left != null && r.right != null && height(r) < 5) {
                return r;
            }
            if (r.left != null) {
                q.enqueue(r.left);
            }
            if (r.right != null) {
                q.enqueue(r.right);
            }
        }
        return r;
    }

    public void deleteByCopy() {
        Node p = BFT(root);
        if (p == null) {
            System.out.println("Key does not exists, deletion failed");
            return;
        }
        //find parent is father of p
        Node parent = null, q = root;
        while (q != p) {
            parent = q;
            if (q.info.getId().compareToIgnoreCase(p.info.getId()) > 0) {
                q = q.left;
            } else {
                q = q.right;
            }
        }
        //1.p has no child
        if (p.left == null && p.right == null) {
            if (parent == null) {
                root = null;
            } else if (parent.left == p) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } //2.p has left child only
        else if (p.left != null && p.right == null) {
            if (parent == null) {
                root = p.left;
            } else if (parent.left == p) {
                parent.left = p.left;
            } else {
                parent.right = p.left;
            }
        } //3.p has right child only
        else if (p.left == null && p.right != null) {
            if (parent == null) {
                root = p.right;
            } else if (parent.left == p) {
                parent.left = p.right;
            } else {
                parent.right = p.right;
            }
        } //4.p has both child
        else if (p.left != null && p.right != null) {
            //tim node lon nhat ben con trai cua p -> rm la con phai nhat
            //cua con trai cua p
            Node parentRm = null;
            Node rm = p.left;
            while (rm.right != null) {
                parentRm = rm;
                rm = rm.right;
            }
            p.info = rm.info;
            //delete rm
            if (parentRm == null) {
                p.left = rm.left;
            } else {
                parentRm.right = rm.left;
            }
        }
    }
    
    //q4
    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(ArrayList<Car> data, Node p) {//sap xep theo thu tu tang dan
        if (p == null) {
            return;
        }
        inOrder(data, p.left);
        data.add(p.info);
        inOrder(data, p.right);
    }

    void balance(ArrayList<Car> data, int first, int last) {
        if (first <= last) {
            int middle = (first + last) / 2;
            insert(data.get(middle));//lay phan tu o giua r chen vao
            balance(data, first, middle - 1);//goi de quy nua trai
            balance(data, middle + 1, last);//goi de quy nua phai
        }
    }

    void clear() {
        root = null;
    }
    
    void balance() {
        ArrayList<Car> data = new ArrayList<>();
        inOrder(data, root);
        clear();
        balance(data, 0, data.size() - 1);
    }

}

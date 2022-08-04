public class Node {
    Person info;
    Node left,right;

    public Node(Person info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }
    public Node(Person info){
        this.info=info;
        this.left=this.right=null;
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + "info=" + info + ", left=" + left + ", right=" + right + '}';
    }
    
}

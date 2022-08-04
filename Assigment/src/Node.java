
public class Node {
        Songs data;
    Node next;
     
    public Node(){}
    
    public Node(Songs data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Songs data)
    {
        this(data,null);
    }
}


package TreeOOP;
public class Node {
    Student info;
    Node left;
    Node right;
    Node (Student x){
        info =new Student(x.id, x.name, x.gpa);
        left=right=null;
    }
    
}

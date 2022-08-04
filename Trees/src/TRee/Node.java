
package TRee;

import TreeOPP.*;

public class Node {
    Person info;
    Node left;
    Node right;
    Node (Person x){
        info =new Person( x.name, x.age);
        left=right=null;
    }
    
}

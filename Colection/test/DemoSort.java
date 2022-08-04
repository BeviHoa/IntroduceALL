/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;

class DemoMap01{
    public static void main(String[] args) {
        HashMap<Integer, String > hm = new HashMap();
        hm.put(2, "hai");
        hm.put(4, "bon");
        hm.put(1, "mot");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = "+key+ ": value = "+value);
        }
    }
}

// 

/*
public class DemoSort {
    public static void main(String[] args) {
        
    
    ArrayList ar = new ArrayList();
    ar.add(5);
    ar.add(11);
    ar.add(15);
    ar.add(1);
    ar.add(3);
    ar.add("Hello");
        System.out.println(ar);
        //sort
//        Collections.sort(ar);
//        Collections.reverse(ar);

    Collections.sort(ar,new Comparator(){
        public int compare (Object o1, Object o2){
            return -1;
        }
    });
    
    
    
        System.out.println(ar);
}
}
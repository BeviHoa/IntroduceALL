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

/*
public class DemoMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        
        hm.put("One", 1);
        hm.put("two", "Hai");
        hm.put("three", "ba");
        
        System.out.println(hm);//c1
        hm.put("one", "Mot");// neu key chua ton tai thi add cap <key,value>vao trong map
                //neu key da ton tai thi value cu sẽ được update value moi
        hm.putIfAbsent("four", "bon");//chi co tac dung khi chua ton tai
        //khi no se add<key,value> vao trong Map, neu ton tai roi thi thoi
        System.out.println(hm);
//        hm.putIfAbsent("One","Khong thay doi");
        System.out.println(hm);
        hm.remove("One");//neu key ton tai thi Map se remove key do dong thoi 
        //method remove se tra ve value ung voi key do.
        //neu key chua tồn tại thì trả vè null.
        System.out.println(hm.remove("One"));
        System.out.println(hm);
        
        //hm.remove(key,value);
        //neu cặp key và value có tồn tại trong Map thì method se remove
        //bo cap key va value trng map dồng thời trả về gtri True. nguoc lai thi fasle
        
        System.out.println(hm.remove("one","Mot"));
        System.out.println(hm);
        
        
        
        
//        Set keys = hm.keySet();
//        for (Object key : keys) {
//            System.out.println("Key = "+key+": value = "+hm.get(key));
//        }
//        //khi muốn lấy gtri nao đó thì ta dùng hm.get(key)
//        for (Iterator it = keys.iterator(); it.hasNext();) {
//            Object next = it.next();
//            System.out.println("Key = "+next+": value = "+hm.get(next));
//            }
//        Iterator its = key.iterator();
//        while(its.hasNext()){
//            Object key = its.next();
//            System.out.println("Key = "+next+": value = "+hm.get(next)");
//        }
    }
}
*/
class MySort01 implements Comparator{
    public int compare(Object o1, Object o2){
        return -1;
    }
}
class DemoMap{
    public static void main(String[] args) {
//        MySort01 my = new MySort01();
//        //TreeMap tm = new TreeMap(my);
//        //TreeMap tm = new TreeMap(new MySort01()); //anonymous object
//        Comparator com = new Comparator(){ //anonymous class
//            public int compare(Object o1, Object o2){
//                return -1;
//            }
//        };
//       // TreeMap tm = new TreeMap(com);
//       TreeSet tm = new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return -1;
//            }
//        });
          TreeMap tm = new TreeMap((o1,o2)->{return -1;});
       
        tm.put(1, "one");
        tm.put(5, "five");
        tm.put(3, "three");
        tm.put("hello","xin chao");
        System.out.println(tm);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colection;

import static java.lang.Integer.sum;
import static java.lang.Math.sqrt;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HWCollection {

    boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    void f1(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size(); i++) {
            if(checkPrime(ar.get(i))){
                ar.remove(i);
                i--;
            }
        }
    }

//    int f2(ArrayList<Integer> ar) {
//        int sum = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (checkPrime(ar.get(i))) {
//                sum += i;
//            }
//        }
//
//        System.out.println(sum);
//
//        return 0;
//    }
//    
//    int f3(ArrayList<Integer> ar) {
//       
//        for (int i = 0; i < ar.size(); i++) {
//            if (checkPrime(ar.get(i))) {
//               System.out.println(ar);
//            }
//        }
//
//        
//
//        return 0;
//    }
//    
//    int f4(ArrayList<Integer> ar){
//        int sum= 0 ;
//        for (int i = 0; i < ar.size()/2; i++) {
//            sum+=i;
//            
//        }
//        return 0;
//    }
//
//}
}
class Using {

    public static void main(String[] args) {
        
        HWCollection hw = new HWCollection();
        ArrayList<Integer> ar = new ArrayList<>();
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of Collection");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));
        }
        System.out.println(ar);
        hw.f1(ar);
        System.out.println(ar);
        
    }

}

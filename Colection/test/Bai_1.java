
import colection.HWCollection;
import static java.lang.Integer.sum;
import static java.lang.Math.sqrt;
import java.util.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Bai_1 {

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
            if (checkPrime(ar.get(i))) {
                ar.remove(i);
                i--;
            }
        }
    }

    void f2(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if (checkPrime(ar.get(i)) && ar.get(j) && ar.get(i) > ar.get(j)) {
                    int temp = ar.get(i);
                    ar.set(i, ar.get(j));
                    ar.set(j, temp);
                }

            }

        }
    }

    void f3(ArrayList<Integer> ar) { // tra ve tong cac so la so ngto
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (checkPrime(ar.get(i))) {
                sum += i;
            }
        }
    }

    void f4(ArrayList<Integer> ar) {// dem va tra ve cac so la so ngto
        for (int i = 0; i < ar.size(); i++) {
            int count = 0;
            if (checkPrime(i)) {
                count++;
                System.out.println(" " + i);
            }
        }
    }
    
    void f5(ArrayList<Interger> ar){
        int sum = 0;
        for (int i = 0; i < ar.size()/2; i++) {
            
                sum+=i;
            
            
        }
    }
    
    
    void f6(ArrayList<Integer> ar){
        int min = ar.get(0);
        int max = ar.get(0);
        for (int i = 0; i < ar.size(); i++) {
            if(ar.get(i) < min){
                min = ar.get(i);
            }
            if(ar.get(i) > max){
                max = ar.get(i);
            }
        }
        int sum = 0;
        sum = min+ max;
        System.out.println(sum);
        
    }
//    void f7(ArrayList<Integer> ar){
//        int min = ar.get(0);
//        int max = ar.get(0);
//        for (int i = 0; i < ar.size(); i++) {
//            if(ar.get(i) < min){
//                min = ar.get(i);
//            }
//            if(ar.get(i) > max){
//                max = ar.get(i);
//            }
//        }
        
    
       void f7(ArrayList<Integer> ar){
           int ar1<> = ar.copyOf(ar, ar.length);
           ar.sort(ar2,1,5);
           System.out.println(ar.toString(ar2));


        }
    }

class Using {

    public static void main(String[] args) {
        int sum = 0;
        Bai_1 hw = new Bai_1();
        ArrayList<Integer> ar = new ArrayList<>();
        Random rd = new Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);
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

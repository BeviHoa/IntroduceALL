/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colection;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lam_lai {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Hãy nhập số phần tử của mảng");
        int array[] = new int[n];
        System.out.println("Hãy nhâp phần tử cho mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + i + ":");
            array[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < array.length; i++) {
            if(checkPrime(array[i])){
                System.out.println("");
            }
            
        }

    }

}

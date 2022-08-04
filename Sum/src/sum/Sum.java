/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Admin
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static int Sum(int n){
        if (n<=1)
            return n;
        return n + Sum(n-1);
    }
    public static int main(String[] args) {
       int n= 5;
        System.out.println(Sum(n));   
        return 0;
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    public int sum(int n){
        if(n <= 1) return 1;
        
        return n + sum(n - 1);
    }
    //tim va tra ve ptu nho nhat trong mang
    public int findMinArray(int arr[], int n){
        if(n==1){
            return arr[0];
        }else{
            return Math.min(arr[n-1], findMinArray(arr, n-1));
        }
    }
    
    //tinh tong cac phan tu trong mang
    public int findSumArray(int arr[], int n){
        if(n <= 0) return 0;
        
        return (findSumArray(arr, n - 1) + arr[n - 1]);
    }
    
    //ktra xem mang có đối xứng không
    static int palinDrome(int arr[], int first, int end){
        if(first >= end) {return 1;}
        
        if(arr[first] == arr[end]){
            return palinDrome(arr, first + 1, end - 1);
        }else{
            return 0;
        }
    }
    
    //tim  GCD
    static int gcd(int a, int b){
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if(a == b)
            return a;
        if(a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    
    //tim luy thua
    public static int power(int x, int y){
        if(y != 0){
            return (x*power(x, y - 1));
        }else{
            return 1;
        }
    }
    //tim luy thua thuc te
    public static int fact(int n1){
        if(n1 == 0) return 1;
        
        return n1*fact(n1 - 1);
    }
    //Fibonacci
    public static int fibanacci(int n2){
         if(n2 <= 1) return n2;
         
         return fibanacci(n2-1) + fibanacci(n2-2);
    }
          
 
    public static void main(String[] args) {
       Bai1 d = new Bai1();    
       int arr[] = {3,4,8,4,78,3,-10};
       int n = arr.length;
       
        int result = d.sum(4);
        int result2 = d.findMinArray(arr, n);
        int result3 = d.findSumArray(arr, n);
        int x=3, y=4;
        int result4 = d.power(x, y);
        
        int n1 = 8;
        int result5 = d.fact(n1);
        System.out.println("Result = "  + result3);
        
        int result6 = d.fibanacci(9);
        
        
        if(palinDrome(arr, 0, n-1) == 1)
            System.out.println("Đối xứng");
        else
            System.out.println("Không đối xứng");
        int a = 100, b=58;
        System.out.println("GCD = " + gcd(a, b));
        System.out.println("Binh phuong = " + result4);
        System.out.println("Result of fact= "+result5);
        System.out.println("Result of fibonacci= "+result6);
}
}

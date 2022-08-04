
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

// title:Bubble sort algorithm.
// bài : J1.S.P0001

import java.util.Random;
import java.util.Scanner;

// J1.S.P0001:  bubbleSort
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static int checkInputInt(){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());//ktra dau vao
                return result;
            }catch(NumberFormatException e){ // neu ng nhập sai thì yêu cầu nhập lai
                System.out.println("Hay Nhap So: ");
                System.out.print("Nhap lai: ");
            }
        }
    }
    
    private static int inputArray(){
        int n = checkInputInt();
        while(true){
            if(n<=0){ // n mà âm thì cũng nhập lại
                System.out.print("Data is invalid ,please re-enter: ");
                n = checkInputInt();
            }else{
                return n;
            }
        }
    }
    
    private static int[] ranDom(int n){
       
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*n); // luu tru cac ptu ngau nhien            
        }
        return a;
    }
    private static void bubbleSorrt(int [] a){
        System.out.println("Unsorted array : ");
        for (int i = 0; i < a.length; i++) {// vong lap de hien thi ra mang truoc khi sort
            System.out.print(a[i] + " ");
            
        }
        for (int i = 0; i < a.length; i++) {// chay cac ptu trong mang
            for (int j = 0; j < a.length - i -1; j++) {//so sanh cac ptu va tien hanh doi cho
                if(a[j] > a[j+1]){ //so sanh giua 2 ptu
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println();
    }
    
    private static void print(int[] a){
        System.out.println("Sorted array: ");
        for (int i = 0; i < a.length; i++) {// vong lap in ra ptu sau khi da sort
            System.out.print(a[i] + " ");      
        }       
    }
    
    public static void main(String[] args) {
        int n = inputArray();
        int[] a = ranDom(n);
        bubbleSorrt(a);
        print(a);
    }
}    
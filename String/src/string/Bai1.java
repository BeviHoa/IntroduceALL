/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    public static void main(String[] args) {
        String s;
        System.out.println("Hãy nhập vào 1 chuỗi");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("Ki tự đầu là "+ s.charAt(0));
        System.out.println("Kí tự cuỗi là "+ s.charAt(s.length()-1));
    }
    
}

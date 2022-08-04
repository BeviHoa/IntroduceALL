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
//ktra chữ đầu có viết hoa không
public class Bai_1 {
    public static void main(String[] args) {
        String fullname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name");
        fullname = sc.nextLine().trim();
        lastSpace = fullname.lastIndexOf(" ");
        firstName = fullname.substring(lastSpace)
        
        
    }
    
}

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
public class Ktra_nguyenAm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chuỗi: ");
        String chuoi;
        char kytu;
        chuoi = sc.nextLine();
        int soNgAm = 0, soPhuAm = 0;
        
        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(i);
            soPhuAm ++;
            
        }
        System.out.println("Số nguyên âm" + soNgAm);    
        System.out.println("Số phụ âm" + soPhuAm);    
    }
    
    
}

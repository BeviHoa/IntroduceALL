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
public class DemNguyemAm_PhuAm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoa1;
        int count1 = 0, count2 = 0;
        System.out.println("Hayc nhập 1 chuỗi");
        hoa1 = sc.nextLine();
        for (int i = 0; i < hoa1.length(); i++) {
            char hoa1 = hoa1.charAt(i);
            if (hoa1 == 'a' || hoa1 == 'e' || hoa1 == 'i' || hoa1 == 'o' || hoa1 == 'u') {
                count1++;

            } else if (hoa1 >= 'a' && hoa1 <= 'z') {
                count2++;
            }

        }
        System.out.println("So nguyem am " + count2);
        System.out.println("So phu am " + count1);
    }

}

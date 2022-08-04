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
public class DemCoMayTuVietHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoa1;
        System.out.println("Hãy nhập 1 chuỗi");
        hoa1 = sc.nextLine();
        
        
        int count = 0, count2 = 0;
        for (int i = 0; i < hoa1.length(); i++) {
            if(Character.isUpperCase(hoa1.charAt(i)))
                count ++;
            if(Character.isLowerCase(hoa1.charAt(i)))
                count2++;
        }
        System.out.println(count);
        System.out.println(count2);
       
        
    }
}

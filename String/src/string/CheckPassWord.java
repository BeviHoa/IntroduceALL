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
public class CheckPassWord {

    public static void main(String[] args) {
        String password;
        int c = 0;
        CheckPassWord pass = new CheckPassWord();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your password : ");
        password = sc.nextLine();

        if(password.length()<= 8){        
            for (int i = 0; i <= password.length(); i++) {
                char x = password.charAt(i);
                if(Character.isLetter(x)){
                    if(Character.isDigit(x))
                        c=1;
                }
            }
            if (c == 1) System.out.println("Password is ok");
            else System.out.println("Password is NOT ok");
                
            }
        else System.out.println("Password có ít nhất 8 kí tự");
    }

}

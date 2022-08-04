
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
//J1.S.202
// Mục đích: Đảo ngược kí tự trong chuỗi nhập vào.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    
    public static String printReverse(String input){
        String reverWord = "";
        // lấy dảo ngược
        for (int i = input.length() - 1; i >= 0; i--) {
            reverWord += input.charAt(i); // cộng kí tự vào bên trái
        }
        return reverWord;
    }
    
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine().trim();
        
        // check xem có rỗng hay k 
        if(!input.isEmpty()){
            String output = printReverse(input);
            System.out.println("Sau khi đảo ngược: "+output);
        }
        
    }
}

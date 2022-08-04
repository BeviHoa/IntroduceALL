/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h203;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
// Mục đích: Đảo ngược từ trong chuỗi và in hoa chữ đầu tiên.
public class J1SH203 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    
    public static String Reverse (String input){
        String reverse = ""; 
        
        // tách chuỗi từ chỗ có 1 dấu cách hoặc nhiều.
       
        String[] words = input.split("\\s+"); 
        
        // Đảo ngược các từ vừa tách và cộng vào
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        
        // Viết hoa kí tự đầu tiên và gán
        reverse = reverse.substring(0,1).toUpperCase() + reverse.substring(1);
        return reverse.trim();
        
    }
    
    public static void main(String[] args) {
        do{
            System.out.println("Enter your string");
            String input = sc.nextLine().trim();
            if(!input.isEmpty()){ // nếu mà nó ko rỗng thì chạy xong là break
                String output = Reverse(input);
                System.out.println("String after reverse is: " + output);
                break;
            }else{
                // Nó sẽ hiển thị thông báo lỗi nếu người dùng nhập sai.
                System.err.println("You've enter empty string - "
                        + "Please Enter Again!");
            }
        }while(true);
        
    }
}

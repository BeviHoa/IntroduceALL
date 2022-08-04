/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;
import javafx.beans.binding.Bindings;

/**
 *
 * @author Admin
 */
public class Tap_luyen {
    int f1(String s){
        String s1[] = s.split("\\s+");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if(check (s1[i])){
                count ++;
        }
        }
        return 0;
    }
    boolean check1(String s){   // check chữ đầu có in hoa k
        for (int i = 0; i < s1.length(); i++) {
            if(s[i].charAt(0) < 91){
                System.out.println("chữ cái đầu in hoa");
            
        }else{
                System.out.println("Không in hoa");  
            }
              
        }     
    }
    
    boolean check2(String s){   // check xem số lần xuất hiện kí tự '?'
        char kytu = 'a';
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt[i] == kytu){
                count ++;
            }
            
            
        }
        
    }
    
    boolean check 3(String s){ // check chuỗi đối xứng
    char kytu;
            for (int i = 0; i < s1.length; i++) {
              kytu = s1.charAt(s1.length()-i-1);
              if(s.charAt(i)== kytu){
                  System.out.println("Chuỗi này dối xứng");
                  break;
              }else{
                  System.out.println("chuỗi này k đối xứng");
                  break;
              }
                
            }
    
}
    
    check 4(String s){ // dem số ký tự hoa và thường
    do {
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
    } while (chuoi.length() > 80);
         
    // đếm và in ra số lần xuất hiện của ký tự đó trong chuỗi
    // duyệt từ đầu đến cuối chuỗi
    // nếu có ký tự nào tại vị trí i bằng với ký tự ch thì tăng biến count lên 1
    for (int i = 0; i < chuoi.length(); i++) {
        // hàm isUpperCase() là hàm dùng để kiểm tra ký tự tại vị trí i
        // có phải là ký tự in hoa hay không.
        if (Character.isUpperCase(chuoi.charAt(i))) {
            soKyTuInHoa++;
        } 
             
        // hàm isLowerCase() là hàm dùng để kiểm tra ký tự tại vị trí i
        // có phải là ký tự in thường hay không.
        if (Character.isLowerCase(chuoi.charAt(i))) {
            soKyTuInThuong++;
        } 
             
        // hàm isDigit() là hàm dùng để kiểm tra ký tự tại vị trí i
        // có phải là số hay không.
        if (Character.isDigit(chuoi.charAt(i))) {
            soChuSo++;
        }
    }
    
}
   
    
    
    
        boolean check(String s){
        return s.length() > 3;
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap 1 tu nao do");
        String hoa;
        hoa = sc.nextLine();
        Tap_luyen hh = new Tap_luyen();
        for (int i = 0; i < hoa.length(); i++) {
            char hang = hoa.charAt(i);
            
            System.out.println(hang);
        }
        
        System.out.println("ĐỘ dài chuỗi là "+ hoa.length());
        System.out.println(hh.f1(hoa));
    }
    
}

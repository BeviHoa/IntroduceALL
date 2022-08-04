/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DemoString01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 == s2: "+(s1 == s2));
        
        String s3 = new String ("hello");
        String s4 = new String ("hello");
        System.out.println("s3 == s4: "+(s3 == s4));
        System.out.println("s3 equals s4" + s3.equals(s4));
        String s5 = new String(new char[]{'H','E','L','L','O'});
        System.out.println("s5 = " + s5);
        System.out.println("s3 equals Ignore Case s5 "+s3.equalsIgnoreCase(s5));
        System.out.println("s5.toLowerCase:" + s5.toLowerCase());
        // mọi thao tác với chuỗi s5 không làm thay đổi giá trị gốc immuable
        s5 = s5.toLowerCase();
        // muốn thay đổi thì bắt buộc chuỗi đó nằm bên trái của phép gán.
        System.out.println("s5 = " + s5);
        
      
    }
    
}

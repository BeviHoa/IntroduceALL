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
public class XoaKhoangTrang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String H1 ; 
        System.out.println("hãy nhập 1 chuỗi có khoảng trắng");
        H1 = sc.nextLine();
        H1  = H1.replaceAll(" ", "");
        System.out.println("Xóa xong ta được"+H1);
    }
    
}

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
//       Tìm và in ra các ký tự xuất hiện nhiều hơn một lần trong String cho trước không phân biệt chữ hoa hay chữ thường.
//       Nếu các ký tự trong chuỗi đều là duy nhất thì xuất ra "NO". Ví dụ chuỗi "Java" thì có ký tự 'a' hoặc String "JaVA"
//       cũng có kết quả tương tự.


public class BAITAP_ByHoa {
    
    // dem va hien thi so lương chữ trong chuỗi
    public void f1(String txt){
        String [] list = txt.split(" ");
        System.out.println(list.length);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BAITAP_ByHoa  v = new BAITAP_ByHoa();
        System.out.println("Hãy nhập 1 chuỗi");
        String txt = sc.nextLine();
        System.out.println("Input = " + v.f1(txt));
    }

    
}

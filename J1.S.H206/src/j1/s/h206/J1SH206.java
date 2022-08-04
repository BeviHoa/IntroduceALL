/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h206;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH206 {

    /**
     * @param args the command line arguments
     */
    private static Scanner SC = new Scanner(System.in);

    /**
     * @param args
     */
    // J1.S.H206. 
    // Mục đích: in ra kiểu như này 
    //12345
    //23451
    //34512
    //45123
    //51234

    
    // check du lieu dau vao
    public static int checkIntLimit(String s, int min, int max) {
        int n=0;
        do {
            try {
                System.out.print(s);
                String input = SC.nextLine();
                //ep kieu
                n = Integer.parseInt(input);

                if (n < min || n > max) {// neu ma đúng thì chay xong break
                    
                }
                break;
                // ngoại lệ thì sẽ hiện erro
            } catch (Exception e) {
                System.err.println("Phải nhập dữ liệu trong phạm vi "
                        + min + " đến " + max);
            }
        } while (true);
        return n;
    }

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) { //i=6 i chay tu min -> max
            for (int j = i; j <= max; j++) { //j chay tu min -> max
                System.out.print(j);// hiển thị ra 
            }
            for (int j = min; j < i; j++) { //1<5
                System.out.print(j);// in ra theo vong
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //khai bao va cho no co the nhap MAX_VALUE
        int min = checkIntLimit("Min: ",0, Integer.MAX_VALUE);
        int max = checkIntLimit("Max: ", min, Integer.MAX_VALUE);
        printSquare(min, max);
    }
    
}

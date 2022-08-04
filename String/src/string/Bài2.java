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
public class Bài2 {

    String daonguocchuoi(String s1) {
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        return sb.toString();

    }

    String daonguoctungtu1(String string) {
        String arrString[] = string.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String s : arrString) {
            StringBuffer sbFor = new StringBuffer(s);
            sb.append(sbFor.reverse() + " ");

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s;
        System.out.println("Hãy nhập 1 chuỗi");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String str;
        Bài2 bai2 = new Bài2();
        str = bai2.daonguocchuoi(s);
        if (s.equals(str)) {
            System.out.println("Chuoi" + s + " la doi xung");
        } else {
            System.out.println("Chuoi" + s + " ko la doi xung");
        }
        System.out.println(bai2.daonguoctungtu1(str));
    }
}

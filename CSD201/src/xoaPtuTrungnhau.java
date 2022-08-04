
import java.util.ArrayList;
import java.util.List;
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
public class xoaPtuTrungnhau {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập vào số phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numberList.add(sc.nextInt());
                    
        }
        
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if(!newList.contains(numberList.get(i))){
                newList.add(numberList.get(i));
            }
        }

        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }
    }
    
}

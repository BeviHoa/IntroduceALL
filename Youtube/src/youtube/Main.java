/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = getStudentInfo();
        students[1] = getStudentInfo();
        System.out.println(students[0]);
        students[0].doHomework("javaaa");
    }
    public static Student getStudentInfo(){
        Student s = null;
        String id, fullName, Address, email, phone;
        Scanner sc = new Scanner(System.in);
        System.out.println("ID : ");
        id = sc.nextLine();
        
        System.out.println("Full name : ");
        fullName = sc.nextLine();
        
        System.out.println("Address : ");
        Address = sc.nextLine();
        
        System.out.println("email : ");
        email = sc.nextLine();
        
        System.out.println("phone : ");
        phone = sc.nextLine();
        System.out.println("hoc phi : ");
        float fee = sc.nextFloat();
         
        s = new Student(id, fullName, email, Address, phone, fee);
        return s;
}
}

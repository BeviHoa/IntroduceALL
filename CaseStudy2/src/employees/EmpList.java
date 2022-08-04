/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class EmpList extends Vector <Employee> {
      Scanner sc = new Scanner(System.in);

    public EmpList() {
        super();
    }

    public void AddFromFile(String fName) {
        // Add employees from a text file 
        try {
            File f = new File(fName); // checking the file 
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);// read() 
            BufferedReader bf = new BufferedReader(fr); // readLine()
            String details; // E001, Hoang Van Tuan, 156 
            while ((details = bf.readLine()) != null) {
        // Splitting datails into elements
                StringTokenizer stk = new StringTokenizer(details, ";");
                String code = stk.nextToken().toUpperCase();
                String name = stk.nextToken().toUpperCase();
                int salary = Integer.parseInt(stk.nextToken()); // Create an employee 
                Employee emp = new Employee(code, name, salary);
                this.add(emp);
            } // adding this employee to the list
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void SaveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f); // write() 
            PrintWriter pw = new PrintWriter(fw); // println()| 
            for (Employee x : this) {
                pw.println(x.getCode() + "," + x.getName() + "," + x.getSalary());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private int Find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(aCode)) {
                return i;
            }
        }
        return -1;
    }

    public void AddNewEmp() {
        String newCode, newName;
        int salary;
        int pos;
        boolean valid = true;
        System.out.println("Enter New Employee Details:");
        do {
            System.out.print(" code E000:");
            newCode = sc.nextLine().toUpperCase();
            pos = Find(newCode);
            valid = newCode.matches("E\\d{3}$"); // Pattern: E and 3 digits 
            if (pos >= 0) {
                System.out.println(" The code is duplicated.");
            }
            if (!valid) {
                System.out.println(" The code: E and 3 digits.");
            }
        } while (pos >= 0 || (!valid));
        System.out.print(" name:");
        newName = sc.nextLine().toUpperCase();
        System.out.print(" salary:");
        salary = Integer.parseInt(sc.nextLine());
        this.add(new Employee(newCode, newName, salary));
        System.out.println("New Employee has been added.");

    }

    public void RemoveEmp() {
        String code;
        System.out.print("Enter the code of removed employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = Find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            this.remove(pos);
            System.out.println("The employee " + code + " has been removed.");

        }
    }

    public void Promote() {
        String code;
        System.out.print("Enter the code of promoted employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = Find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            int oldSalary = this.get(pos).getSalary();
            int newSalary;
            do {
                System.out.print("old salary: " + oldSalary + ", new salary: ");
                newSalary = Integer.parseInt(sc.nextLine());
            } while (newSalary < oldSalary);
            this.get(pos).setSalary(newSalary);
            System.out.println("The employee " + code + " has been updated.");
        }
    }

    public void Print() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        Collections.sort(this);
        System.out.println("\nEMPLOYEE LIST");
        System.out.println("-------------------------");
        for (Employee x : this) {
            x.print();
        }
    }

}
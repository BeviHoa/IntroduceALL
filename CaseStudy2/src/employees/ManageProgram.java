/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManageProgram {
    public static void main(String[] args) {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);
        Menu Menu = new Menu();
        Menu.add("Add new employee");
        Menu.add("Remove an employee");
        Menu.add("Promoting the emplyee's salary");
        Menu.add("Print the list");
        Menu.add("Save to files");
        Menu.add("Quit");
        int userChoice;
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename); // load initial data
        do {
        System.out.println("\nEMPLOYEE MANAGER");
        userChoice = Menu.getUserChoice();
        switch (userChoice) {
            case 1:
                list.AddNewEmp();
                changed = true;
                break;
            case 2:
                list.RemoveEmp(); 
                changed = true;
                break;
            case 3:
                list.Promote();
                changed = true;
                break;
            case 4:
                list.Print();
                break;
            case 5:
                list.SaveToFile(filename);
                changed = false;
            default:if (changed) {
                    System.out.print("Save changes Y/N? ");
                    String response = sc.nextLine().toUpperCase();
                    if (response.startsWith("Y")) {
                        list.SaveToFile(filename);
                    }

                }
            }
        }
        while (userChoice>0&&userChoice<6);
    }
}
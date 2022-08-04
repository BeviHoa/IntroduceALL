
import java.util.ArrayList;
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
public class SourceCode {
    private static final Scanner in = new Scanner(System.in);

    private static int inputNumber() {
        // loop until user input correct
        while (true) {
            try {
                return Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Please input number!!!");
                System.out.print("Try again: ");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList employees = new ArrayList();
    }
}

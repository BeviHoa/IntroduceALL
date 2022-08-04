
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Validation m = new Validation();
        Calculator c = new Calculator();
        m.menu();
        while (true) {
            int choice = m.getChoice();
            switch (choice) {
                case 1:
                    c.addMatrix();
                    break;
                case 2:
                    c.subMatrix();                   
                    break;
                case 3:
                    c.multiMatrix();                    
                    break;
                case 4:                   
                    System.exit(0);
                    break;
            }
        }

    }
}
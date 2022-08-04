
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Title: countCoins
//J1.S.H209

public class Main {
    private static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        File file = checkFile("Enter file name: ");
        countCoins(new Scanner(file));
    }
    
    
    public static File checkFile(String msg) {// kiểm tra xem file có tồn tại hay k
        String name = "";
        File file;
        do {
            System.out.print(msg);
            try {
                name = SC.nextLine();
                file = new File(name);
                if (file.exists()) {
                    break;
                } else {
                    System.err.println("File " + name + " does not exist. "
                            + "Please Re-Enter");
                }
            } catch (Exception e) {
                System.err.println("Invalid File Input. Please Re-Enter");
            }
        } while (true);
        return file;
    }

    
    public static void countCoins(Scanner input) {
        double totalCents = 0; 
        double amount = 0; //
        while (input.hasNext()) { //duyệt các phần tử
            
            String centValue = input.next();

            try {
                
                amount = Double.parseDouble(centValue);
            } catch (Exception e) {
                System.err.println("Invalid coins value!");
                return;
            }
            
            
            //pennies
            String centType = input.next();
            if (centType.equalsIgnoreCase("pennies")) {
                totalCents += amount * 1;                       //pennies = 1 cent
            } else if (centType.equalsIgnoreCase("nickels")) {
                totalCents += amount * 5;                       //nickels = 5 cent
            } else if (centType.equalsIgnoreCase("dimes")) {
                totalCents += amount * 10;                      //dimes = 10 cent
            } else if (centType.equalsIgnoreCase("quarters")) {
                totalCents += amount * 25;                      //quarters = 1 cent
            } else {
                System.out.println("Invalid Data!!");
                return;
            }
        }
        System.out.println("Total money: $" + String.format("%.2f", totalCents / 100));
    }
}
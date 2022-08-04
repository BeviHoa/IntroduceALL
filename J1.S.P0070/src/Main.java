
import process.Service;
import entity.Account;
import entity.Language;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import ulties.CheckInputLimit;
import ulties.Validates;

/* J1.S.P0070: Há»‡ thá»‘ng Ä‘Äƒng nháº­p cá»§a ngÃ¢n hÃ ng Tien Phong Bankâ€™s Ebank
      + NgÆ°á»�i dÃ¹ng chá»�n 1: chuyá»ƒn Ä‘á»•i ngÃ´n ngá»¯ giao diá»‡n sang tiáº¿ng viá»‡t vÃ  thá»±c hiá»‡n kiá»ƒm tra Ä‘Äƒng nháº­p
      + NgÆ°á»�i dÃ¹ng chá»�n 2: chuyá»ƒn Ä‘á»•i ngÃ´n ngá»¯ giao diá»‡n sang tiáº¿ng anh vÃ  thá»±c hiá»‡n kiá»ƒm tra Ä‘Äƒng nháº­p
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Service enterData = new Service();
        Scanner sc = new Scanner(System.in);

        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("0123456789", "12345abc"));
        list.add(new Account("0392268674", "phong123"));
        while (true) {
            System.out.println("1.Viet Nam");
            System.out.println("2.English");
            System.out.println("3.Exit");
            System.out.print("Please enter option : ");
            int ch = CheckInputLimit.checkInputIntLimit(1, 3);
            switch (ch) {
                case 1: {
                    Locale.setDefault(new Locale("vi", "VN"));// gá»�i Ä‘áº¿n hÃ m login vÃ  Ä‘á»‹nh dáº¡ng ngÃ´n ngá»¯ lang lÃ  VN
                    enterData.Login(list);
                    break;
                }
                case 2: {
                    // Locale trong Java Ä‘Æ°á»£c dÃ¹ng Ä‘á»ƒ Ä‘áº¡i diá»‡n cho ngÃ´n ngá»¯
                    Locale.setDefault(new Locale("en", "US"));
                    enterData.Login(list);// gá»�i Ä‘áº¿n hÃ m login vÃ  Ä‘á»‹nh dáº¡ng ngÃ´n ngá»¯ lang lÃ  Us
                    break;
                }
               
                
                case 3:
                    System.exit(0);// dá»«ng chÆ°Æ¡ng trÃ¬nh
            }
        }
    }
}

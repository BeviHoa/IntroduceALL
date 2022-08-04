package process;

import entity.Account;
import entity.Language;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import ulties.Validates;

/**
 *
 * @author Admin
 */
public class Service {
    
    private static final char[] chars = {'1', 'A', 'a', 'B', 'b', 'C',
        'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h',
        'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n',
        'O', 'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
        '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X', 'x',
        'Y', 'y', 'Z', 'z', '9'};
//enterData: Láº¥y dá»¯ liá»‡u nháº­p vÃ o
    public String enterData(String mess, String scuss, String error, int type) {
        Validates vl = new Validates();// gá»�i class Validates
        Scanner sc = new Scanner(System.in);
        String acc = "";// khai bÃ¡o acc kiá»ƒu String Ä‘á»ƒ chá»©a dá»¯ liá»‡u nháº­p vÃ o, String acc bao gÃ´m cáº£ acc vÃ  pass
        while (true) {// while:: náº¿u nháº­p size thÃ¬ nháº­p láº¡i
            System.out.println(mess);//in ra mess, ex: nháº­p acc count
            acc = sc.nextLine();
            if (vl.isAccountNumber(acc) && type == 1 || vl.isPassWord(acc) && type == 2) {// type 1: lÃ  dá»¯u liá»‡u tryá»�n vÃ o cáº£u acc,type 2: lÃ  dá»¯ liá»‡u truyá»�n vÃ o cá»§a pass
                System.out.println(scuss);//náº¿u Ä‘Ãºng thÃ¬ in sucuss
                break;
            } else if (acc.isEmpty()) { // náº¿u dá»¯ liá»‡u nháº­p acc rá»—ng thÃ¬ hiá»ƒn thá»‹ thÃ´ng bÃ¡o vÃ  nháº­p láº¡i
                System.out.println("Don't enter everything");
            } else {
                System.out.println(error);// náº¿u nháº­p lá»—i thÃ¬ in ra error
            }
        }
        return acc;
    }
// Random capcha
    public String randomCapcha() {
        // stringbuilder goi de dung append
        StringBuilder sb = new StringBuilder();
        // lay ra int cua char trong bang ascii
        int index;
        // Random ra 5 kÃ­ tá»± báº¥t kÃ¬ trong [] chars
        for (int i = 0; i < 6; i++) {
            index = (int) (Math.random() * (chars.length - 1));
            sb.append(chars[index]);// append dÃ¹ng Ä‘á»ƒ ná»‘i chuá»—i
        }
        return sb.toString();
    }

    public void Login(ArrayList<Account> list) {
        Language lang = new Language(); // Ä�á»‹nh dáº¡ng ngÃ´n ngá»¯
        Scanner sc = new Scanner(System.in);
        Validates vl = new Validates();
        String acc = enterData(lang.account, "", lang.accountInvalid, 1);// lang.account Ä‘á»ƒ hiá»‡n ra mess, lang.accountInvalid: dÃ¹ng Ä‘á»ƒ bÃ¡o lá»—i
        String pass = enterData(lang.password, "", lang.passwordInvalid, 2);//"": nháº­p thÃ nh cÃ´ng, 2: type 2 lÃ  dá»¯ liá»‡u pass nháº­p vÃ o
        while (true) {// nháº­p láº¡i náº¿u nháº­p sai capcha
             String randomCapcha = randomCapcha();
            System.out.println(lang.capcha);// hiá»ƒn thá»‹ thÃ´n bÃ¡o yÃªu cáº§u nháº­p
            System.out.println(randomCapcha);// hiá»ƒn thá»‹ capcha random
            String capcha = sc.nextLine();// nháº­p dá»¯ liá»‡u 
            if (vl.isCapcha(capcha, randomCapcha)) {// check input capcha vá»›i radom capcha
                System.out.println(lang.capchaValid);// Ä‘Ãºng thÃ¬ sáº½ hiá»ƒn thá»‹ thÃ´ng bÃ¡o vÃ  dá»«ng vÃ²ng while
                break;
            } else {
                System.out.println(lang.capchaInvalid);// sai thÃ¬ sáº½ hiá»ƒn thá»‹ thÃ´ng bÃ¡o lá»—i vÃ  nháº­p láº¡i
            }
        }  
        if (vl.authenAccount(list, acc, pass)) { //check login: check xem cÃ³ trÃ¹ng vá»›i list tk máº·c Ä‘á»‹nh cÃ³ sáºµn ko
            System.out.println(lang.login);// náº¿u mÃ  trÃ¹ng thÃ¬ sáº½ thong bÃ¡o login thÃ nh cÃ´ng

        } else {
            System.out.println(lang.loginFailed);// khÃ´ng trÃ¹ng sáº½ thÃ´ng bÃ¡o lá»—i
        }

    }

}

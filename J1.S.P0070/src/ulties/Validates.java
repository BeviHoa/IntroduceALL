package ulties;

import entity.Account;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
//J1.S.P0070: Login system of the Tien Phong Bankâ€™s Ebank
public class Validates {

    String regexAcountNumber = "\\d{10}";  // phai la so 0-9 va co 10 ki tu
    String regexPass = "((?=.*\\d)(?=.*[a-zA-Z]).{8,31})"; // phai co it nhat 1 ki tu ca so va chu, 8-31 ki tu
//check account
    public boolean isAccountNumber(String accountNumber) { //truyá»�n dá»¯ liá»‡u vÃ o vÃ  so sÃ¡nh vá»›i regexAcountNumber
        return accountNumber.matches(regexAcountNumber);
    }

    public boolean isPassWord(String passWord) {//truyá»�n dá»¯ liá»‡u vÃ o vÃ  so sÃ¡nh vá»›i regexPass
        return passWord.matches(regexPass);
    }

    public boolean isCapcha(String capchaInput, String randomCapCha) { // truyá»�n dá»¯ liá»‡u capcha nháº­p vÃ  vÃ o so sÃ¡nh vá»›i randomCapCha xem cÃ³ matches hay k
        return capchaInput.matches(randomCapCha);
    }
//ccheck Ä‘Äƒng nháº­p thÃ nh cÃ´ng hay khÃ´ng
    public boolean authenAccount(ArrayList<Account> list, String account, String pass) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) { 
            if (list.get(i).getAccount().equals(account) && list.get(i).getPass().equals(pass)) {// so sÃ¡nh account vÃ  password nháº­p vÃ o cÃ³ báº±ng vá»›i dá»¯ liá»‡u cÃ³ sáºµn hay ko
                flag = true; // náº¿u mÃ  Ä‘Ãºng thÃ¬ sáº½ lÃ  true vÃ  Ä‘Äƒng nháº­p thÃ nh cÃ´ng
                break;
            }
        }

        return flag;
    }

}
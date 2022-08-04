/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ResourceBundle;

/**
 *
 * @author Admin
 */
////J1.S.P0070: Login system of the Tien Phong Bankâ€™s Ebank
public class Language {
// khai bÃ¡o biáº¿n cáº§n chuyá»ƒn Ä‘á»�i ngÃ´n ngá»¯
    public String account;
    public String password;
    public String accountInvalid;// thÃ´ng bÃ¡o Ä‘Äƒng nháº­p account lá»—i
    public String passwordInvalid;// thÃ´ng bÃ¡o sai pass
    public String capcha;// chá»©a capcha
    public String capchaInvalid;// nháº­p capcha sai
    public String capchaValid;// capcha Ä‘Ãºng
    public String login; // thÃ´ng bÃ¡o login thanh cÃ´ng
    public String loginFailed;

      {
          // táº¡o ra ResourceBundle Ä‘á»ƒ Ä‘á»�c file properties
        ResourceBundle bundle = ResourceBundle.getBundle("ulties/Language");
        account = bundle.getString("Account");// dÃ¹ng bundle Ä‘á»ƒ truy xuáº¥t truy cáº­p vÃ o ulties/Language Ä‘á»ƒ láº¥y dá»¯ liá»‡u, lang dÃ¹ng Ä‘á»ƒ hiá»ƒu chá»�n ngÃ´n ngá»¯ tiáº¿ng viá»‡t hoáº·c tiáº¿ng anh
        account = bundle.getString("Account");
        password = bundle.getString("Password");
        passwordInvalid = bundle.getString("Password_Invalid");
        accountInvalid = bundle.getString("Account_Invalid");
        capcha = bundle.getString("Captcha");
        capchaInvalid = bundle.getString("Captcha_Invalid");
        capchaValid = bundle.getString("Captcha_Valid");
        login = bundle.getString("Login");
        loginFailed = bundle.getString("Login_Failed");
    }


}

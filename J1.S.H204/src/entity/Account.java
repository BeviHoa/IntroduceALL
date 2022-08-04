/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


/**
 *
 * @author Admin
 */
//J1.S.P0070: Login system of the Tien Phong Bankâ€™s Ebank
public class Account {
    String account;
    String pass;
// Ä‘á»ƒ chá»©a dá»¯ liá»‡u nháº­p vÃ o
    public Account() {
    }

    public Account(String account, String pass) {
        this.account = account;
        this.pass = pass;
    }
// xuáº¥t dá»¯ liá»‡u account
    public String getAccount() {
        return account;
    }
// nháº­p dá»¯ liá»‡u account
    public void setAccount(String account) {
        this.account = account;
    }
// xuáº¥t dá»¯ liá»‡u pass
    public String getPass() {
        return pass;
    }
// nháº­p dá»¯ liá»‡u pass
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}

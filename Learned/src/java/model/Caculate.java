/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Caculate {
    String num1, num2, op;

    public Caculate() {
    }

    public Caculate(String num1, String num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    public String getResult(){
        String rs = "";
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        switch(op){
            case "+":
                rs = n1 + "+" + n2 + "=" +(n1+n2);
                break;
            case "-":
                rs = n1 + "-" + n2 + "=" +(n1-n2);
                break;
            case "x": 
                rs = n1 + "x" + n2 + "=" +(n1*n2);
                break;
            case ":":
                if(n2==0){
                    rs = "cannot do work";
                }else{
                    rs = n1 + ":" + n2 + "=" +(n1/n2);
                    break;
                }
        }
        return rs;
    }
}

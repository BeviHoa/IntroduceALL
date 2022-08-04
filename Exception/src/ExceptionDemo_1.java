/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ExceptionDemo_1 {
    public int divide1(int a,int b) throws 
                        ArithmeticException
    {
        return a/b;
    }
    public int divide2(int a,int b){
        if (b==0) throws new ArithmeticException
                ("Hey.Demominator:0");
        return a/b;
    }
    public static void main(String[] args) {
        ExceptionDemo_1 obj = new ExceptionDemo_1();
        try {
            System.out.println(obj.divide1(6,0));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Admin
 */
public interface Caculator extends Repeatable {
    double PI = Math.PI; 

    int add(int a, int b);

    int sub(int a, int b);

    int mul(int a, int b);

    float div(int a, int b);
    
    default void showAddition(int a,int b){
        System.out.println( a + "+" + b + "=" + add(a,b));
    }

}

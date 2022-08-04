
import java.io.BufferedReader;
import java.io.InputStreamReader;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Validate {
    //nhap vao tu ban phim
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public int getBase(String msg, String err){
        while (true) { 
            try {
               int base = Integer.parseInt(in.readLine());
               if(base == 2 || base == 10 || base == 16){
                   return base;
               }
            } catch (Exception e) {
            }
            
        }
    }
}

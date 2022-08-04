/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Admin
 */
public class GP {
    GP(){
        System.out.println("Con Gp");
    }
    static {System.out.println("SSSSSS1");}
    {System.out.println("gp1");}
    {System.out.println("gp2");}
    static {System.out.println("SSSSSS2");}
}
class P extends GP{
    P(){
        System.out.println("Hoa");
    }
    static {System.out.println("LINH1");}
    {System.out.println("HOA1");}
    {System.out.println("HOA2");}
    static {System.out.println("LINH2");}
        
        }
class C extends P{
    C(){
        System.out.println("MEOW");
    }
    static {System.out.println("MEWLINH");}
    {System.out.println("1111");}
    {System.out.println("2222");}
    static {System.out.println("MEOHOA");}
    
}
class Using{
    public static void main(String[] args) {
        new GP();
        new P();
        new C();
        
        new P();
        new GP();
        new C();
        
        new C();
        new P();
        new C();
        new GP();
    }
        }
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
public abstract class LopCa implements IBoi {
    String tenca;
    String mausac;
    double cannang;
    boolean covay;

    public LopCa(String tenca, String mausac, double cannang, boolean covay) {
        this.tenca = tenca;
        this.mausac = mausac;
        this.cannang = cannang;
        this.covay = covay;
    }
    
    public void InThongTin(){
        System.out.println("Ten ca" +tenca );
        System.out.println("Mau sac" +mausac );
        System.out.println("Cannang" +cannang );
        System.out.println("Covay" +covay );
    }
    
    public void CachBoi(){
        System.out.println("Ca la biet boi");
    }
}

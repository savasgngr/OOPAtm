
package oopatm;

public class OOPAtm {

    public static void main(String[] args) {
       
        Hesap hesap = new Hesap("savas", "1234", 2000);
        ATM atm = new  ATM();
        
        atm.calıs(hesap);
        System.out.println("Çıkış işleminiz yapılıyor...");
    }
    
}

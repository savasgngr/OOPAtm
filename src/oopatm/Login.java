
package oopatm;

import java.util.Scanner;

public class Login {
    
   public boolean Login(Hesap hesap){
        
            Scanner scanner=new Scanner(System.in);
            String Kul_adi;
            String Kul_pass;
            
            System.out.print("Kullanınci adınızı giriniz:");
            Kul_adi=scanner.nextLine();
            System.out.print("şifrenizi giriniz:");
            Kul_pass=scanner.nextLine();
        
            if(hesap.getKullanici().equals(Kul_adi)&&hesap.getParola().equals(Kul_pass)){
                return  true;
            }else{
                return  false;
            }
    }
    
}

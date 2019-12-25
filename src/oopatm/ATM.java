
package oopatm;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class ATM {
    
    public void calıs(Hesap hesap){
        
        
        Login login =new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza HOŞGELDİNİZ");
        System.out.println("*********************");
        System.out.println("Kullanıcı Girişi:");
        System.out.println("**********************");
           int giris=3;
           
           while(true){
               
               if (login.Login(hesap)) {
                   System.out.println("giriş başarılı");
                   break;
               }else{
                   System.out.println("giriş başarısız.");
                   giris--;
                   System.out.println("kalan giriş hakkınız:"+giris);
               }
               if(giris==0)
               {
                   System.out.println("giriş hakkınız bitti.");
                   return;
               }
           }
           System.out.println("*****************");
           
           String islemler="1-Bakiye görüntüleme\n"
                           +"2-Para yatırma\n"
                           +"3-Para Çekme\n"
                           +"Cıkış işlemmi için Q ya basınız";
           System.out.println(islemler);
           System.out.println("*****************");
           while (true) {
               
               System.out.println("İşlemi Seçiniz:");
               String islem=scanner.nextLine();
               
               if (islem.equals("q")) {
                   
                   break;
                   
               }else if (islem.equals("1")) {
                   
                   System.out.println("Bakiyeniz:"+hesap.getBakiye());
                   
               }else if (islem.equals("2")) {
                   
                   System.out.print("Yatırmak istediğiniz tutar:");
                   int tutar=scanner.nextInt();
                   scanner.nextLine();
                   hesap.parayatırma(tutar);
                   System.out.println("yeni bakiyeniz:"+hesap.getBakiye());
               }else if (islem.equals("3")) {
                    System.out.print("çekmek istediğiniz tutarı giriniz:");
                    int tutar =scanner.nextInt();
                    scanner.nextLine();
                    hesap.paracekme(tutar);
                    System.out.println("kalan bakiyeniz:"+hesap.getBakiye() );
                   
               }else{
                   
                   System.out.println("Geçersiz işlem yeniden deneyiniz");
               }
            
        }
    }
}

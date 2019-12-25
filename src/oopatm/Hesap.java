/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopatm;

/**
 *
 * @author SAVAS
 */
public class Hesap {
    
    private String Kullanici;
    private  String parola;
    private  int bakiye;
    
    public Hesap(String Kullanıcı,String parola,int bakiye){
        
        this.Kullanici=Kullanıcı;
        this.parola=parola;
        this.bakiye=bakiye;
        
        
    }

    public String getKullanici() {
        return Kullanici;
    }

    public void setKullanici(String Kullanici) {
        this.Kullanici = Kullanici;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
     public void parayatırma(int tutar){
         this.bakiye+=tutar;
         System.out.println("Bakiyeniz:"+bakiye);
     }
     public void paracekme(int tutar){
         
         if((this.bakiye-tutar)<0){
             
             System.out.println("para cekme işlemi için yeterli bakiyeniz yoktur");
         }else{
             
             this.bakiye-=tutar;
             System.out.println("paranız cekiliyor yeni bakiyeniz:"+this.bakiye);
         }
         
     }
    
}

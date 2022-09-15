/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2022;

/**
 *
 * @author Berkay
 */
public class recapDemo1 {
    
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 3;
        int enBuyukSayi = sayi1;
        if (enBuyukSayi<sayi2) {
            enBuyukSayi=sayi2;
            System.out.println("En buyuk sayi : "+enBuyukSayi);
        }
        else if(enBuyukSayi<sayi3){
            enBuyukSayi=sayi3;
            System.out.println("En buyuk sayi : "+enBuyukSayi);
        }
        else{
            System.out.println("En buyuk sayi : "+enBuyukSayi);
        }
    }
           
}


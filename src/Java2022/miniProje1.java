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
public class miniProje1 {
    
    public static void main(String[] args) {
        int number = -2;
        boolean isPrime = true;
         if(number==1){
            System.out.println("Sayi Asal Değildir");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz Sayi");
            return;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0)
            {
                isPrime = false;
            }
            
        }
        if(isPrime){
            System.out.println("Sayi Asaldir");
        }
        else{
            System.out.println("Sayi Asal Değildir");
        }
    }
}

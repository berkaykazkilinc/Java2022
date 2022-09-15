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
public class miniProje3 {
    public static void main(String[] args) {
        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                total = total + i;
                
            }
            
        }
        if(total==number){
            System.out.println("Mükemmel Sayidir");
        }
        else{
            System.out.println("Mükemmel Sayi Değildir");
        }
    }
}

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
public class miniProje4 {
    public static void main(String[] args) {
        int number1 = 284;
        int number2 = 220;
        int toplam1 = 0;
        int toplam2=0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (toplam2 == number1 || toplam1 == number2) {
            System.out.println("Arkadaş Sayı.");
        } else {
            System.out.println("Arkadaş Sayı Değil.");
        }
    }
}

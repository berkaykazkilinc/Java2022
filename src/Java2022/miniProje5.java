/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2022;

import java.util.Scanner;

/**
 *
 * @author Berkay
 */
public class miniProje5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[]{1,3,4,5,6,7,8,9};

        System.out.print("Arayacağınız sayiyi girin : ");
        int aranacak = scanner.nextInt();

        boolean varMi = sayiBul(sayilar , aranacak);
        mesaj(varMi);


    }
    public static void mesaj(boolean varMi){
        if (varMi == true){
            System.out.println("Aradığınız sayı mevcuttur.");
        }
        else {
            System.out.println("Aradıgınız sayı bulunmamaktadır.");
        }
    }
    public static boolean sayiBul(int[] sayilar , int aranacak){
        boolean varMi = false;

        for(int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        return varMi;
    }
    }


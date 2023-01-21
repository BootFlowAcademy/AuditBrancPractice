package DataSet;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class WedonTest {
    public static void main(String[] args) {
        Scanner tahmin = new Scanner(System.in);
        Random makine = new Random();
        int[] array = new int[6];
        int[] myArray = new int[6];
        int[] dogruSayilar = new int[6];

        int tahmin1 = 0, tahmin2 = 0, tahmin3 = 0, tahmin4 = 0, tahmin5 = 0, tahmin6 = 0;
        int num, sameVal = 0;

        System.out.println();
        System.out.println("Sayısal Loto Çekilişine Hoşgeldiniz");
        System.out.println("Büyük İkramiye 150.000.000 TL");
        System.out.println("Çekiliş Ödülleri:");
        System.out.println();
        System.out.println("1 Sayıyı Doğru Bilene ---> 30 TL");
        System.out.println("2 Sayıyı Doğru Bilene ---> 100 TL");
        System.out.println("3 Sayıyı Doğru Bilene ---> 2.000 TL");
        System.out.println("4 Sayıyı Doğru Bilene ---> 300.000 TL");
        System.out.println("5 Sayıyı Doğru Bilene ---> 2.000.000 TL");
        System.out.println("6 Sayıyı Doğru Bilene ---> 150.000.000 TL");
        System.out.println();
        System.out.println("Sayısal Loto İçin 1 ile 90 Arasında Birbirinden Farklı 6 Tane Sayı Giriniz");
        System.out.print("1. Sayı ---> ");
        tahmin1 = tahmin.nextInt();
        System.out.print("2. Sayı ---> ");
        tahmin2 = tahmin.nextInt();
        System.out.print("3. Sayı ---> ");
        tahmin3 = tahmin.nextInt();
        System.out.print("4. Sayı ---> ");
        tahmin4 = tahmin.nextInt();
        System.out.print("5. Sayı ---> ");
        tahmin5 = tahmin.nextInt();
        System.out.print("6. Sayı ---> ");
        tahmin6 = tahmin.nextInt();
        System.out.println("Büyük Umutlarla Girmiş Olduğunuz Sayılar ---> " + tahmin1 + "   " + tahmin2 + "   " + tahmin3 + "   " + tahmin4 + "   " + tahmin5 + "   " + tahmin6);
        System.out.println();

        if( (tahmin1 > 0 && tahmin1 <= 90) && (tahmin2 > 0 && tahmin2 <= 90) && (tahmin3 > 0 && tahmin3 <= 90) && (tahmin4 > 0 && tahmin4 <= 90) && (tahmin5 > 0 && tahmin5 <= 90) && (tahmin6 > 0 && tahmin6 <= 90) ) {
            if ((tahmin1 != tahmin2) && (tahmin1 != tahmin3) && (tahmin1 != tahmin4) && (tahmin1 != tahmin5) && (tahmin1 != tahmin6)
                    && (tahmin2 != tahmin3) && (tahmin2 != tahmin4) && (tahmin2 != tahmin5) && (tahmin2 != tahmin6)
                    && (tahmin3 != tahmin4) && (tahmin3 != tahmin5) && (tahmin3 != tahmin6) && (tahmin4 != tahmin5) && (tahmin4 != tahmin6) && (tahmin5 != tahmin6)) {

                myArray[0] = tahmin1;
                myArray[1] = tahmin2;
                myArray[2] = tahmin3;
                myArray[3] = tahmin4;
                myArray[4] = tahmin5;
                myArray[5] = tahmin6;

                System.out.print("Çekiliş Sonucu Makinenin Seçtiği Sayılar ---> ");
                for (int i = 0; i < array.length; i++) {
                    sameVal = 0;
                    num = makine.nextInt(90) + 1;
                    for (int j = 0; j < i; j++) {
                        if (num == array[j]) {
                            sameVal--;
                        }
                    }
                    if (sameVal <= -1) {
                        i--;
                    } else {
                        array[i] = num;
                    }
                }
                sort(array);
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k] + "   ");
                }
                int dogruSayi = 0;

                for (int i = 0; i < myArray.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if(myArray[i] == array[j]){
                            dogruSayi++;
                            dogruSayilar[i]=myArray[i];
                        }
                    }
                }
                if (dogruSayi != 0){
                    System.out.println();
                    System.out.println("\nTebrikler "+ dogruSayi + " Sayıyı Doğru Bildiniz");
                    if(dogruSayi == 1){
                        System.out.print("===30 TL KAZANDINIZ===");
                        System.out.println();
                    }
                    if(dogruSayi == 2) {
                        System.out.print("===100 TL KAZANDINIZ===");
                        System.out.println();
                    }
                    if(dogruSayi == 3) {
                        System.out.print("===2.000 TL KAZANDINIZ===");
                        System.out.println();
                    }
                    if(dogruSayi == 4) {
                        System.out.print("===300.000 TL KAZANDINIZ===");
                        System.out.println();
                    }
                    if(dogruSayi == 5) {
                        System.out.print("===2.000.000 TL KAZANDINIZ===");
                        System.out.println();
                    }
                    if(dogruSayi == 6) {
                        System.out.print("===150.000.000 TL KAZANDINIZ===");
                        System.out.println();
                    }
                    System.out.print("Doğru Bildiğiniz Sayı veya Sayılar ---> ");
                    for (int i = 0; i < dogruSayilar.length; i++) {
                        if (dogruSayilar[i]!=0){
                            System.out.print(dogruSayilar[i] + "   ");
                        }
                    }
                }else System.out.println("\nMAALESEF HİÇBİR SAYIYI DOĞRU BİLEMEDİNİZ. ARTIK BİR DAHAKİ SEFERE :((");
            } else System.out.println("Tekrar Eden Rakamlar Olmamalı");
        }else System.out.println("1 ve 90 Arasında Bir Rakam Girmiyorsunuz");
    }
}

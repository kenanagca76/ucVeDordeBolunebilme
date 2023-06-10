package ciftSayiProgrami;

import java.util.Scanner;

public class ciftSayiProgrami {
    public static void main(String[] args) {
        int k;
        int toplam = 0;
        int sayiTane = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Girin : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("******************");
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayiTane++;
                System.out.println("3'e ve 4'e tam bölünebilen " + sayiTane + ".sayı: " + i);
            }
        }

        System.out.println("1'den "+k+"'ya kadar Toplam: " + sayiTane + " tane sayı hem 3'e hem de 4'e tam bölünebilmektedir.\n" +
                "Aritmetik Ortalaması: " + toplam / sayiTane + "\n");


    }
}



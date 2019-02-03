package kosulluifadeler;

import java.util.Scanner;

public class ElseIfYapisiApp
{
    public static void main(String[] args)
    {
        int sayi1, sayi2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2 = scanner.nextInt();

        if (sayi1 > sayi2)
        {
            System.out.println("Sayı 1 büyüktür sayı 2'den.");
        }
        else if (sayi1 == sayi2)
        {
            System.out.println("Sayı 1 eşittir sayı 2'ye.");
        }
        else if (sayi1 < 10)
        {
            if (sayi1 == 5)
            {
                System.out.println("Sayı1 5'e eşittir.");
            }
            System.out.println("Sayı1 10'dan küçüktür.");
        }
        else
        {
            System.out.println("Sayı1, sayı 2'den küçüktür.");
        }
        System.out.println("Güle güle...");
    }
}

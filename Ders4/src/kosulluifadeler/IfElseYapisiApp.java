package kosulluifadeler;

import java.util.Scanner;

public class IfElseYapisiApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();

        if (sayi1 == sayi2)
        {
            System.out.println("Sayı1 , sayı2'ye eşittir.");
        }
        else{
            System.out.println("Sayı 1, sayı2'ye eşit değildir.");
        }
        System.out.println("Güle güle...");
    }
}

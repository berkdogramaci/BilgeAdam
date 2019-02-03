package klavyeGirdileri;

import java.util.Scanner;

public class KlavyeGirdiApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //scanner.nextInt(); Integer değer okunacağı zaman bu methodu kullanıyoruz.
        //scanner.nextDouble(); Double değer okunacağı zaman bu mtehodu kullanıyoruz.
        //scanner.next(); // String değerleri okumak için.
        //scanner.nextLine(); // String değerleri okumak için.

        int sayi1, sayi2, sonuc;

        System.out.print("Bir sayı giriniz:");
        sayi1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2=scanner.nextInt();

        sonuc=sayi1+sayi2;
        System.out.println("Girdiğiniz sayıların toplamı: "+sonuc);
    }
}

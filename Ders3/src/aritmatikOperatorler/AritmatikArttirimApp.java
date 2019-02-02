package aritmatikOperatorler;

public class AritmatikArttirimApp
{
    public static void main (String[] args)
    {
        int a=2, b=7, c=40, d=50;

        a++; //Değişkenimi ata sonra arttır.
        System.out.println("Değişkenimi ata sonra arttır."+a);
        ++b; //Değişkenimi arttır sınra ata.
        System.out.println("Değişkenimi arttır sınra ata."+b);
        c--; //Değişkenimi ata sonra azalt.
        System.out.println("Değişkenimi ata sonra azalt."+c);
        --d; //Değişkenimi azalt sonra ata.
        System.out.println("Değişkenimi azalt sonra ata."+d);

        int x=7, y=7, sonuc1, sonuc2;

        sonuc1 = ++x;
        sonuc2 = y++;
        System.out.println("Sonuç 1: "+sonuc1);
        System.out.println("Arttırımdan sonraki x değeri: "+x);
        System.out.println("Sonuç 2: "+sonuc2);
        System.out.println("Arttırımdan sonraki y değeri: "+y);

    }
}

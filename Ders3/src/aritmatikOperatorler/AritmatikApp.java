package aritmatikOperatorler;

public class AritmatikApp
{
    public static void main (String[] args)
    {
        //Değişken isimleri farklı olmalıdır.
        int a = 7, c=3;
        int b = 3;
        int sonuc;

        double x = 7, y=3;
        double bolmeSonucu;

        sonuc = a + b;
        System.out.println("Toplama İşlemi: "+sonuc);

        sonuc = a-b;
        System.out.println("Çıkarma İşlemi: "+sonuc);

        sonuc = a*b;
        System.out.println("Çarpma İşlemi: "+sonuc);

        sonuc = a/b;
        System.out.println("Bölme İşlemi: "+sonuc);
        bolmeSonucu = x/y;
        System.out.println("Double bölme işlemi: "+bolmeSonucu);

        sonuc = a%b;
        System.out.println("Sayının kalanını hesaplamak: "+sonuc);

    }
}

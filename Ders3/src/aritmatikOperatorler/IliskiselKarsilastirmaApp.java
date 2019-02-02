package aritmatikOperatorler;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IliskiselKarsilastirmaApp
{

    public static void main (String[] args)
    {
        int a=5, b=10;
        // < , > , <= , >=, ==, !=

        boolean sonuc;
        sonuc = a<b;
        System.out.println("A'nın B'den küçük olma durumu: "+sonuc);
        System.out.println(a<b);

        sonuc = a>b;
        System.out.println("A'nın B'den büyük olma durumu: "+sonuc);

        sonuc = a<=b;
        System.out.println("A'nın B'den küçük eşit olma durumu: "+sonuc);

        int c=5;
        sonuc = a<=c;
        System.out.println("A'nın B'den küçük eşit olma durumu: "+sonuc);

        sonuc = a>=b;
        System.out.println("A'nın B'den büyük eşit olma durumu: "+sonuc);

        sonuc = a==b;
        System.out.println("A'nın B'ye eşit olma durumu: "+sonuc);

        sonuc = a!=b;
        System.out.println("A'nın B'ye eşit olmama durumu: "+sonuc);
    }
}

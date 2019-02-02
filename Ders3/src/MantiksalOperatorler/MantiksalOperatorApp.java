package MantiksalOperatorler;

public class MantiksalOperatorApp
{
    public static void main (String[] args)
    {
        /*
        <var1> && <var2> ve operatörü
        Sağındaki ve solundaki değişken değeri true ise "true" değerini verir.
         */

        /*
         <var1> || <var2> ya da operatörü
         Sağındaki ve solundaki değerler false ise "false" değerini verir.
         Sağındaki ve solundaki değerlerden birisi true ise "true" değerini verir.
         */

        /*
         !<var1> değil mi operatörü
         verilen değişkenin tersini verir.
         verilen değişken true ise false değerini verir.
         verilen değişken false ise true değerini verir.
        */

        /*
         <var1> ^ <var2> xor işareti ya da işleminin tersi.
         Sağındaki ve solundaki değerler true ise "true" değerini döndürür.
         */

        boolean x=true, y=false, z=true, t=false, sonuc;

        sonuc = x&&z;
        System.out.println("x ve z and(&&) ile karşılaştırılması: "+sonuc);
        sonuc = x&&y;
        System.out.println("x ve y and(&&) ile karşılaştırılması: "+sonuc);

        sonuc = y||t;
        System.out.println("y ve t ya da(||) ile karşılaştırılması: "+sonuc);

        sonuc = x||y;
        System.out.println("x ve y ya da(||) ile karşılaştırılması: "+sonuc);

        sonuc = !x;
        System.out.println("x değişkeninin tersini al: "+sonuc);

        sonuc = !y;
        System.out.println("y değişkeninin tersini al: "+sonuc);

        sonuc = x^z;
        System.out.println("x ve z operatörünün tersi (^) ile karşılaştırılması: "+sonuc);


    }
}

package tipdonusumleri;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class Main
{
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //tekli comment

        /*
        çoklu comment
         */

        // Tip dünüşümleri genelde küçükten büyüğe doğru olur.
        // Dikkat etmemiz gereken büyükten küçüğe doğru tip dönüşümleri.
        byte bytea = 127;
        int intb;

        intb=bytea;

        intb = 1000;
        bytea= (byte) intb;
        System.out.println("Maximum boyutu geçmediğim tip dönüşümü "+bytea);

        intb = 256;
        bytea= (byte) intb;
        System.out.println("Maximum boyutu geçtiğinde tip dönüşümü "+bytea);

        Integer xInt = 12;
        String xString;

        xString = xInt.toString();
        System.out.println(xString);



    }
}

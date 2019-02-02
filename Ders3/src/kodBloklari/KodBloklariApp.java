package kodBloklari;

public class KodBloklariApp
{
    public static void main (String[] args)
    {
       int a=5;
       System.out.println("Kademe 1 a değeri: "+a);
       {
           a=3;
           System.out.println("Kademe 2 a değeri: "+a);
           {
               int b=10;
               a=2;
               System.out.println("Kademe 3 "+"a değeri: "+a+" b değeri: "+b);
               {
                   b=7;
                   System.out.println("Kademe 4: "+"a değeri: "+a+" b değeri: "+b);
               }
           }
       }

    }
}

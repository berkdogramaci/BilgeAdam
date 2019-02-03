package kosulluifadeler;

import java.util.Scanner;

public class SwitchCaseStringApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hangi güb haftanın kaçıncı günü: ");
        String haftaninGunu = scanner.next();

        switch (haftaninGunu)
        {
            case "pazartesi":
                System.out.println("Haftanın birinci günüdür.");
                break;
            case "salı":
                System.out.println("Haftanın ikinci günüdür.");
                break;
            case "çarşamba":
                System.out.println("Haftanın üçüncü günüdür.");
                break;
            case "perşembe":
                System.out.println("Haftanın dördüncü günüdür.");
                break;
            case "cuma":
                System.out.println("Haftanın beşinci günüdür.");
                break;
            case "cumartesi":
                System.out.println("Haftanın altıncı günüdür.");
                break;
            case "pazar":
                System.out.println("Haftanın yedinci günüdür.");
                break;
                default:
                    System.out.println("Yanlış ifade girdiniz.");
        }
    }
}

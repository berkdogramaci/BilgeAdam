package kosulluifadeler;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir değer giriniz:");
        int ifade = scanner.nextInt();

        switch (ifade) {
            case 1:
                System.out.println("Case1 verilen ifade: " + ifade);
                break;
            case 2:
                System.out.println("Case2 verilen ifade: " + ifade);
                break;
            case 3:
                System.out.println("Case3 verilen ifade: " + ifade);
                break;
            default:
                System.out.println("Verilen ifadenin karşılığı yok.");


        }
    }
}

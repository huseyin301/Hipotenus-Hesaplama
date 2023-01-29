package Hipotenus;
import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int knr1 , knr2 ;
        double hpt ;

        System.out.print("Birinci kenarı giriniz : ");
        knr1 = sc.nextInt();

        System.out.print("İkinci kenarını griniz : ");
        knr2 = sc.nextInt();

        hpt = Math.sqrt((knr1 * knr1) + (knr2 * knr2)) ;

        System.out.println("Birinci kenar :  " + knr1);
        System.out.println("İkinci kenar :  " + knr2);
        System.out.println("Hipotenüs = " + hpt);
        System.out.println("Formül : (a.a) + (b.b) = (c.c)");

    }
}

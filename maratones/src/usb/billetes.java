package usb;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class billetes {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        float t = l.nextFloat();

        int p = (int) t;
        System.out.println("NOTAS: ");

        int d100 = p / 100;
        System.out.println(d100 + " nota(s) de R$ 100.00");

        int r100 = p % 100;
        int d50  = r100 / 50;
        System.out.println(d50 + " nota(s) de R$ 50.00");

        int r50 = r100 % 50;

        int d20 = r50 / 20;
        int r20 = r50 % 20;
        System.out.println(d20 + " nota(s) de R$ 20.00");

        int d10 = r20 / 10;
        int r10 = r20 % 10;
        System.out.println(d10 + " nota(s) de R$ 10.00");

        int d5 = r10 / 5;
        int r5 = r10 % 5;
        System.out.println(d5 + " nota(s) de R$ 5.00");

        int d2 = r5 / 2;
        int r2 = r5 % 2;
        System.out.println(d2 + " nota(s) de R$ 2.00");
        
        System.out.println("MONEDAS: ");
        
        int d1 = r2 / 1;
        int r1 = r2 % 1;
        System.out.println(d1 + " moneda(s) de R$ 1.00");
        
        double w= (t-p);
        
        double d05 = w / 0.5;
        int m5 = (int) d05;
        double r05 = w % 0.5;
        System.out.println(m5 + " moneda(s) de R$ 0.50");
        
        double d02 = r05 / 0.25;
        int m2 = (int) d02;
        double r02 = r05 % 0.25;
        System.out.println(m2 + " moneda(s) de R$ 0.25");
        
        double d01 = r2 / 0.1;
        int m1 = (int) d01;
        double r01 = r2 % 0.1;
        System.out.println(m5 + " moneda(s) de R$ 0.10");
        
        double d005 = r01 / 0.05;
        int m05 = (int) d005;
        double r005 = r01 % 0.05;
        System.out.println(m5 + " moneda(s) de R$ 0.05");
        
        double d001 = r005 / 0.01;
        int m01 = (int) d05;
        double r001 = r005 % 0.01;
        System.out.println(m5 + " moneda(s) de R$ 0.01");
        System.out.println(w);
    }
}

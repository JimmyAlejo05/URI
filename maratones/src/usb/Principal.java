package usb;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        int h = l.nextInt();
        int v = l.nextInt();
    
        System.out.println(df.format((double)(h*v)/12));
    }
}
package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class Crowstorm {

    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        double d, t_r, t_x, t_y, x1, x2, y1, y2, v, r1, r2;
        x1=l.nextDouble();
        y1=l.nextDouble();
        x2=l.nextDouble();
        y2=l.nextDouble();
        v=l.nextDouble();
        r1=l.nextDouble();
        r2=l.nextDouble();
       
            t_x = (x2 - x1) * (x2 - x1);
            t_y = (y2 - y1) * (y2 - y1);

            d = Math.sqrt(t_x + t_y);
            d += v * d;

            t_r = r1 + r2;
            System.out.println((d <= t_r) ? "Y" : "N");
        
    }
}
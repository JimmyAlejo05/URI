
package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class PomekonsBattle {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int t, b, a1, d1, L1, a2, d2, L2, ValorGolpe1, ValorGolpe2, Maior;
       t=l.nextInt();
        for (int n = 0; n < t; n++) {
            b=l.nextInt();

            a1=l.nextInt();
            d1=l.nextInt();
            L1=l.nextInt();
     
            a2=l.nextInt();
            d2=l.nextInt();
            L2=l.nextInt();
         
            ValorGolpe1 = ((a1 + d1) / 2);
            ValorGolpe2 = ((a2 + d2) / 2);

            if (L1 % 2 == 0) {
                ValorGolpe1 = ValorGolpe1 + b;
            } else if (L2 % 2 == 0) {
                ValorGolpe2 = ValorGolpe2 + b;
            } else if (L1 % 2 == 0 && L2 % 2 == 0) {
                ValorGolpe1 = ValorGolpe1 + b;
                ValorGolpe2 = ValorGolpe2 + b;

            }
            Maior = (ValorGolpe1 > ValorGolpe2) ? ValorGolpe1 : ValorGolpe2;
            if (ValorGolpe1 == ValorGolpe2) {
                System.out.printf("Empate\n");
            } else if (Maior == ValorGolpe1) {
                System.out.printf("Dabriel\n");
            } else if (Maior == ValorGolpe2) {
                System.out.printf("Guarte\n");
            }
        }
    }
}
    
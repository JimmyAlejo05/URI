package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class Xenlonguinho {

     static int[] a = new int[1001];

    static void frequency() {
        a[0] = 3;
        a[1] = 1;
        for (int i = 2; i <= 1000; i++) {
            int count = 2;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            a[i] = count;
        }
     
    }
    
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        frequency();
        int test_case=f.nextInt();
        int number;
        while ((test_case--) != 0) {
            number=f.nextInt();
            int count = 1;
            for (int i = 3; i <= number; i++) {
                if (a[i] % 2 == 0) {
                    count++;
                
                }
            }
            System.out.print(count);
        }
       
    }
}

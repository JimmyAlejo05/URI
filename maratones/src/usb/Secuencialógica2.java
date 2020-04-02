
package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class Secuencialógica2 {
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int x = l.nextInt();
        int y = l.nextInt();
        for (int i = 1; i <=y; i++) {  
            for (int j = 0; j <x; j++) {
                System.out.print(i+++" ");
            }
            System.out.println();
            i--;
        }
       
    }
}

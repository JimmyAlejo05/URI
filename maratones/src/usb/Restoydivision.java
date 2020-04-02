
package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class Restoydivision {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int x = l.nextInt();
        int y = l.nextInt();
       
        for (int i=x; i < y; i++) {
         int   j=i%5;
            if (j==2 || j==3){
                System.out.println(i);
            }
             
        }
       
    }
}

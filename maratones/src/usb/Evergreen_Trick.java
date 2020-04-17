package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class Evergreen_Trick {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        int t;
        t = f.nextInt();
        String p;
	p = f.nextLine();
        while ((t--) != 0) {

            String str, s;
            str = f.nextLine();
            s = f.nextLine();
            for (int i = 1, j = 0, k = 0; i <= str.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(s.charAt(k));
                    if (s.length() > k + 1) {
                        System.out.print(s.charAt(k + 1));
                    }
                    k += 2;
                } else {
                    System.out.print(str.charAt(j));
                    System.out.print(str.charAt(j + 1));
                    j += 2;
                }
            }
            System.out.print('\n');
        }
    }
}
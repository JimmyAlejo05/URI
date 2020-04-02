/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class Array123 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int m, i = 1, j = 2, k = 3;
        int[] array = new int[102];
        int counter = 1, buff = 2, swap = 1, temp, temp2, swap2;

        m=l.nextInt();
        
            int duff = m - 1;
            swap2 = m;

            int o = 1, yarab;

            array[counter] = i;
            array[m] = j;

            while (counter < m - 1) {
                counter++;
                array[counter] = k;
            }
            while (o <= m) {
                System.out.printf("%d", array[o]);
                o++;
            }
            System.out.printf("\n");

            int count = 0;
            while (buff <= m) {
                count++;

                if (count == (m / 2)) {
                    if (m % 2 == 0) {
                        array[count] = 2;
                        array[count + 1] = 1;
                        while (i <= m) {
                            System.out.printf("%d", array[i]);
                            i++;
                        }
                        System.out.printf("\n");

                        i = 1;
                        swap++;
                        swap2--;
                        duff--;
                        buff++;
                    } else if (m % 2 != 0) {

                        array[duff + 1] = 3;
                        array[count] = 3;
                        array[count + 1] = 2;
                        while (i <= m) {
                            System.out.printf("%d", array[i]);
                            i++;
                        }
                       System.out.printf("\n");

                        i = 1;
                        swap++;
                        swap2--;
                        duff--;
                        buff++;

                        array[swap] = 1;
                        array[duff + 2] = 2;

                    }
                }
                temp = array[swap];
                array[swap] = array[buff];
                array[buff] = temp;

                temp2 = array[swap2];

                array[swap2] = array[duff];
                array[duff] = temp2;

                buff++;
                duff--;
                swap++;
                swap2--;

                i = 1;
                while (i <= m) {
                    if (m == 2) {
                        break;
                    }
                    System.out.printf("%d", array[i]);
                    i++;
                }
                if (m != 2) {
                    System.out.printf("\n");
                }

                i = 1;
            }
        }
    
}

package usb;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jimmy rios
 */
public class Rieles {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int n, i, j, flag, flag1, flag2;
        int[] num = new int[1001];

        while (true) {
            n = f.nextInt();
            if (n == 0) {
                break;
            }
            while (true) {
                j = 1;
                flag = 0;
                flag1 = 0;
                Stack<Integer> pila = new Stack<Integer>();
                for (i = 1; i <= n; i++) {
                    num[i] = f.nextInt();
                    if (num[i] == 0) {
                        flag = 1;
                        System.out.println(n+1);
                        System.out.println("Yes");
                        break;
                    }
                }
                i = 1;
                while (true) {
                    if (i > n) {
                        break;
                    }
                    if (flag1 == 1) {
                        break;
                    }
                    if (flag == 1) {
                        break;
                    }
                    while (true) {
                        if (!pila.empty() && pila.peek() == num[i]) {
                            pila.pop();
                            break;
                        } else if (j <= n) {
                            pila.push(j);
                            j++;
                            if (pila.peek() == num[i]) {
                                pila.pop();
                                break;
                            }
                        } else {
                            flag1 = 1;
                            break;
                        }
                    }
                    i++;

                }
                if (flag == 1) {
                    break;
                }
                if (pila.empty()) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");                    
                }
            }
        }
    }
}

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
public class TheLastAnalogimon {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n, m, a=0, b=0, c=0, r=0;
        n = l.nextInt();
        m = l.nextInt();
        int[][] ans = new int[101][101];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = l.nextInt();
                if (ans[i][j] == 1) {
                    a = i;
                    b = j;
                }
                if (ans[i][j] == 2) {
                    r = i;
                    c = j;
                }
            }
        }
        int res = 0;
        res = Math.abs(c - b) + Math.abs(r - a);
        System.out.printf("%d", res);
    }
}

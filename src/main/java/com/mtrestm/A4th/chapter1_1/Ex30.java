/**
 * @program: A4th
 * @description: 1.1.30　数组练习。编写一段程序，创建一个 N×N 的布尔数组 a[][] 。其中当 i 和 j 互质时（没有相同 因子）， a[i][j] 为 true ，否则为 false 。
 * @author: QianShaobo
 * @create: 2019-05-05 11:53
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Ex30 {

    //todo:转notion
    public static int euclid(int p, int q) {//欧几里得辗转相除法求最大公约数
        if (p < q) { //使q值永远最小
            int t = p;
            p = q;
            q = t;
        }
        if (q == 0) {
            return p;
        } else {
            return euclid(q, p % q);
        }
    }


    public static void main(String[] args) {

        int n = StdIn.readInt();
        boolean[][] a = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = euclid(i, j) == 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }
}

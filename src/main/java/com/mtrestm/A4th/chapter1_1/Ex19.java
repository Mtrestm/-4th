/**
 * @program: A4th
 * @description: 1.1.19 在计算机上运行以下程序：
 * @author: QianShaobo
 * @create: 2019-04-25 16:40
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex19 {//递归斐波那契
    public static long F(int N) {

        if (N == 0) return 0;

        if (N == 1) return 1;

        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {

        for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));
            System.out.print(F(N)+ " " );
    }

}



/**
 * @program: A4th
 * @description:
 * @author: QianShaobo
 * @create: 2019-04-25 16:14
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex16 {
    public static String exR1(int n) {

        if (n <= 0) return "";


        return exR1(n-3) + n + exR1(n-2) + n; }

    public static void main(String[] args) {
        System.out.println(exR1(4));
        System.out.println(exR1(5));
    }
}

/**
 * @program: A4th
 * @description:
 * @author: QianShaobo
 * @create: 2019-04-22 18:29
 **/

package com.mtrestm.A4th.chapter1_1;

public class EX07b {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println((1 + 1000) * 998 / 2 + 1);
    }
}

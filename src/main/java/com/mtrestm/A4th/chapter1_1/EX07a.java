/**
 * @program: A4th
 * @description:
 * @author: QianShaobo
 * @create: 2019-04-22 18:13
 **/

package com.mtrestm.A4th.chapter1_1;

public class EX07a {
    public static void main(String[] args) {
        double t = 9.0;
        int count = 0;
        while (Math.abs(t - t / 9.0) > .111) {
            count++;
            t = (t + t / 9.0) / 2;
        }
        System.out.println("count = " + count);
        System.out.printf("t=%.5f", t);

    }
}

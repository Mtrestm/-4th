/**
 * @program: A4th
 * @description:
 * @author: QianShaobo
 * @create: 2019-04-22 18:33
 **/

package com.mtrestm.A4th.chapter1_1;

public class EX07c {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("result =" + 1000 * Math.ceil(Math.log(1000) / Math.log(2)));
    }

}

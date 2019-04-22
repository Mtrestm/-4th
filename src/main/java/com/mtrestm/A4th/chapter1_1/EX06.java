/**
 * @program: A4th
 * @description:
 * @author: QianShaobo
 * @create: 2019-04-22 18:03
 **/

package com.mtrestm.A4th.chapter1_1;

public class EX06 { //得到一个斐波那契数列
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f = f + g; //上两个元素之和
            g = f - g; // 变成上一个f
        }


    }
}

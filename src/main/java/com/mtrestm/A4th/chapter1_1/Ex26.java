/**
 * @program: A4th
 * @description: 1.1.26　将三个数字排序。假设 a 、 b 、 c 和 t 都是同一种原始数字类型的变量。证明以下代码能够将 a 、 b 、 c 按照升序排列：
 *
 * 58
 *
 * if (a > b) { t = a; a = b; b = t; } if (a > c) { t = a; a = c; c = t; } if (b > c) { t = b; b = c; c = t; }
 * @author: QianShaobo
 * @create: 2019-04-29 10:24
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex26 {

    /**
     * 交换的结果总是将小的数放在前面
     * @param a
     * @param b
     * @param c
     */
    public static void sortNum(int a, int b, int c) {
        int t;
        if (a > b) {//交换a,b
            t = a;
            a = b;
            b = t;
        }
        if (a > c) { //交换a,c
            t = a;
            a = c;
            c = t;
        }
        if (b > c) { //交换b,c
            t = b;
            b = c;
            c = t;
        }

        System.out.println("a = " + a + ",b = " + b + ",c = " + c);
    }

    public static void main(String[] args) {
        sortNum(5, 23, 3);
    }
}

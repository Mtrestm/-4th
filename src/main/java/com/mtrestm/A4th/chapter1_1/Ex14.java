/**
 * @program: A4th
 * @description: 1.1.14 编写一个静态方法 lg() ，接受一个整型参数 N ，返回不大于 log 2 N 的最大整数。不要使用 Math 库。
 * @author: QianShaobo
 * @create: 2019-04-25 15:43
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex14 {
    public static int lg(int N) {

        int count = 0;
        do {
            N = N >> 1;
            count++;
        } while (N != 0);

        return count - 1;
    }

    public static void main(String[] args) {

//        System.out.println( Math.floor(Math.log(17) / Math.log(2))); //API

        System.out.println(lg(17));
    }
}

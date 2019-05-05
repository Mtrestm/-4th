/**
 * @program: A4th
 * @description: 1.1.27 二项分布。估计用以下代码计算 ,将已经计算过的值保存在数组中并给出一个更好的实现。
 * @author: QianShaobo
 * @create: 2019-04-30 10:05
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex27 {

    private static long COUNT = 0;
    private static long COUNT2 = 0;

    private static double[][] MATRIX;


    public static double binomial(int N, int k, double p) {
//        将会产生的递归调用次数：

        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static void main(String[] args) {

        System.out.println("res: " + binomial(100, 50, 0.25) + ",count:" + COUNT);

    }
}

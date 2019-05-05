/**
 * @program: A4th
 * @description: 测试矩阵
 * @author: QianShaobo
 * @create: 2019-05-05 16:07
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Ex33 {
    public static void main(String[] args) {
        int h, w;
        System.out.println("The length of Array x : ");
        h = StdIn.readInt();
        double[] x = new double[h];
        for (int i = 0; i < x.length; i++) {
            x[i] = StdIn.readDouble();
        }
        System.out.println("The length of Array y : ");
        w = StdIn.readInt();
        double[] y = new double[w];
        for (int i = 0; i < y.length; i++) {
            y[i] = StdIn.readDouble();
        }

        System.out.println("The height and with of a matrix a: ");
        h = StdIn.readInt();
        w = StdIn.readInt();
        double[][] a = new double[h][w];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) { //每个小数组的长度
                a[i][j] = StdIn.readDouble();
            }
        }

        System.out.println("dot(x, y): " + Matrix.dot(x, y));//向量点乘

    }
}

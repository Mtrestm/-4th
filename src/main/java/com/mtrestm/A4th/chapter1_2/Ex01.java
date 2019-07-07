/**
 * @program: A4th
 * @description: 1.2.1　编写一个 Point2D 的用例，从命令行接受一个整数 N。 在单位正方形中生成 N 个随机点，然后计 算两点之间的最近距离。
 * @author: QianShaobo
 * @create: 2019-05-05 17:08
 **/

package com.mtrestm.A4th.chapter1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;

public class Ex01 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }

        if (N > 1) {
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) { //注意j的起始值比当前的i大
                    if (points[i].distanceTo(points[j]) < min) {//比较
                        min = points[i].distanceTo(points[j]);
                    }
                }
            }
            System.out.println(min);
        }

    }
}

/**
 * @program: A4th
 * @description: 1.1.31　随机连接。编写一段程序，从命令行接受一个整数 N 和 double 值 p （0 到 1 之间）作为参数， 在一个圆上画出大小为 0.05 且间距相等的 N 个点，然后将每对点按照概率 p 用灰线连接。
 * @author: QianShaobo
 * @create: 2019-05-05 14:46
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Ex31 {
    static class Point{
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        int N = StdIn.readInt();
        double p = StdIn.readDouble();
        if (p <= 0 || p >= 1) {
            throw new IllegalArgumentException("值p要在0到1之间");
        }
        Point[] points = new Point[N];

        double angle = 360.0 / N;
        StdDraw.circle(0.5, 0.5, 0.5);
        StdDraw.setPenRadius(0.05); //点的半径

        for (int i = 0; i < N; i++) {
            points[i] = new Point(0.5 + 0.5 * Math.cos(angle * i * Math.PI / 180),
                    0.5 + 0.5 * Math.sin(angle * i * Math.PI / 180));
            StdDraw.point(points[i].x, points[i].y);
        }

        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.GRAY);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }


    }
}

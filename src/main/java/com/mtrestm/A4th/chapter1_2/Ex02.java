/**
 * @program: A4th
 * @description: 1.2.2　编写一个 Interval1D 的用例，从命令行接受一个整数 N。 从标准输入中读取 N 个间隔（每个间隔 由一对 double 值定义）并打印出所有相交的间隔对。
 * @author: QianShaobo
 * @create: 2019-05-05 17:42
 **/

package com.mtrestm.A4th.chapter1_2;


import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class Ex02 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        Interval1D[] intervals = new Interval1D[n];
        for (int i = 0; i < n; i++) {
            intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }
        if (n > 2) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (intervals[i].intersects(intervals[j])) {
                        System.out.println(intervals[i] + " intersects " + intervals[j]);
                    }
                }
            }
        }
    }
}

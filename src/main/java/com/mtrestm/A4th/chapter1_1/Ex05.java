/**
 * @program: A4th
 * @description: 编写一段程序, 如果 d o u b l e类型的变量 x和 y都严格位于 0 和 1 之间则打印 t r u e,否则打印f a l s e。
 * @author: QianShaobo
 * @create: 2019-04-22 17:53
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Ex05 {
    public static void main(String[] args) {

        double x = StdIn.readDouble();
        double y = StdIn.readDouble();

        System.out.println(0 < x && x < 1 && 0 < y && y < 1);
    }
}

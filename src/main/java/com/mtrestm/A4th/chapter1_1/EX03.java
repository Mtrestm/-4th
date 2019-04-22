/**
 * @program: A4th
 * @description: 编写一个程序, 从命令行得到三个整数参数。如果它们都相等则打印 e q u a l,否则打印 n o t  e q u a l。
 * @author: QianShaobo
 * @create: 2019-04-22 17:40
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class EX03 {
    public static void main(String[] args) {

        int x = 0;
        boolean isEqual = true;
        for (int i = 0; i < 3; i++) {
            int readNum = StdIn.readInt();
            if (i >= 1) {
                if (x != readNum) {
                    isEqual = false;
                    break;
                }
            }
            x = readNum;
        }
        if (isEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

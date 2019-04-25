/**
 * @program: A4th
 * @description: 1.1.11　编写一段代码，打印出一个二维布尔数组的内容。其中，使用*表示真 空格表示假, 打印出行号和列号。
 * @author: QianShaobo
 * @create: 2019-04-24 15:51
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex11 {
    private static void printBooleanMatrix(boolean[][] a) {
        System.out.print(" ");
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(i+1);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i+1);
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //二维布尔矩阵
        boolean[][] a = new boolean[][]{{true, false, true}, {false, true, false, false}, {true, true, true, false}};
        printBooleanMatrix(a);
    }
}

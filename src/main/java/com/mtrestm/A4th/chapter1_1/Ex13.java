/**
 * @program: A4th
 * @description: 1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置（交换行和列）。
 * @author: QianShaobo
 * @create: 2019-04-24 18:09
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex13 {

    private static String[][] swapLineColumn(String[][] matrix) {
        String[][] swapMatrix = new String[][]{};

        for (int i = 0; i < matrix[0].length; i++) {//n行 (外循环决定行数)
            for (int j = 0; j < matrix.length; j++) { // m列 (内循环决定列数)
//                System.out.print(matrix[i][j]);
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
        return swapMatrix;
    }

    public static void main(String[] args) {
        String[][] a = new String[][]{{"a", "b", "c"}, {"b", "d", "d"}, {"e", "e", "c"}, {"m", "n", "a"}};
        System.out.println(swapLineColumn(a));
    }
}

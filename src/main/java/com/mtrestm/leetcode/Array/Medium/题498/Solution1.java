/**
 * @program: A4th
 * @description: 498. 对角线遍历
 * @author: Shaobo.Qian
 * @create: 2019-07-24 09:22
 **/

package com.mtrestm.leetcode.Array.Medium.题498;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        //1.定义二维矩阵
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {};
//        int[][] matrix = {{2, 5}, {8, 4}, {0, -1}};
        Arrays.stream(findDiagonalOrder(matrix)).forEach(System.out::println);

    }

    public static int[] findDiagonalOrder(int[][] matrix) {//模拟前进
        //1.描述矩阵
        //1.1矩阵有多少行
        int row = matrix.length;
        if (row == 0) {
            return new int[0];
        }
        //1.2矩阵有多少列
        int column = matrix[0].length;
        //1.3矩阵有多少个元素
        int totalCounts = row * column;
        //2.当前位置
        //2.1当前已走过的元素个数
        int currentCounts = 0;

        //2.2当前所在的行 index
        int currentRow = 0;
        //2.3当前所在列 index
        int currentColumn = 0;
        //3.对角线
        //3.1有多少条对角线
        int totalDiagonal = (row + column) - 1;
        //3.2 现在在第几条对角线上
        int currentDiagonal = 1;

        int[] result = new int[totalCounts];
        //4.模拟前进
        //4.1当前所在的位置
        while (currentCounts < totalCounts) {
            //3.2 每条角线最长的步数 (m,n 取较小)
            int diagonalDistance;
            if (currentDiagonal <= Math.min(row, column)) {
                diagonalDistance = currentDiagonal;
            } else if (Math.min(row, column) < currentDiagonal && currentDiagonal <= Math.max(row, column)) {
                diagonalDistance = Math.min(row, column);
            } else {
                diagonalDistance = (row + column) - currentDiagonal;
            }
            //3.3 判断是斜向上还是斜向下走
            if (currentDiagonal % 2 == 1) {//向上
                while (diagonalDistance > 0) {
                    result[currentCounts] = matrix[currentRow][currentColumn];
                    currentCounts++;
                    if (diagonalDistance == 1) {
                        if (currentColumn < column - 1) {
                            currentColumn++;
                        } else {
                            currentRow++;
                        }
                    } else {
                        currentColumn++;
                        currentRow--;
                    }
                    diagonalDistance--;
                }

            } else {//向下
                while ((diagonalDistance > 0)) {
                    result[currentCounts] = matrix[currentRow][currentColumn];
                    currentCounts++;
                    if (diagonalDistance == 1) {
                        if (currentRow == row - 1) {
                            currentColumn++;
                        } else {
                            currentRow++;
                        }

                    } else {
                        currentColumn--;
                        currentRow++;
                    }
                    diagonalDistance--;
                }
            }

            currentDiagonal++;

        }


        return result;
    }
}

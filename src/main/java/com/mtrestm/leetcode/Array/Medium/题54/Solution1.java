/**
 * @program: A4th
 * @description: 54. 螺旋矩阵
 * @author: Shaobo.Qian
 * @create: 2019-07-23 19:44
 **/

package com.mtrestm.leetcode.Array.Medium.题54;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        //1.定义二维矩阵
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(matrix).forEach(System.out::println);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;//矩阵有多少行
        if (row == 0) {
            return result;
        }
        int column = matrix[0].length;//矩阵有多少列
        //矩阵包含元素的总个数
        int totalCounts = row * column;
        //当前已走过的元素个数
        int currentCounts = 0;

        //2.记录当前的位置
        //当前的行index
        int currentRow = 0;
        //当前的列index
        int currentColumn = 0;

        //3.已走过的圈数(right，down，left，up都为0时,圈数+1)
        int round = 0;

        //4. 使用4个int right，down，left，up来记录当前要向这四个方向前进的优先级和前进的步数
        int right = column - 1 - round * 2;
        int down = row - 1 - round * 2;
        int left = column - 1 - round * 2;
        int up = row - 2 - round * 2;

        //5.循环条件
        while (currentCounts < totalCounts) {
            result.add(matrix[currentRow][currentColumn]);
            //6.在各个方向上前进
            if (right > 0) {
                currentColumn++;
                right--;
            } else if (down > 0) {
                currentRow++;
                down--;
            } else if (left > 0) {
                currentColumn--;
                left--;
            } else if (up > 0) {
                currentRow--;
                up--;
                if (up == 0) {
                    round++;
                    //7.right，down，left，up同时为0,一圈已经走完，round++,并重置下一圈四个方向要走的步数
                    right = column - round * 2;
                    down = row - 1 - round * 2;
                    left = column - 1 - round * 2;
                    up = row - 2 - round * 2;

                }
            }
            currentCounts++;
        }

        return result;
    }
}

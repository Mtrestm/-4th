/**
 * @program: A4th
 * @description: 118. 杨辉三角
 * @author: Shaobo.Qian
 * @create: 2019-07-14 11:54
 **/

package com.mtrestm.leetcode.Array.Easy.题118;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {

        List<List<Integer>> result = generate(8);
        result.forEach(System.out::println);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }

            }
            result.add(list);
        }
        return result;
    }

}

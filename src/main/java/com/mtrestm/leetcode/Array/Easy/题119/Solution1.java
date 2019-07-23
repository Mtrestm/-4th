/**
 * @program: A4th
 * @description: 119. 杨辉三角 II
 * @author: Shaobo.Qian
 * @create: 2019-07-14 12:25
 **/

package com.mtrestm.leetcode.Array.Easy.题119;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        int rowIndex = 1;
        List<Integer> list = getRow(rowIndex);
        list.forEach(System.out::println);
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            //1.每次添加一个元素1到行末尾
            list.add(1);
            for (int j = i - 1; j > 0; j--) {
            //2.在将原来保存的元素全部更新
                list.set(j, list.get(j - 1) + list.get(j));
            }
        }
        return list;
    }


}

/**
 * @program: A4th
 * @description: 1.1.28  将已经计算过的值保存在数组中并给出一个更好的实现。 删除重复元素。修改 BinarySearch 类中的测试用例来删去排序之后白名单中的所有重复元素。 36
 * @author: QianShaobo
 * @create: 2019-04-30 10:35
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex28 {

    public static void main(String[] args) {
        int[] whitelist = {7, 1, 5, 1, 9, 5, 7, 7, 5, 1};
        Arrays.sort(whitelist);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < whitelist.length; i++) {
            if (!(i > 0 && whitelist[i] == whitelist[i - 1])) {
                list.add(whitelist[i]);
            }
        }
        System.out.println(list);
        whitelist = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            whitelist[i] = list.get(i);
        }
        System.out.println(BinarySearch.indexOf(whitelist, StdIn.readInt()));

    }
}

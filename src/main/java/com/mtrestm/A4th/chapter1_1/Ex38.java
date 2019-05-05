/**
 * @program: A4th
 * @description: 比较二分搜素和暴力搜素的时间
 * @author: QianShaobo
 * @create: 2019-05-05 16:35
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Ex38 {

    public static void main(String[] args) {

        int[] whitelist = {1, 2, 13, 4, 1, 22, 3, 34, 1, 22, 3, 4, 1, 2, 13, 4, 11, 222, 23, 34, 1, 322, 3, 445};
        Arrays.sort(whitelist);
        int key = StdIn.readInt();

        long startTime = System.currentTimeMillis();
        if (BruteForceSearch.rank(whitelist, key) == -1) {
            System.out.println(key);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("BruteForceSearch:%d", endTime - startTime));

        startTime = System.currentTimeMillis();
        if (BinarySearch.indexOf(whitelist, key) == -1) {
            System.out.println(key);

        }
        endTime = System.currentTimeMillis();
        System.out.println(String.format("BinarySearch:%d", endTime - startTime));
    }
}

/**
 * @program: A4th
 * @description: 暴力搜素
 * @author: QianShaobo
 * @create: 2019-05-05 16:36
 **/

package com.mtrestm.A4th.chapter1_1;

public class BruteForceSearch {
    public static int rank(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

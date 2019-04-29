/**
 * @program: A4th
 * @description: 1.1.22　使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。每当该方法 被调用时，打印出它的参数 lo 和 hi 并按照递归的深度缩进。提示：为递归方法添加一个参数 来保存递归的深度。
 * @author: QianShaobo
 * @create: 2019-04-26 11:27
 **/

package com.mtrestm.A4th.chapter1_1;

import java.util.Arrays;

public class Ex22 {

    public static int rank(int[] a, int key) {

        return rank(a, 0, a.length - 1, key, 0);
    }

    private static int rank(int[] a, int lo, int hi, int key, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println("lo = " + lo + ",hi = " + hi);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (a[mid] > key) {
            hi = mid - 1;
            return rank(a, lo, hi, key, depth + 1);
        } else if (a[mid] < key) {
            lo = mid + 1;
            return rank(a, lo, hi, key, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {

        int[] a = {2, 4, 435, 456, 23, 1, 38, 56, 90};

        Arrays.sort(a);
        int key = 4;
        int pos = rank(a, key);
        if (pos == -1) {
            System.out.println(key + " not found");
        } else {

        System.out.println("pos = " + pos);
        }


    }
}

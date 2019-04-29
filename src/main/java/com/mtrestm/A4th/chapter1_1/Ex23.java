/**
 * @program: A4th
 * @description:1.1.23　为 BinarySearch 的测试用例添加一个参数： + 打印出标准输入中不在白名单上的值；-，则打 印出标准输入中在白名单上的值。
 * @author: QianShaobo
 * @create: 2019-04-28 19:08
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Ex23 {
    public static int rank(int[] a, int key) {
        return rank(a, 0, a.length - 1, key);
    }

    public static int rank(int[] a, int lo, int hi, int key) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (a[mid] > key) {
            return rank(a, lo, mid - 1, key);
        } else if (a[mid] < key) {
            return rank(a, mid + 1, hi, key);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 435, 456, 23, 1, 38, 56, 90};
        Arrays.sort(a);
        System.out.println("print - or + ?");
        char arg = StdIn.readChar();
        StdIn.readLine();
        System.out.println("Input keys:");
        String[] keys = StdIn.readLine().split(" ");

        for (int i = 0; i < keys.length; i++) {
            if (rank(a, Integer.parseInt(keys[i])) != -1 && arg == '-') {
                System.out.println(keys[i]);
            }
            if (rank(a, Integer.parseInt(keys[i])) == -1 && arg == '+') {
                System.out.println(keys[i]);
            }
        }


    }
}

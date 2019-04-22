/**
 * @program: A4th
 * @description: The {@code BinarySearch} class provides a static method for binary searching for an integer in a sorted array of integers.
 * @author: QianShaobo
 * @create: 2019-04-22 16:33
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class BinarySearch {
    private BinarySearch() {

    }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param a   the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0; //数组最小索引
        int hi = a.length - 1; //数组最大索引
        while (lo <= hi) { //核心思想:在二分搜索的过程中比较key和a[mid]元素,来达到二分的使小索引在不停增大,大索引在不停减小,来找到目标元素key在数组中对应的索引
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; //找不到的情况
    }


    @Deprecated
    public static int rank(int[] a, int key) {
        return indexOf(a, key);
    }

    public static void main(String[] args) {

        In in = new In("/Users/Mtrestm/Documents/SEEDS/A4th/src/main/java/com/mtrestm/A4th/chapter1_1/BinarySearchReadFile"); // read the integers from a file
        int[] whitelist = in.readAllInts(); //读取文件

        Arrays.sort(whitelist); //排序(二分搜索只针对有序数组有效)

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1) {
                System.out.println("key = " + key);
            }
        }


    }
}

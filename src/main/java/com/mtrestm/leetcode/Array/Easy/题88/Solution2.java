/**
 * @program: A4th
 * @description:普通解法
 * @author: Shaobo.Qian
 * @create: 2019-07-11 05:56
 **/

package com.mtrestm.leetcode.Array.Easy.题88;

import java.util.Arrays;

public class Solution2 { //没有利用原来数组有序的优点

    public static void main(String[] args) {
        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = {1, 2, 3, 5, 6};
        int n = 5;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

}

/**
 * @program: A4th
 * @description: 双指针从后往前
 * @author: Shaobo.Qian
 * @create: 2019-07-14 11:08
 **/

package com.mtrestm.leetcode.Array.Easy.题88;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
//        int[] nums1 = {4, 7, 9, 0, 0, 0,0,0};
//        int m = 3;
//        int[] nums2 = {1, 2, 3, 5, 6};
//        int n = 5;
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        //1.定义指针指向nums1的尾部
        int p1 = m - 1;
        //2.定义指针指向nums2的尾部
        int p2 = n - 1;
        int p = m + n - 1;
        //3.比较p1,p2索引对应的值大小,将较大值放入对应p索引位置
        while (p1 >= 0 && p2 >= 0) {
            nums1[(p--)] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        //4,num1多出来的部分不用动,nums2多出来的部分放入nums1中
        if (p2 >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, p + 1);
        }

    }
}

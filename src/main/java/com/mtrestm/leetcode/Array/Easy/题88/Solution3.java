/**
 * @program: A4th
 * @description: 双指针重头开始
 * @author: Shaobo.Qian
 * @create: 2019-07-11 06:09
 **/

package com.mtrestm.leetcode.Array.Easy.题88;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = {1, 2, 3, 5, 6};
        int n = 5;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //1.定义一个数组(额外的空间),用来保存nums1中的实际有效数组
        int[] copyNums1 = new int[m];
        System.arraycopy(nums1, 0, copyNums1, 0, m);

        //2.定义指针变量(双指针法)
        int p1 = 0; //指向copyNums1的当前位置
        int p2 = 0; //指向num2的当前位置
        int p = 0; //指向nums1的当前位置

        //3.挨个比较copyNums1和nums2中的元素,将较小值赋值到nums1中
        while ((p1 < m) && (p2 < n)) {//定义循环条件
            nums1[p++] = copyNums1[p1] <= nums2[p2] ? copyNums1[p1++] : nums2[p2++];
        }
        //4.将copyNums1或者nums2多出的部分拷贝到num1中~
        if (p1 < m) {
            System.arraycopy(copyNums1, p1, nums1, p1 + p2, m + n - p1 - p2);
        }
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }

    }
}

/**
 * @program: A4th
 * @description: 88. 合并两个有序数组
 * @author: Shaobo.Qian
 * @create: 2019-07-10 05:40
 **/

package com.mtrestm.leetcode.Array.Easy.题88;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        //初始化有序整数数组1
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums1 = {8, 9, 10, 0, 0, 0, 0};
        int[] nums1 = {4,0,0,0,0,0};

        int m = 1;
        //初始化有序整数数组2
//        int[] nums2 = {2, 5, 6};
//        int[] nums2 = {10, 12, 15, 16};
        int[] nums2 = {1,2,3,5,6};
        int n = 5;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    /**
     * 本质上是往有序数组中插入元素,可以使用二分法
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //0.处理边界值的情况
        //0.1 num2最大的元素比num1最小的元素还小
        if (nums2.length == 0) {
            return;
        }
        if (nums1.length == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (nums2[nums2.length - 1] < nums1[0]) {
            for (int i = m - 1; i >= 0; i--) {
                nums1[i + n] = nums1[i];
                nums1[(i - (m - n))] = nums2[(i - (m - n))];
            }

        } else if (m == 0|| nums2[0] > nums1[m - 1] ) {
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[i - m];
            }
            //0.2 num2最小的元素比num2最大的元素还大
        }

        //1.先将num2中的一个元素插入到nums1中
        //2.使用二分搜素,搜素到要插入的位置对应的数组索引
        else {
            for (int i = 0; i < nums2.length; i++) {
                int num = nums2[i];
                int left = 0; //左边界
                int right = m - 1 + i; //右边界
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (nums1[mid] == num) {
                        //将mid后面元素往后挪一位
                        break;
                    } else if (nums1[mid] < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }

                }
                rightMove(nums1, left, right, num);

            }
        }


        //3.插入后,比它大的元素索引都+1


    }

    public static void rightMove(int[] nums, int left, int right, int num) {
        for (int i = right; i > left; i--) {
            nums[i + 1] = nums[i];
        }
        nums[left + 1] = num;
    }
}

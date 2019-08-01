/**
 * @program: A4th
 * @description: 561. 数组拆分 I
 * @author: Shaobo.Qian
 * @create: 2019-07-29 08:04
 **/

package com.mtrestm.leetcode.Array.Easy.题561;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 9, 3, 2, 5, 4,9,9,11,11,11};
//        int[] nums = {1, 3, 9, 3, 2, 5};
//        int[] nums = {7, 3, 1, 0, 0, 6};
//        int[] nums = {3,1, 0, 0, 6};
        int[] nums = {0, 1, 0, 3};
        quickSort(nums, 0, nums.length - 1);
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println(arrayPairSum(nums));
//        Arrays.sort(nums);

    }

    public static int arrayPairSum(int[] nums) {
        //1.将数组排序(对数组进行快速排序)
        quickSort(nums, 0, nums.length - 1);
        int sum = 0;
        //2.按顺序两两1组
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        //3.最大和 nums[0] nums[2] nums[4]...nums[n-2]

        return sum;
    }

    //2.递归调用,使数组不断缩小,到达递归出口条件
    public static void quickSort(int[] nums, int start, int end) {
        if ((end - start) < 1) {
            return;
        }
        int splitIndex = splitArr(nums, start, end);
        while (splitIndex == start) {
            splitIndex = splitArr(nums, start + 1, end);
        }
        while (splitIndex == end) {
            splitIndex = splitArr(nums, start, end - 1);
        }
        quickSort(nums, start, splitIndex - 1);
        quickSort(nums, splitIndex + 1, end);

    }

    //1.选择一个基准值,切分数==>确定切分元素的索引
    public static int splitArr(int[] nums, int start, int end) {
        int baseElement = nums[end];
        int n = start;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] < baseElement) {
                if (i != n) {
                    swapElement(nums, i, n);
                }
                n++;
            }
        }
        swapElement(nums, end, n);
        return n;
    }


    /**
     * 交换元素
     *
     * @param nums
     * @param index1
     * @param index2
     */
    public static void swapElement(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }

}


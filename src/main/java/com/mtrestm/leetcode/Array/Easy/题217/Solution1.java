/**
 * @program: A4th
 * @description: 217. 存在重复元素
 * @author: Shaobo.Qian
 * @create: 2019-07-19 06:20
 **/

package com.mtrestm.leetcode.Array.Easy.题217;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//        int[] nums = {1, 3, 4, 2};

//        int[] nums = {3, 1};
//        System.out.println(containsDuplicate(nums));

        int[] nums = {7, 3, 1, 0, 0, 6};
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        //1.将数组排序 (快速排序)
        recurSplit(nums, 0, nums.length - 1);

        //2.遍历数组和上一个元素比较相同返回 true
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param arr
     * @param start 起始索引
     * @param end   尾端索引
     */
    public static void recurSplit(int[] arr, int start, int end) {
        //1.递归出口,数组只剩一个元素或者空
        if ((end - start) < 1) {
            return;
        }
        //1.拆分数组返回基准值的索引
        int splitIndex = splitArr(arr, start, end);
        //2.等于数组起始索引start
        while (splitIndex == start) {
            splitIndex = splitArr(arr, start + 1, end);
        }
        //3.等于数组的尾端索引
        while (splitIndex == end) {
            splitIndex = splitArr(arr, start, end - 1);
        }
        //4.递归调用
        recurSplit(arr, start, splitIndex - 1);
        recurSplit(arr, splitIndex + 1, end);



    }

    /**
     * @param arr   要拆分的数组
     * @param start 起始索引
     * @param end   尾端索引
     * @return 基准值在数组中的索引位置(每一次调用方法后, 基准值在数组中的位置确定)
     */
    public static int splitArr(int[] arr, int start, int end) {
        //1.选择数组中最后一个元素作为基准值
        int base = arr[end];

        //2.定义变量保存上一个已经比较过的比基准值小的元素的索引
        int n = start;
        //3.遍历移动指针扫描数组,将小于基准值的元素放在基准值的左边
        for (int i = start; i < end; i++) {
            if (arr[i] < base) {
                if (i != n) {
                    exchangeElement(arr, i, n);
                }
                n++;
            }
        }

        //4.将基准值交换到合适的位置
        exchangeElement(arr, end, n);

        return n;
    }

    /**
     * 交换元素
     *
     * @param arr
     * @param index1
     * @param index2
     */
    public static void exchangeElement(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

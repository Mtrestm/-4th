/**
 * @program: A4th
 * @description: 189. 旋转数组
 * @author: Shaobo.Qian
 * @create: 2019-07-14 15:05
 **/

package com.mtrestm.leetcode.Array.Easy.题189;

import java.util.Arrays;

public class Solution1 {//数组拷贝

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void rotate(int[] nums, int k) {//空间复杂度O(k)

        //1.将要移除的数组拷贝出来
        int[] copyNums = new int[k];
        System.arraycopy(nums, nums.length - k, copyNums, 0, k);
        //2.将没有拷贝出的元素统一右移k位
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        //3.讲拷贝出的元素加入原数组
        System.arraycopy(copyNums, 0, nums, 0, k);
    }


    public static void rotate1(int[] nums, int k) {//空间复杂度O(1)

        //1.定义临时变量,记录每次要被转到0位置的元素
        for (int i = 0; i < k; i++) {
            //2.连续转k次,每次右移一位
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }

    }


}

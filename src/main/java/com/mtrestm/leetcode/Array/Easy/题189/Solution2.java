/**
 * @program: A4th
 * @description: 189.旋转数组
 * @author: Shaobo.Qian
 * @create: 2019-07-19 05:30
 **/

package com.mtrestm.leetcode.Array.Easy.题189;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        rotate(nums, k);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void rotate(int[] nums, int k) {//空间复杂度O(k)

        //1.k有可能大于 nums.length,这种情况下实际上相当于选择的次数 (k=10 --->k=3)
        k %= nums.length;
        //2.将整个数组翻转 {7,6,5,4,3,2,1}
        reverse(nums, 0, nums.length - 1);
        //3.将数组起始端到 数组索引k-1处反转 {5,6,7,4,3,2,1}
        reverse(nums, 0, k - 1);
        //4.对 数组索引k处 到数组末端反转 {5,6,7,1,2,3,4}
        reverse(nums, k, nums.length - 1);
    }

    /**
     * 反转方法(将数组中一段元素反转)
     *
     * @param nums  数组
     * @param start 起始位置
     * @param end   末端位置
     */
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}

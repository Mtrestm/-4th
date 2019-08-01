/**
 * @program: A4th
 * @description: 两数之和 II - 输入有序数组
 * @author: Shaobo.Qian
 * @create: 2019-07-29 08:08
 **/

package com.mtrestm.leetcode.Array.Easy.题167;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 5};
        int[] nums = {11, 5, 2, 7};
        int target = 9;

        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            throw new RuntimeException("illegal input");
        }

        int[] ans = new int[2];
        //1.定义一个指针指向第一个元素
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i + 1;
                    ans[1] = j + 1;
                    return ans;
                }
            }
        }
        //2.将当前元素和剩下数组中的元素相加
        throw new RuntimeException("nothing found");
    }
}

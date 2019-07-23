/**
 * @program: A4th
 * @description: 724. 寻找数组的中心索引
 * @author: Shaobo.Qian
 * @create: 2019-07-23 08:47
 **/

package com.mtrestm.leetcode.Array.Easy.题724;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums = {1};
        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums) {//双指针
        if (nums.length == 1) {
            return 0;
        }
        //1.假设中心索引为n为0
        int leftSum = 0;
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        //2.遍历数组移动中心索引
        for (int i = 0; i < nums.length; i++) {
            if (totalSum - nums[i] == leftSum * 2) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

}
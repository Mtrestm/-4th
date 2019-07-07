/**
 * @program: A4th
 * @description: 1. 两数之和
 * @author: QianShaobo
 * @create: 2019-07-03 08:39
 **/

package com.mtrestm.leetcode.Array.Easy.题1;

public class Solution1 {//自解,这是暴力解法,时间复杂度O(n^2)
    public static void main(String[] args) {
        //1.定义一个整数数组 nums(先可以写死)

        int[] nums = {1, 2, 5, 8, 9};

        //2.一个变量(目标值) target(先可以写死)

        int target = 14;


        //3.遍历数组,将当前元素和数组中比当前元素索引大的元素相加,如果满足目标值则返回
        int[] indices = getIndices(nums, target);
        for (int i = 0; i < indices.length; i++) {
            System.out.println("i = " + indices[i]);
        }
    }

    public static int[]  getIndices(int[] nums, int target) {
        //3.1定义返回值数组
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    System.out.println(i + "-----" + j);
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return  indices;
    }
}

/**
 * @program: A4th
 * @description: 747. 至少是其他数字两倍的最大数
 * @author: Shaobo.Qian
 * @create: 2019-07-23 18:15
 **/

package com.mtrestm.leetcode.Array.Easy.题747;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {3, 6, 1, 0};
//        int[] nums = {1, 0};
        int[] nums = {0, 0, 3, 2};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int max = nums[0];
        int maxIndex = 0;
        int secondMax = 0;
        boolean needCompareFlag = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else {
                if (nums[i] > secondMax) {
                    secondMax = nums[i];
                }
            }

        }
        if (max >= secondMax * 2) {
            return maxIndex;
        }
        return -1;
    }


    public static void splitArray(int[] nums, int splitElement) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < splitElement) {

            }
        }
    }

    /**
     * 交换两个元素位置
     *
     * @param nums
     * @param index1
     * @param index2
     */
    public static void exchangeElement(int[] nums, int index1, int index2) {
        int temp;
        temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}

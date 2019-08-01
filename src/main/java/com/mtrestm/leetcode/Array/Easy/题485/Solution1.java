/**
 * @program: A4th
 * @description: 485. 最大连续1的个数
 * @author: Shaobo.Qian
 * @create: 2019-07-29 08:45
 **/

package com.mtrestm.leetcode.Array.Easy.题485;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        //1.最长连续1的长度
        int ans = 0;
        //2.指向元素为0的值得指针
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return ans = Math.max(ans, count);
    }

}

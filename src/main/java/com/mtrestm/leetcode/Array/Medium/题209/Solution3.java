/**
 * @program: A4th
 * @description: 209. 长度最小的子数组
 * @author: Shaobo.Qian
 * @create: 2019-08-01 16:16
 **/

package com.mtrestm.leetcode.Array.Medium.题209;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8, 4, 3};
        int s = 11;
        System.out.println(minSubArrayLen(s, nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {//滑窗算法

        //1.定义指针指向数组左端
        int left = 0;
        //2.定义变量保存子数组求和
        int sum = 0;
        //3.定义变量保存子数组长度
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {//4.i作为右边的指针
            sum += nums[i];
            while (sum >= s) {//5.满足条件,移动左边指针
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }

        return (ans == Integer.MAX_VALUE ? 0 : ans);
    }
}

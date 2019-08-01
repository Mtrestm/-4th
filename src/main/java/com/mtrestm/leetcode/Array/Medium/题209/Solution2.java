/**
 * @program: A4th
 * @description: 暴力求解法
 * @author: Shaobo.Qian
 * @create: 2019-07-31 04:52
 **/

package com.mtrestm.leetcode.Array.Medium.题209;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8, 4, 3};
        int s = 11;
        System.out.println(minSubArrayLen(s, nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {//暴力求解法
        //1.保存求和大于 s 的最短子数组的求所用长度
        int ans = Integer.MAX_VALUE;
        //2.遍历数组
        for (int i = 0; i < nums.length; i++) {
            //3.从当前索引往右遍历,得到所有可能的子数组
            for (int j = i; j < nums.length; j++) {
                //4.对子数组求和
                int sum = 0;
                for (int k = i; k <= j; k++) {//注意这个循环条件
                    sum += nums[k];
                }
                //5.满足条件,更新 ans
                if (sum >= s) {
                    ans = Math.min(ans, j - i + 1);
                    break; //6.找到了当前索引 i 开始的最小数组,跳出循环,接着找下一个索引开始的最小数组
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}

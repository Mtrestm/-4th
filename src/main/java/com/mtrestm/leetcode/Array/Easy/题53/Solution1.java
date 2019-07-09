/**
 * @program: A4th
 * @description: 53最大子序和
 * @author: Shaobo.Qian
 * @create: 2019-07-07 14:49
 **/

package com.mtrestm.leetcode.Array.Easy.题53;

public class Solution1 {

    public static void main(String[] args) {
        //1.定义一个数组
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //连续子数组 [4,-1,2,1] 的和最大，为 6。 <== {0,0,0,4,-1,2,1,0,0}

        //{1,-5,4}
        System.out.println(maxSubArray(nums));

    }


    //动态规划：通过把原问题分解为相对简单的子问题的方式求解复杂问题的方法。动态规划常常适用于有重叠子问题和最优子结构性质的问题。
    public static int maxSubArray(int[] nums) {//利用动态规划的思路尝试解题,解决子背包问题,
        //1.定义变量用来记录数组最大子序和
        int ans = nums[0];
        //2.定义变量保存当前部分序列的最大和
        int sum = 0;
        //3.遍历数组
        for (int num : nums) {//当部分序列和大于零(说明对结果有增益)的话就一直加下一个元素即可，并和当前最大值进行比较
            //4.判断如何改变sum
            if (sum > 0) {
                sum += num;
            } else {//如果出现部分序列小于零的情况，那肯定就是从当前元素算起。
                sum = num;
            }
        //5.比较最大子序和和当前最大和,进行更新
            ans = Math.max(sum, ans);
        }

        return ans;
    }

}

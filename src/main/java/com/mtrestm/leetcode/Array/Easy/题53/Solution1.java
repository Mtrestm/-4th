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
   /* public static int maxSubArray(int[] nums) {//从正数的角度考虑,什么样的正数可以留下
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i]) {
            }
        }

        return sum;
    }*/

    public static int maxSubArray(int[] nums) {

        //0.关键是负数能不能要的问题,哪些负数能留下来

        //1.定义一个变量记录连续子数组的最大和
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            //2.如果一个负数加上左边的数或者加上右边的数大于0,则这个负数能留下来,否则将这个负数和它左边的数都替换为0
            if (nums[i] < 0 && nums[i - 1] + nums[i] < 0) { //3.对负数的处理,如果一个负数和它左边的数相加小于0,
                if (nums[i] + nums[i + 1] >= 0) {
                    nums[i - 1] = 0;
                }
                nums[i] = 0;
            }
            sum += nums[i - 1];
        }
        return sum;
    }

}

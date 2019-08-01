/**
 * @program: A4th
 * @description: 209. 长度最小的子数组
 * @author: Shaobo.Qian
 * @create: 2019-07-29 08:50
 **/

package com.mtrestm.leetcode.Array.Medium.题209;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 8, 4, 3};
        int s = 11;
        System.out.println(minSubArrayLen(s, nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {//异步双指针
        //1.定义一个变量来保存有几个元素累加,定义一个变量来保存所有元素累加和
        int sum = 0;
        //定义一个指针,来记录被减去元素的索引位置
        int minusCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= s) {
                return 1;
            }
            //1. 先将每个元素相加,直到满足大于等于s
            if (sum < s) {
                sum += nums[i];
            } else {
                // 2. 加上当前的数然后循环减到小于s
                sum += nums[i];
                while (sum >= s) {
                    sum -= nums[minusCount];
                    minusCount++;
                }
                sum += nums[minusCount - 1];
                minusCount--;
            }
        }
//        3. 只要大于就减去一个数,循环
        return nums.length - minusCount;
    }
}

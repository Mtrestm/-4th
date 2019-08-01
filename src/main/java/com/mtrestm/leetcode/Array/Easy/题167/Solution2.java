/**
 * @program: A4th
 * @description:
 * @author: Shaobo.Qian
 * @create: 2019-08-01 19:23
 **/

package com.mtrestm.leetcode.Array.Easy.题167;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) { //思考所给条件中有哪些性质是可以利用的 ==>有序
        if (nums.length < 2) {
            throw new RuntimeException("illegal input");
        }

        int[] ans = new int[2];
        //1.定义一个指针指向数组头部
        int start = 0;
        //2.定义一个指针指向数组尾部
        int end = nums.length - 1;
        //3.定义变量保存两个指针指向的元素相加之和
        int sum = 0;
        while (start < end) {
            //4.将和与 target 比较,通过比较结果改变指针走向
            sum = nums[start] + nums[end];
            if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if (sum < target) {//左边的指针增大(元素值跟着增大)
                start++;
            } else {//右边的指针增大(元素值跟着减小)
                end--;
            }
        }

        throw new RuntimeException("nothing found");
    }
}

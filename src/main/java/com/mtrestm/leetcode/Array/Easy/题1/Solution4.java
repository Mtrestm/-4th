/**
 * @program: A4th
 * @description:
 * @author: Shaobo.Qian
 * @create: 2019-07-05 07:52
 **/

package com.mtrestm.leetcode.Array.Easy.题1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] nums = {1, 2, 5, 8, 9};
        //2.定义一个目标变量
        int target = 14;
        int[] result = towSum(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }

        return null;
    }

}

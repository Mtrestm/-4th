/**
 * @program: A4th
 * @description: 利用哈希表
 * @author: Shaobo.Qian
 * @create: 2019-07-22 16:19
 **/

package com.mtrestm.leetcode.Array.Easy.题217;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
//        int[] nums = {3, 1};
                int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}


/**
 * @program: A4th
 * @description: 219. 存在重复元素 II
 * @author: Shaobo.Qian
 * @create: 2019-07-22 16:28
 **/

package com.mtrestm.leetcode.Array.Easy.题219;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1, 2, 3};
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        //1.遍历数组,将索引作为value和对应的值作为 key加入 map
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {//2.比较要加入的 key是否重复
                Integer index = map.get(nums[i]);
                if ((i - index) <= k) {//3.比较重复值对应索引的差值
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

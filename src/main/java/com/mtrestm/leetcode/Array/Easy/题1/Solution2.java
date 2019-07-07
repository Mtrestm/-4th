/**
 * @program: A4th
 * @description: 利用map
 * @author: Shaobo.Qian
 * @create: 2019-07-04 07:18
 **/

package com.mtrestm.leetcode.Array.Easy.题1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args) {
        //1.定义一个数组
        int[] nums = {1, 2, 5, 8, 9};
        //2.定义一个目标变量
        int target = 14;
        int[] result = twoSum(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    /**
     * 定义方法,接收数组,和目标数,返回数组索引
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
        //1.定义map,map的key为数组索引对应存的值,value为对应索
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//            map.put(i, nums[i]);  一开始写反了
            map.put(nums[i], i);//这个方法的技巧在于,map的key存的数组的value
        }
        //2.迭代map,判断目标值是否等于map中的两元素之和,等于则返回

        for (int i = 0; i < nums.length; i++) {//时间复杂度O(n)*O(1) = O(n)======这里的O(1)是map对应的哈希表的功劳
            int anotherNum = target - nums[i];
            if (map.containsKey(anotherNum) && map.get(anotherNum) != i) {
                return new int[]{i, map.get(anotherNum)};
            }
        }
        throw new RuntimeException("没有找到");
    }
}

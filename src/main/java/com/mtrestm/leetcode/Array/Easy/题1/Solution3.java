/**
 * @program: A4th
 * @description: 一次遍历
 * @author: Shaobo.Qian
 * @create: 2019-07-04 08:00
 **/

package com.mtrestm.leetcode.Array.Easy.题1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    //事实证明，我们可以一次完成。在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。如果它存在，那我们已经找到了对应解，并立即将其返回。

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
            //2.检查元素表中是否已经存在当前元素所对应的目标元素,存在返回
            int anotherNum = target - nums[i];
            if (map.containsKey(anotherNum) && map.get(anotherNum) != i) { //这里可以优化,map.get(anotherNum) != i可以去掉,因为一遍遍历,这时候map中肯定没有和i相关的信息
                return new int[]{i, map.get(anotherNum)};
            }
            //1.将元素插入map中
            map.put(nums[i], i);
        }

        throw new RuntimeException("没有找到");
    }
}

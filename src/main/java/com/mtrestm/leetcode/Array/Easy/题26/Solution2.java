/**
 * @program: A4th
 * @description: 双指针法
 * @author: Shaobo.Qian
 * @create: 2019-07-06 15:49
 **/

package com.mtrestm.leetcode.Array.Easy.题26;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
//        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{0,0,0,1,1,2,3,4,4}; //0,1,2
        int[] nums = new int[]{1, 1, 2, 2, 1}; //0,1,2
        System.out.println(removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static int removeDuplicates(int[] nums) {
        //1.处理边界值
        if (nums.length == 0) {
            return 0;
        }

        //2.定义数组的角标变量,同事来表达已检查的不重复元素个数和已检查元素中的最大值
        int i = 0;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] > nums[i]) {
                i++;
                //3.遍历,将不重复元素交换的数组的前面
                nums[i] = nums[j];
            }
        }


        //4.返回数组中不重复元素的个数
        return i + 1;
    }
}

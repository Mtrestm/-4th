/**
 * @program: A4th
 * @description:27. 移除元素
 * @author: Shaobo.Qian
 * @create: 2019-07-06 16:10
 **/

package com.mtrestm.leetcode.Array.Easy.题27;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {//测试
        //1.定义一个数组
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int[] nums = {3, 2, 2, 3};
        int[] nums = {2};
        //2.定义要删除的元素
//        int val = 2;
        int val = 3;
        //3.调用移除元素的方法
        int count = removeElement(nums, val);
        System.out.println("count = " + count);
    }

    public static int removeElement(int[] nums, int val) {//利用数组的特性
        //1.定义变量,作为数组的索引,用来表达已检查的与要删除元素不同的元素个数,索引对应的值用来保存与要删除元素不同的元素值
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (val != nums[j]) {
                //2.将与要删除元素不同的元素交换到数组前面
                nums[i] = nums[j];
                i++;
            }

        }
        //3.返回数组中与要删除元素不同的元素的个数
        Arrays.stream(nums).forEach(System.out::println);
        return i;
    }
}

/**
 * @program: A4th
 * @description:
 * @author: Shaobo.Qian
 * @create: 2019-07-05 08:00
 **/

package com.mtrestm.leetcode.Array.Easy.题26;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {

        //1.定义一个含有重复数的排序数组
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{0,0,0,1,1,2,3,4,4}; //0,1,2
        System.out.println(removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::println);

    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) { //处理0个和1个元素的特殊情况
            return nums.length;
        }
        // 1.定义一个计数器,记录不同值
        int count = 1;
        //2.遍历数组,当前元素不等于上一元素+1, (因为是排过序),如果相等,则将当前元素和下一个元素比直到遇到不同的元素,交换位置
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) { //处理数组中的最后一个元素
                if (nums[i] > nums[count - 1]) {
                    swapLocation(nums, count, i);//不要忘记交换位置
                    return ++count;
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[count - 1]) {// 和当前最大值比较,比当前最大值大,不重复元素+1,count是已检查的不重复个数,count-1为已记录的最大值索引,nums[count-1]即为已记录的最大值
                    //交换数组中元素的位置,因为要保存不重复的元素排在最前面,所以与count交换
                    swapLocation(nums, count, j);
                    count++;
                    i = j - 1; //改变正在遍历的索引位置
                    break;
                }
            }
        }
        return count;
    }

    /**
     * 交换数组中元素的位置
     *
     * @param nums
     * @param i
     * @param j
     */
    private static void swapLocation(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}

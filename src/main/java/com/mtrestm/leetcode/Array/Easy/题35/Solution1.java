/**
 * @program: A4th
 * @description: 35. 搜索插入位置
 * @author: Shaobo.Qian
 * @create: 2019-07-07 10:12
 **/

package com.mtrestm.leetcode.Array.Easy.题35;

public class Solution1 {
    public static void main(String[] args) {
        //1.定义一个无重复元素的排序数组

//        int[] nums = {1, 3, 5,8};
//        int[] nums = {9, 10, 12};
//        int[] nums = {1, 3, 5, 6};
        int[] nums = {1, 3, 5};

        //2.定义要搜素的目标值
//        int target = 11;
//        int target = 5;
        int target = 2;

        //3.调用方法搜索
        System.out.println(searchInsert(nums, target));
//        System.out.println(searchInsert1(nums, target));
    }

    /**
     * 暴力处理,算法复杂度O(N)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {//普通处理,算法复杂度O(N)(估计可以用二分搜索算法)

        //1.要搜索的数在数组两边
        if (target <= nums[0]) {
            return 0;
        }
        //2.要搜索的数在数组中
        for (int i = 0; i < nums.length; i++) {
            //2.1如果目标值存在,返回目标值
            if (target == nums[i]) {
                return i;
            } else if (nums[i] > target && target > nums[i - 1]) {
                //2.2 如果目标值不存在,确定目标值两边的元素,返回其中较大的索引
                return i;
            }

        }
        //3.
        return nums.length;
    }

    /**
     * 使用二分搜素算法,算法复杂度O(log(n))
     *
     * @param nums
     * @param target
     * @return
     */
    private static int searchInsert1(int[] nums, int target) {

        //0.定义最小值索引,最大值索引
        int min = 0;
        int max = nums.length - 1;
        //1.要搜索的数在数组两边
        if (target <= nums[min]) {
            return 0;
        }
        if (target > nums[max]) {
            return nums.length;
        }
        //3.递归调用
        return search(min, max, nums, target);

    }

    private static int search(int min, int max, int[] nums, int target) {
        //1.定义数组中间索引得变量,对应值用来和target比较
        int medium = min + (max - min) / 2;
        //2.通过比较target和数组中间索引值,来确定target位置
        if (target == nums[medium]) {
            return medium;
        } else if (target > nums[medium]) {
            min = medium;
        } else if (target < nums[medium]) {
            max = medium;
        }
        if ((max - min) / 2 == 0) {//0.递归出口,放在后面校验
            return max;
        }

        return search(min, max, nums, target);
    }
}
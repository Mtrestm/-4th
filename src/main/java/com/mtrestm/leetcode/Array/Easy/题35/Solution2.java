/**
 * @program: A4th
 * @description: 非递归实现
 * @author: Shaobo.Qian
 * @create: 2019-07-07 12:16
 **/

package com.mtrestm.leetcode.Array.Easy.题35;

public class Solution2 {
    public static void main(String[] args) {

//        int[] nums = {1, 3, 5};
        int[] nums = {3, 5, 7, 9, 10};
//        int target = 4;
//        int target = 1;
//        int target = 6;
        int target = 8;
//        int target = 10;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {//递归实现

        //0.定义最小值索引,最大值索引
        int left = 0;
        int right = nums.length - 1;
        //1.要搜索的数在数组两边
        if (target <= nums[left]) {
            return 0;
        }
        if (target > nums[right]) {
            return nums.length;
        }
        //3.递归调用
//        return binarySearch(left, right, nums, target);

        //3.非递归
        while (left < right) {
            int mid = left + (right - left) / 2; //这样不会超出Integer的范围
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {//排除左边界
                left = mid + 1;
            } else {//排除左边界,就不排除右边界
                right = mid;
            }
        }
        return left;
    }


    private static int binarySearch(int left, int right, int[] nums, int target) {
        if (left > right) {//0.递归出口,放在后面校验
            return left;
        }
        int mid = left + (right - left) / 2; //这样不会超出Integer的范围

        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearch(mid + 1, right, nums, target);
        } else {
            return binarySearch(left, mid - 1, nums, target);
        }
    }
}

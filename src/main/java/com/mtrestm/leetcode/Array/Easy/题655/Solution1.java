/**
 * @program: A4th
 * @description: 665. 非递减数列
 * @author: Shaobo.Qian
 * @create: 2019-07-22 17:17
 **/

package com.mtrestm.leetcode.Array.Easy.题655;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {3, 4, 2, 3};
//        int[] nums = {2, 3, 3, 2, 4}; //2 3 3 3 4
        int[] nums = {-1, 4, 2, 3}; // -1 -1 2 3
//        int[] nums = {4, 2, 3};
        System.out.println(checkPossibility(nums));

    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;//1.定义变量用来表示凸起的点的个数
        for (int i = 0; i < nums.length - 1 && count <= 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (i < 1 || nums[i - 1] < nums[i + 1]) {// -1 -1 2 3
                    nums[i] = nums[i + 1]; //2.因为要保持递增,就要观察后面的数(nums[i+1])是否可靠,nums[i - 1] < nums[i + 1]情况下说明 nums[i + 1]是可靠的
                } else {//2 3 3 2 4
                    nums[i + 1] = nums[i]; //3.如果i+1不可靠,要将 i+1换掉
                }
            }
        }
        return count <= 1;
    }


}

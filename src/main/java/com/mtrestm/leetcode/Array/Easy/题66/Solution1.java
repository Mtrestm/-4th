/**
 * @program: A4th
 * @description: 66. 加一
 * @author: Shaobo.Qian
 * @create: 2019-07-09 08:23
 **/

package com.mtrestm.leetcode.Array.Easy.题66;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        //定义一个数组
        int[] digits = {4, 9, 9, 9};

        int[] newDigits = plusOne(digits);
        Arrays.stream(newDigits).forEach(System.out::println);

    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 0 && digits[i] % 9 == 0) {
                digits[i] = 0;
                if (i == 0) {
                    //3.有进位,总长度+1
                    int[] newDidigts = new int[digits.length + 1];
                    for (int j = 0; j < newDidigts.length; j++) {
                        if (j == 0) {
                            newDidigts[0] = 1;
                        } else {
                            newDidigts[j] = 0;
                        }
                    }
                    return newDidigts;
                } else {
                    digits[i] = 0;
                    //2.有进位,总长度不变
                }
            } else {
                //1.没有进位
                digits[i] = digits[i] + 1;
                break;
            }

        }
        return digits;
    }

}

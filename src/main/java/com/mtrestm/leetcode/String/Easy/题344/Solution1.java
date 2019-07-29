/**
 * @program: A4th
 * @description: 344. 反转字符串
 * @author: Shaobo.Qian
 * @create: 2019-07-26 09:15
 **/

package com.mtrestm.leetcode.String.Easy.题344;

public class Solution1 {

    public static void main(String[] args) {
        //1.定义输入的字符数组
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverseString(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "-");
        }
    }

    public static void reverseString(char[] input) {
        if (input.length == 0) {//边界情况
            return;
        }
        //1.定义指针指向字符数组的开头
        int start = 0;
        //2.定义指针指向字符数组的结尾
        int end = input.length - 1;
        //3.两个指针向内收缩,交换两个指针指向的元素
        while (end > start) {
            swapElement(input, start, end);
            start++;
            end--;
        }
    }

    public static void swapElement(char[] input, int index1, int index2) {
        char temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}

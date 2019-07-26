/**
 * @program: A4th
 * @description: 28. 实现strStr()
 * @author: Shaobo.Qian
 * @create: 2019-07-26 07:02
 **/

package com.mtrestm.leetcode.String.Easy.题28;

public class Solution1 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
//        System.out.println(haystack.indexOf(needle));
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        //1.原字符数组
        char[] source = haystack.toCharArray();
        //2.原字符数组的起始位置
        int sourceOffset = 0;
        //3.原字符数组的元素个数
        int sourceCount = source.length;

        //4.目标字符数组
        char[] target = needle.toCharArray();
        //5.目标数组的与原数组匹配的元素序列的第一个元素位置
        int targetOffset = 0;
        //6.目标元素个数
        int targetCount = target.length;

        //7.遍历原数组

        for (int i = 0; i < sourceCount; i++) {
            //8.寻找第一个元素
            int first = target[i];
            if (first != source[i]) {
                while (++i < sourceCount && first != source[i]) ;
            }
            int end = targetCount + i;
            if (end <= sourceCount) {
                for (int j = i + 1; j < end && source[j] == target[j]; j++) ;
                if (i == end) {
                    return i;
                }
            }

        }
        //8.寻找第一个元素,记录第一个元素在元数组和目标数组中的位置


        return -1;
    }

}

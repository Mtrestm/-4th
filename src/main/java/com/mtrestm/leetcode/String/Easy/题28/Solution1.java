/**
 * @program: A4th
 * @description: 28. 实现strStr()
 * @author: Shaobo.Qian
 * @create: 2019-07-26 07:02
 **/

package com.mtrestm.leetcode.String.Easy.题28;

public class Solution1 {
    public static void main(String[] args) {
        String haystack = "helololl";
        String needle = "";
//        System.out.println(haystack.indexOf(needle));
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        //1.定义原字符数组,原字符数组的元素个数,目标字符数组,目标元素个数
        char[] source = haystack.toCharArray();
        int sourceCount = source.length;
        char[] target = needle.toCharArray();
        int targetCount = target.length;
        if (targetCount == 0) {
            return 0;
        }
        //2.遍历原数组
        for (int i = 0; i < sourceCount; i++) {
            //2.1寻找第一个元素
            int first = target[0];
            if (first != source[i]) {
                while (++i < sourceCount && first != source[i]) ;
            }
            int end = targetCount + i;//匹配完成后走过了多少个元素
            if (end <= sourceCount) {
                int k = 1;
                int j;
                //2.2和目标字符数组中剩下的所有元素匹配
                for (j = i + 1; j < end && source[j] == target[k]; j++, k++) ;
                if (j == end) {
                    return i;
                }
            }

        }
        return -1;
    }

}

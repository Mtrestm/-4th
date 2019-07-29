/**
 * @program: A4th
 * @description: 最长公共前缀
 * @author: Shaobo.Qian
 * @create: 2019-07-26 17:03
 **/

package com.mtrestm.leetcode.String.Easy.题14;

public class Solution2 {
    public static void main(String[] args) {
        String[] strs = {"aa","a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {//纵向扫描(每次循环比较一列),最好情况下,性能比上一种的好
        //1.边界情况处理
        if (strs == null || strs[0].length() == 0) {
            return "";
        }
        //2.令第一个字符串为最长公共前缀,纵向扫描,外循环该字符串每一个字符
        String ans = strs[0];
        for (int i = 0; i < ans.length(); i++) {
            char ansChar = ans.charAt(i);
            //3.内循环将数组中剩下的字符串第 i 个字符和第一个字符串第 i 个字符比较
            for (int j = 1; j < strs.length; j++) {
                //4.不等于则返回之前已比较完成的最长前缀
                //4.1 每次记得判断将要比较的元素索引 i 是否大于要比较的字符串长度strs[j].length()----->i == strs[j].length()
                if (i == strs[j].length() || ansChar != strs[j].charAt(i)) {
                    return ans.substring(0, i);
                }
            }
        }
        return ans;
    }

}

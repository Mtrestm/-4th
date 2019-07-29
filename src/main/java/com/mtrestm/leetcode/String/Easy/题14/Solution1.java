/**
 * @program: A4th
 * @description: 最长公共前缀
 * @author: Shaobo.Qian
 * @create: 2019-07-26 07:11
 **/

package com.mtrestm.leetcode.String.Easy.题14;

public class Solution1 {
    public static void main(String[] args) {
        String[] strs = {"abc", "abcd", "abccc"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {//水平扫描(两两比较,每次比较两个字符串)
        //1.边界情况,如果数组中第一个字符串为空,则返回空
        if (strs == null || strs[0].length() == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //2.令数组中第一个字符串为最长公共前缀
        String ans = strs[0];
        //3.两两比较,如果更新公共前缀,如果为空,则返回空
        for (int i = 1; i < strs.length; i++) {
            //3.1两两比较
            String nextStr = strs[i];
            StringBuilder ansBuilder = new StringBuilder();
            int maxLen = Math.min(ans.length(), nextStr.length());
            for (int j = 0; j < maxLen; j++) {
                if (ans.charAt(j) == nextStr.charAt(j)) {
                    ansBuilder.append(ans.charAt(j));
                } else {
                    if (j == 0) {
                        return "";
                    }
                    break;
                }
            }
            ans = ansBuilder.toString();
        }
        return ans;
    }
}

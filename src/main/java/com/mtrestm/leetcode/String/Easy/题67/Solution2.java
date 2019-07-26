/**
 * @program: A4th
 * @description: 67. 二进制求和
 * @author: Shaobo.Qian
 * @create: 2019-07-26 06:11
 **/

package com.mtrestm.leetcode.String.Easy.题67;

public class Solution2 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        //1.定义 StringBuilder 来保存每一位上的2进制求和结果
        StringBuilder ans = new StringBuilder();
        //2.定义变量保存2进制求和的进位,定义变量保存求和结果
        int carry = 0;
        //3.循环,从低位往高位开始计算
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            //4.a,b中较短的字符串高位补零
            sum += i >= 0 ? a.charAt(i) - '0' : 0;// 判断j>=0的含义是有可能两个数字长度不一致，如果j<0的话则将其当做0来处理，否则获取其值a.charAt(j) - '0'
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);// sum%2是在做二进制取模运算，比如sum=2，这时候将sum%2=0放入结果集中
            //5.计算进位
            carry = sum / 2;// 这里是计算进位，比如sum=2，ca = 1，ca表示进位的意思，满2进1
        }
        //6.拼接进位
        ans.append(carry == 1 ? carry : "");
        //7.将结果取反,得到从高位到低位的最后结果
        return ans.reverse().toString();
    }

}

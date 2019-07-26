/**
 * @program: A4th
 * @description: 67.二进制求和
 * @author: Shaobo.Qian
 * @create: 2019-07-24 19:36
 **/

package com.mtrestm.leetcode.String.Easy.题67;

public class Solution1 {
    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a, b));
//        System.out.println(toBinaryString(11));
    }

    public static String addBinary(String a, String b) {
        int aNum = 0;
        int bNum = 0;
        if (a.length() == 1) {
            aNum += Integer.valueOf(a);
        } else {
            for (int i = a.length() - 1; i >= 0; i--) {
                aNum += Math.pow(2, i) * (Integer.valueOf(a.substring(a.length() - 1 - i, a.length() - i)));

            }
        }
        if (b.length() == 1) {
            bNum += Integer.valueOf(b);
        } else {
            for (int i = b.length() - 1; i >= 0; i--) {
                bNum += Math.pow(2, i) * (Integer.valueOf(b.substring(b.length() - 1 - i, b.length() - i)));
            }

        }
        return toBinaryString(aNum + bNum);
    }


    /**
     * 将一个数字转换为2进制字符串
     *
     * @param value
     * @return
     */
    private static String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        //1.定义字符数组
        int bufLen = 32;
        int index = bufLen;
        char[] result = new char[bufLen];
        //2.根据具体逻辑,循环读取数据放入字符数组
        do {
            result[--index] = (char) ('0' + (value % 2)); //2.1取余
            value = value >>> 1; //2.2相当于除2
        } while (value != 0);//3.定义退出循环的条件
        //4.将字符数组转换成字符串
        return new String(result, index, bufLen - index); //数组前面索引可能为空
    }
}

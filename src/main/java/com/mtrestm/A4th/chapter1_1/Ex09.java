/**
 * @program: A4th
 * @description:编写一段代码,将一个正整数 N用二进制表示并转换为一个 S t r i n g类型的值 s。
 * @author: QianShaobo
 * @create: 2019-04-22 19:00
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex09 {

    public static void main(String[] args) {
//        int value = 8;
//        System.out.println(('0'+ value & 1));
//        System.out.println('0' + 2);
//        System.out.println('a');
//
//        System.out.println(6 & 3);
//        System.out.println(6 & 2); // 110 & 010 => 010 (2^1)
//        System.out.println(6 | 1); // 110 | 001 => 111 (1*2^2+1*2^1+1*2^0)
//
//        System.out.println(5>>2); //101 >> 2 =>001(右移n位,高位补0) = 1
//        System.out.println(5<<2); //101 << 2 => 10100(左移n位,低位补零) (1*2^4+1*2^2 = 20)
//
//        System.out.println(5/2);
//        System.out.println(5 & 1); // 101 & 001 => 001 => 1

        System.out.println(toBinaryString(2));
        System.out.println(toBinaryString(5));
        System.out.println(toBinaryString(6));

        System.out.println(6>>>1);

    }

    private static String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        int bufLen = 32;
        int index = bufLen;
        char[] result = new char[bufLen];
        do {
            result[--index] = (char) ('0' + (value % 2)); //取余
            value = value >>> 1; //相当于除2
        } while (value != 0);
        return new String(result, index, bufLen - index); //数组前面索引可能为空
    }
}

/**
 * @program: A4th
 * @description: 找出以下递归函数的问题：
 * @author: QianShaobo
 * @create: 2019-04-25 16:16
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex17 {

    public static String exR2(int n) {

        String s = exR2(n-3) + n + exR2(n-2) + n; //无限递归,走不到递归出口条件 if (n <= 0) return "";

        if (n <= 0) return "";

        return s; }

    public static void main(String[] args) {

        System.out.println(exR2(4));//Exception in thread "main" java.lang.StackOverflowError

    }
}

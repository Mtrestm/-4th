/**
 * @program: A4th
 * @description: 1.1.21　编写一段程序， 从标准输入按行读取数据， 其中每行都包含一个名字和两个整数。 然后用 printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数 的结果，精确到小数点后三位。可以用这种程序将棒球球手的击球命中率或者学生的考试分数 制成表格。
 * @author: QianShaobo
 * @create: 2019-04-25 17:59
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

import java.math.BigDecimal;

public class Ex21 {

    public static void main(String[] args) {
        int n = StdIn.readInt();
        String[] nameArray = new String[n];
        int[] resultArray1 = new int[n];
        int[] resultArray2 = new int[n];

        for (int i = 0; i < n; i++) {
            String name = StdIn.readString();
            int result1 = StdIn.readInt();
            int result2 = StdIn.readInt();
            nameArray[i] = name;
            resultArray1[i] = result1;
            resultArray2[i] = result2;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(nameArray[i] + " ");
            System.out.print(resultArray1[i] + " ");
            System.out.print(resultArray2[i] + " ");
            System.out.print((new BigDecimal(resultArray1[i]).divide(new BigDecimal(resultArray2[i]), 3, BigDecimal.ROUND_HALF_UP)).doubleValue());
            System.out.println();
        }


    }

}

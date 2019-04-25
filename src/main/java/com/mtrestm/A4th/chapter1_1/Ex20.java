/**
 * @program: A4th
 * @description: 编写一个递归的静态方法计算 ln( N !) 的值。
 * @author: QianShaobo
 * @create: 2019-04-25 16:53
 **/

package com.mtrestm.A4th.chapter1_1;

import java.math.BigDecimal;

public class Ex20 {

    public static double ln(int n) {
        if (n == 0) {
            return 0;
        } else {
        return Math.log10(n) + ln(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(ln(10));
        System.out.println(BigDecimal.ROUND_HALF_UP);
    }
}

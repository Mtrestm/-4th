/**
 * @program: A4th
 * @description: 1.1.24　给出使用欧几里得算法计算 105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值。扩展该 算法中的代码得到一个程序 Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每 次调用递归方法时的两个参数。使用你的程序计算 1 111 111 和 1 234 567 的最大公约数。
 * @author: QianShaobo
 * @create: 2019-04-28 20:08
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex24 {

    /**
     * 欧几里得算法(辗转相除法)
     *
     * @param p
     * @param q
     * @return
     */
    private static int euclid(int p, int q) {
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

    public static void main(String[] args) {

        System.out.println(euclid(12, 24));
        System.out.println(euclid(49, 21));
    }
}

/**
 * @program: A4th
 * @description: 给出以下表达式的值:
 * a. (  0  +  1 5  )  /  2
 * b. 2 . 0 e - 6  *  1 0 0 0 0 0 0 0 0 . 1
 * c. t r u e  & &  f a l s e  | |  t r u e  & &  t r u e
 * @author: QianShaobo
 * @create: 2019-04-22 17:19
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 10000000.1); //e是以10为底的指数
        System.out.println(true && false || true && true);

    }
}

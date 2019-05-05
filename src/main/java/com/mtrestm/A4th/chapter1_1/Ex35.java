/**
 * @program: A4th
 * @description:1.1.35 模拟掷骰子。以下代码能够计算每种两个骰子之和的准确概率分布：dist[i] 的值就是两个骰子之和为 i 的概率。 用实验模拟 N 次掷骰子， 并在计算两个 1 到 6 之间的随机整数之和时记录每个值的出现频率以验证它们的概率。 N 要多大才能够保证你 的经验数据和准确数据的吻合程度达到小数点后三位？
 * @author: QianShaobo
 * @create: 2019-05-05 16:30
 **/

package com.mtrestm.A4th.chapter1_1;

public class Ex35 {

    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];//dist[i] 的值就是两个骰子之和为 i 的概率
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++) dist[i + j] += 1.0;

        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0;
            System.out.printf("%6.3f", dist[k]);
        }
    }

}

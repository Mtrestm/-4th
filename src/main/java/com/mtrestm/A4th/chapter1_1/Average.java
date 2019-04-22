/**
 * @program: A4th
 * @description: The {@code Average} class provides a client for reading in a sequence of real numbers and printing out their average.
 * @author: QianShaobo
 * @create: 2019-04-22 15:56
 **/

package com.mtrestm.A4th.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
public class Average {
    private Average() {// this class should not be instantiated

    }


    /**
     * Reads in a sequence of real numbers from standard input and prints
     * out their average to standard output.
     *
     * @param args the command-line arguments (从控制台输入)
     */
    public static void main(String[] args) {
        int count = 0;
        double sum = 0.0;
        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            count++;
        }

        // compute the average
        double average = sum / count;
        // print results
        System.out.println("average = " + average);
    }
}

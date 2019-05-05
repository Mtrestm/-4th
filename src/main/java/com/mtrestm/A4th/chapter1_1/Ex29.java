/**
 * @program: A4th
 * @description: 1.1.29　等值键。为 BinarySearch 类添加一个静态方法 rank() ，它接受一个键和一个整型有序数组（可 能存在重复键）作为参数并返回数组中小于该键的元素数量，以及一个类似的方法 count() 来 返回数组中等于该键的元素的数量。 注意：如果 i 和 j 分别是 rank(key,a) 和 count(key,a) 的返回值，那么 a[i..i+j-1] 就是数组中所有和 key 相等的元素。
 * @author: QianShaobo
 * @create: 2019-04-30 10:59
 **/

package com.mtrestm.A4th.chapter1_1;

import java.util.Arrays;

public class Ex29 {
    //todo:转notion (针对有重复元素的数组的二分搜索)

    /**
     * 接受一个键和一个整型有序数组（可 能存在重复键）作为参数并返回数组中小于该键的元素数量
     *
     * @param a 整型有序数组
     * @param key
     * @return
     */
    public static int rank(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) {
                while (a[mid] == key && mid > 0) { //重复键的情况
                    mid--;
                }
                return ++mid;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else if (a[mid] < key) {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 接受一个键和一个整型有序数组（可 能存在重复键）作为参数并返回数组中等于该键的元素数量
     *
     * @param a   整型有序数组
     * @param key
     * @return
     */
    public static int count(int[] a, int key) {
        int num = 1;
        int pos = rank(a, key); //拿到等于key的元素的最小索引
        while (a[pos] == a[++pos]) {
            num++;
        }
        return num;
    }

    public static void main(String[] args) {

//        int[] a = {12, 23, 45, 45, 6, 5, 6, 67, 5, 435, 565, 678, 89, 768, 67, 34, 5, 3, 4, 2, 1};
        int[] a = {12, 23, 45, 45, 6, 5, 6, 67, 5, 435, 565, 678, 89, 768, 67, 34, 5}; //结果有问题 1,2 (正确结果应该是0,3)
        Arrays.sort(a);

        System.out.println(rank(a, 5));
        System.out.println(count(a, 5));
        System.out.println(count(a, 1111));
    }
}

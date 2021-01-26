package com.simple;

import java.util.Arrays;

/**
 * created by xhj on 2021/1/26
 */
public class InsertSort {

    /**
     *通过构建有序序列，对于未排序数据，
     * 在已排序系列中从后向前扫描,找到相应的位置并插入
     * @param a
     * @param b
     * @return
     */
    public int[] sort(int[] a,int b){

        int[] c = new int[a.length+1];
        int index = a.length-1;
        while(b<a[index]){
            c[index+1]=a[index];
            index--;
        }
        c[index+1] = b;
        for (int i=0;i<index+1;i++){
            c[i]=a[i];
        }

        return c;

    }

    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        int[] a ={1,2,3,4,7,9,10};
        System.out.println(Arrays.toString(is.sort(a,8)));
    }
}

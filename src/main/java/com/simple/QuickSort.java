package com.simple;

/**
 * created by xhj on 2021/1/26
 */
public class QuickSort {

    public void sort(int[] a,int low,int high){
        int start = low;
        int end = high;

        int key = a[start];
        while (end>start){
            //从后往前比较
            while (end>start&&a[end]>=key){
                //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            }
            if (a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

            while(end>start && a[start]<=key)
                start++;
            if (a[start]>=key){
                int temp = a[start];
                a[start]  = a[end];
                a[end] = temp;
            }
        }



    }


}

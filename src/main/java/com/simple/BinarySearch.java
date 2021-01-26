package com.simple;

/**
 * created by xhj on 2021/1/26
 */

public class BinarySearch {

    /**
     * 二分查找，要求待查找的序列有序。每次取中间位置的值与待检查关键字比较
     * 如果中间值比待检查的关键字要大，则在前半部分循环查找，如果中间值笔待检查的关键字小
     * 则在后半部分循环查找。直到找到为止，否则不存在
     * @param array
     * @param a
     * @return
     */
    public int biSearch(int[] array,int a){
        int lo = 0;
        int hi = array.length-1;
        int mid;
        while (lo<=hi){
            mid = (lo+hi)/2;//中间位置
            if(array[mid] == a){
                return mid+1;
            }else if (array[mid]<a){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }
}

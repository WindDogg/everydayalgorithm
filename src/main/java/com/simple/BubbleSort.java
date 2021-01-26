package com.simple;

/**
 * created by xhj on 2021/1/26
 */
public class BubbleSort {

    /**
     * 比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
     * 这样对数组的第0个数据到N-1个数据进行一次遍历后，最大的一个数据就放在了第N-1个位置。
     * @param a
     * @param n
     */
    public void bubbleSort(int[] a,int n){
        int i,j;
        for (i=0;i<n;i++){//表示n次排序过程
            for(j=1;j<n-i;j++){
                if (a[j-1]>a[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }

        }
    }


}

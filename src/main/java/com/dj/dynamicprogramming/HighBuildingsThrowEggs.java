package com.dj.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * 高楼扔鸡蛋
 * 题目：你面前有一栋从1到N共N层的楼，然后给你K个鸡蛋（K至少为1）.
 * 现在确定存在楼层0<=F<=N,在这层楼将鸡蛋扔下去，鸡蛋恰好没碎（高于F的楼层都会碎，低于F的都不会碎）
 * 现在问你，最坏的情况下，你至少要扔几次鸡蛋，才能确定这个楼层F？
 */
public class HighBuildingsThrowEggs {
    //最坏的情况，是指鸡蛋破碎一定发生在搜索区间穷尽时。


    Map<Integer,Integer> res = new HashMap<>();

    public int dp(int k,int n){
        //base case
        if (k==1) return n;
        if (n==0) return 0;
        //避免重复计算
        if (res.containsKey(k)) return res.get(k);
        //正无穷
        double num  =Double.POSITIVE_INFINITY;

        for (int i=1;i<n+1;i++){
            //最少的次数
            num = Math.min(num,
                    //最坏的情况
                    Math.max(dp(k,n-i),//没碎
                            dp(k-1,i-1))//碎了
                            +1 );//在i楼扔了一次
        }
        res.put(k,(int)num);
        return (int)num;

    }

    public static void main(String[] args) {
        HighBuildingsThrowEggs h = new HighBuildingsThrowEggs();
        System.out.println(h.dp(3,5));
    }




}

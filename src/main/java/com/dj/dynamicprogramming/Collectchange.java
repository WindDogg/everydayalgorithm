package com.dj.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * 凑零钱：
 * 给你 k 种⾯值的硬币，⾯值分别为 c1, c2 ... ck ，每种硬
 * 币的数量⽆限，再给⼀个总⾦额 amount ，问你最少需要⼏枚硬币凑出这个
 * ⾦额，如果不可能凑出，算法返回 -1
 */
public class Collectchange {

    static int[] coins = {1,3,5};//硬币的面值
    static int amount =11;//总金额
    static Map<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(dp(amount));
        System.out.println(dp2(amount));
        System.out.println(dp3());

    }


    static int dp(int n){
        if(n==0) return 0;
        if(n<0) return -1;
        double res =Double.POSITIVE_INFINITY;
        for (int coin:coins) {
            int subproblem = dp(n-coin);
            if (subproblem == -1) continue;
            res = Math.min(res,1+subproblem);
        }
        if (res!=Double.POSITIVE_INFINITY){
            return (int)res;
        }else{
            return -1;
        }

    }

    static int dp2(int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==0) return 0;
        if(n<0) return -1;
        double res =Double.POSITIVE_INFINITY;
        for (int coin:coins) {
            int subproblem = dp(n-coin);
            if (subproblem == -1) continue;
            res = Math.min(res,1+subproblem);
        }
        if (res!=Double.POSITIVE_INFINITY){
            map.put(n,(int)res);
        }else{
            map.put(n,-1);
        }
        return map.get(n);

    }

    static int dp3(){
        int vector[] = new int[amount+1];
        vector[0]=0;
        for (int i=1;i<vector.length;i++){
            vector[i]=11;
            for (int coin :coins){
                if (i-coin<0) continue;
                vector[i] = Math.min(vector[i],1+vector[i-coin]);
            }
        }
        return  (vector[amount] == amount+1) ? -1 :vector[amount];

    }


}

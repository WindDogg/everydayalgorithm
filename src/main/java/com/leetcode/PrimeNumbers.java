package com.leetcode;

import java.util.Arrays;

/**
 * created by xhj on 2020-12-07
 */
public class PrimeNumbers {

    //第一种方式。
   public int countPrimenumbers(int n){
       int count = 0;

       for(int i = 2;i<n;i++){
           if (isPrime(i)) count++;
       }
       return count;
   }

   //第二种方式
    public int countPrimesTwo(int n){
       boolean[] isPrim = new boolean[n];
       //将数组初始化为true
        Arrays.fill(isPrim,true);
        for (int i = 2;i<n;i++)
            if (isPrim[i])
                for (int j=2*i;j<n;j+=i)
                    isPrim[j] = false;
        int count = 0;
        for (int i=2;i<n;i++)
            if (isPrim[i]) count++;
        return count;
    }
    //练习
    public int count(int n){
       boolean[] isPrims = new boolean[n];
       Arrays.fill(isPrims,true);
       for (int i=2;i<n;i++){
           if (isPrims[i]){
               for (int j=2*i;j<n;j+=i){
                   isPrims[j]=false;
               }
           }
       }
       int count = 0;
       for (int i=2;i<n;i++){
           if (isPrims[i]){
               count++;
           }
       }
       return count;
    }

   boolean isPrime(int n){
       for (int i=2;i<n;i++){
           if (n % i ==0) return false;
       }
       return true;
   }

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        int count1 =  pn.countPrimenumbers(10);
        System.out.println(count1);
        int count2 = pn.countPrimesTwo(10);
        System.out.println(count2);
    }
}

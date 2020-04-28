package com.dj.dynamicprogramming;

/**
 * 以斐波那契数列为例  主要解决动态规划中的重叠子问题
 */
public class Fibsl {
    /*
    暴力破解，直接递归时间复杂度O（2^n）
     */
    public int fib(int n){
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);

    }

    /**
     * 增加备忘录数组，计算过的存放到数组中，以备调用
     * 此方法是自顶向下计算,时间复杂度为O（n）
     */

    public int fib2(int n){
        if(n<1) return 0;
        int[] vector = new int[n+1];
        return help(vector,n);

    }

    public int help(int[] vector,int n){
        if(n==1 || n==2) return 1;
        if(vector[n]!=0) return  vector[n];
        vector[n]=help(vector,n-1)+help(vector,n-2);
        return vector[n];
    }

    /**
     * 受方法2启发，另一条思路，自底向上计算
     * 时间复杂度为O（n）
     * @param n
     * @return
     */
    public int fib3(int n){
        int vector[] = new int[n+1];
        vector[1]=vector[2]=1;
        for(int i = 3; i<=n; i++){
            vector[i]=vector[i-1]+vector[i-2];
        }
        return vector[n];

    }

    /**
     * 改良fib3,无需用数组存储所有的状态，只需存储返回值之前的两个状态即可
     * 时间复杂度 O（1）
     * @param n
     * @return
     */

    public int fib4(int n){
        if(n==1 || n==2){
            return 1;
        }
        int num1=1,num2=1;
        for (int i=3;i<=n;i++){
            int sum =num1+num2;
            num1=num2;
            num2=sum;
        }
        return num2;
    }



    public static void main(String[] args) {
        Fibsl fib = new Fibsl();
        System.out.println(fib.fib(30));
        System.out.println(fib.fib2(30));
        System.out.println(fib.fib3(30));
        System.out.println(fib.fib4(30));
    }
}

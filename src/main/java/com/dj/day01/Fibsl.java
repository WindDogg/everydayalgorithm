package com.dj.day01;

import java.util.Vector;

public class Fibsl {
    public int fib(int n){
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

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

    public static void main(String[] args) {
        Fibsl fib = new Fibsl();
        System.out.println(fib.fib2(7));
        System.out.println(fib.fib2(6));
    }
}

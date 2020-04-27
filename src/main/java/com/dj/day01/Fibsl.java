package com.dj.day01;

import java.util.Vector;

public class Fibsl {
    public int fib(int n){
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

    public int fib2(int n){
        if(n<1) return 0;
        Vector vector = new Vector(n+1,0);

        return help(vector,n);

    }

    public int help(Vector<Integer> vector,int n){
        if(n==1 || n==2) return 1;
        if(vector.get(n)!=0) return  vector.get(n);
        vector.add(n,help(vector,n-1)+help(vector,n-2));
        return vector.get(n);
    }

    public static void main(String[] args) {
        Fibsl fib = new Fibsl();
        System.out.println(fib.fib2(7));
    }
}

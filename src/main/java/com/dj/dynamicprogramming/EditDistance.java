package com.dj.dynamicprogramming;

/**
 * 给定两个字符串s1和s2，计算出将s1转换成s2所使用的最少操作数
 * 可以对一个字符串进行如下三种操作
 * 1.插入一个字符
 * 2.删除一个字符
 * 3.替换一个字符
 * 实例1：
 * 输入：s1 = "horse",s2="ros"
 * 输出：3
 */
public class EditDistance {
    String s1 = "horse";
    String s2 = "ros";
    char[] s3 = s1.toCharArray();
    char[] s4 = s2.toCharArray();

    public int minDistance(int i,int j){
        //base case
        if (i==-1) return j+1;
        if (j==-1) return i+1;

        if (s3[i]==s4[j]){
            return minDistance(i-1,j-1);
        }else{
            return Math.min(minDistance(i,j-1)+1,Math.min(minDistance(i-1,j)+1,minDistance(i-1,j-1)+1));
        }
    }

    public static void main(String[] args) {
        EditDistance ed = new EditDistance();

        System.out.println(ed.minDistance(ed.s3.length-1,ed.s4.length-1));
    }


}

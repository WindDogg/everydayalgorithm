package com.dj.dynamicprogramming;

import java.util.Arrays;

/**
 *给定一个无序的整数数组，找到其中最长上升子序列的长度
 * 实例：
 * 输入：[10,9,2,5,3,7,101,18]
 * 输出：4  [2,3,7,101]
 */
public class IncreasingSubsequence {
    /**向右计算
     * 动态规划方法
     *
     * @param nums
     * @return
     */
    public int lengthOfList(int[] nums){
        int dp[] = new int[nums.length];
        //dp数组全部初始化为1
        Arrays.fill(dp,1);
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res = 0;
        for (int i =0;i<dp.length;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}

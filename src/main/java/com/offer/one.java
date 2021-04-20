package com.offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * created by xhj on 2021/3/25
 * Set 成员的值是唯一的，没有重复
 */
public class one {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return res;
    }
}

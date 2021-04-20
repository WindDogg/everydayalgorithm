package com.offer;

import com.offer.utils.ListNode;

import java.util.Stack;

/**
 * created by xhj on 2021/3/30
 */
public class four {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        int[] array = new int[stack.size()];
        for (int i=0;i<stack.size();i++){
            array[i] = stack.pop();
        }
        return array;
    }
}

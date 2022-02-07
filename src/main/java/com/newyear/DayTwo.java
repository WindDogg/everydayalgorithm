package com.newyear;

import com.offer.utils.ListNode;

import java.util.HashMap;
import java.util.Map;

/** 捡算法的第二天呀
 * 递归反转链表的一部分
 * @author xhj
 * @version JVM
 * @Date 2022/1/19 17:18
 */
public class DayTwo {


    /**
     * 反转单链表  递归方式
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode last = reverse(head);
        head.next.next = head;
        head.next = null;
        return last;
    }


    /**
     * 反转链表  使用迭代方式
     * @param head
     * @return
     */
    public ListNode reverseByWhile(ListNode head){
        ListNode last = null;
        ListNode temp = head;

        while (temp!=null){
            ListNode next = temp.next;
            temp.next = last;
            last = temp;
            temp=next;

        }
        return last;
    }


    public ListNode reverseN(ListNode head,int n){
        ListNode last = null;
        if (n==1){

            return head;
        }
        ListNode res = reverseN(head,n-1);
        head.next.next = head;
        head.next = null;
        return res;
    }
















}

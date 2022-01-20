package com.newyear;

import com.offer.utils.ListNode;

import java.util.PriorityQueue;

/**
 * 重新练习算法的第一天
 * 关于单链表的问题
 * @author xhj
 * @version JVM
 * @Date 2022/1/17 10:07
 */
public class DayOne {

    /**
     * 合并两个有序列表
     * @param ln1
     * @param ln2
     * @return
     */

    public ListNode mergeTwoListNode(ListNode ln1,ListNode ln2){
        ListNode dummy = new ListNode(-1),p = dummy;

        ListNode p1 = ln1,p2 = ln2;

        while(p1!= null && p2!=null){
            //比较p1和p2两个指针
            //将值较小的介蒂安接到p指针
            if(p1.val >p2.val){
                p.next = p2;
                p2 = p2.next;
            }else{
                p.next =p1;
                p1 = p1.next;
            }
            //p指针不断前移
            p = p.next;
        }
        if (p1!=null){
            p.next = p1;
        }
        if (p2!=null){
            p.next = p2;
        }

        return dummy.next;
    }

    /**
     * 合并k个有序链表，利用优先队列
     * @param lists
     * @return
     */

    public ListNode mergeListNodes(ListNode[] lists){
        if (lists.length == 0) return null;
        //虚拟头节点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        //优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length,(a,b)->(a.val - b.val)
        );
        //将K个链表的头节点加入最小堆

        for (ListNode head : lists){
            if (head!=null){
                pq.add(head);
            }
        }

        while(!pq.isEmpty()){
            //获取最小节点，接到结果链表中
            ListNode node = pq.poll();
            p.next = node;
            if (node.next!= null){
                pq.add(node.next);
            }
            p = p.next;
        }

        return dummy.next;

    }


    /**
     * 返回链表的倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode findFromEnd(ListNode head,int k){
        ListNode p1 = head;
        //p1先走k步
        for (int i=0;i<k;i++){
            p1 = p1.next;
        }

        ListNode p2 = head;
        //p1和p2同时走n-k步
        while(p1!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        //p2 现在指向第n-k个节点
        return p2;

    }


    /**
     * 删除倒数第N个节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNFromEnd(ListNode head,int n){
        //虚拟头节点
        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        //要删除第N个节点，就要找到倒数第N+1个节点
        ListNode x = findFromEnd(dummy,n+1);
        //删除倒数第n个节点
        x.next = x.next.next;

        return dummy.next;

    }


    /**
     * 单链表的中点
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head){
        //快慢指针初始化指向head
        ListNode slow = head,fast = head;
        //快指针走到末尾时停止
        while(fast !=null && fast.next !=null){
            //慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        //慢指针指向中点
        return slow;
    }

    /**
     *判断链表中是否包含环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head){
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }

        return false;
    }


    /**
     * 链表中有环，计算环的起点
     * @param head
     * @return
     */
    ListNode detectCycle(ListNode head){
        ListNode slow = head,fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        if (fast==null || fast.next == null){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    /**
     * 两个链表是否相交
     * @param headA
     * @param headB
     * @return
     */

    ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode p1 = headA ,p2 = headB;
        while(p1!=p2){
            if (p1==null){
                p1 = headB;
            }else{
                p1 = p1.next;
            }
            if (p2 == null){
                p2 = headA;
            }else{
                p2 = p2.next;
            }
        }
        return p1;
    }



    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ln1.next = new ListNode(2);
        ln1.next.next = new ListNode(5);

        ListNode ln2 = new ListNode(1);
        ln2.next = new ListNode(3);
        ln2.next.next = new ListNode(4);

        DayOne d = new DayOne();
        ListNode res = d.mergeTwoListNode(ln1,ln2);
        System.out.println(res.val);


        while(res.next!=null){
            System.out.println(res.next.val);
            res = res.next;
        }



    }




}

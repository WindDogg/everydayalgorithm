package com.newyear;

import com.offer.utils.ListNode;
import com.offer.utils.TreeNode;

/**
 * 开刷二叉树
 * @author xhj
 * @version JVM
 * @Date 2022/1/25 16:43
 */
public class DayThree {

    public void traverse(ListNode head){

        if (head == null){
            return;
        }

        traverse(head.next);
        System.out.println(head.val);

    }

    public void traverseTree(TreeNode root){

        if (root == null){
            return;
        }

        System.out.println(root.val);
        traverseTree(root.left);
//        System.out.println(root.val);
        traverseTree(root.right);

//        System.out.println(root.val);


    }


    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);

        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(4);
        tn.left.right = new TreeNode(5);
        tn.right.left = new TreeNode(6);
        tn.right.right = new TreeNode(7);

        DayThree dt = new DayThree();

        /*dt.traverse(ln);*/
        dt.traverseTree(tn);
    }


}

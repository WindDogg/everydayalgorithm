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

    //遍历链表 输出倒序
    public void traverse(ListNode head){

        if (head == null){
            return;
        }

        traverse(head.next);
        System.out.println(head.val);

    }

    //遍历二叉树 前中后序
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

    int res = 0;//记录最大深度
    int depth = 0; //记录遍历到的节点的深度

    public void traverse(TreeNode root){
        if (root == null){
            //到达叶子节点，更新最大深度
            res = Math.max(res,depth);
            return;
        }

        //前序位置
        depth++;
        traverse(root.left);
        traverse(root.right);
        //后序位置
        depth--;
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

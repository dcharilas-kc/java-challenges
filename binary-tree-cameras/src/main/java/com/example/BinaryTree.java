package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTree {

    public static TreeNode formTree(Integer[] nums) {
        Deque<TreeNode> queue = new ArrayDeque<>();

        TreeNode root = new TreeNode(nums[0]);
        queue.add(root);

        int i = 1;
        while (i < nums.length) {
            TreeNode parent = queue.poll();
            Integer leftNum = nums[i++];

            if (leftNum != null) {
                TreeNode left = new TreeNode(leftNum);
                parent.left = left;
                queue.add(left);
            }

            if (i < nums.length) {
                Integer rightNum = nums[i++];
                if (rightNum != null) {
                    TreeNode right = new TreeNode(rightNum);
                    parent.right = right;
                    queue.add(right);
                }
            }
        }
        return root;
    }
}

package com.Tree.questions.BFS;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class ZigZagLevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean reverse = false;

        while (!deque.isEmpty()){
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = deque.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null){
                        deque.addLast(currentNode.left);
                    }
                    if (currentNode.right != null){
                        deque.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = deque.pollLast();
                    currentLevel.add(currentNode.val);
                    if (currentNode.right != null){
                        deque.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null){
                        deque.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}
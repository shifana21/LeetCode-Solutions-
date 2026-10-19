// ==========================================================
// 99. Recover Binary Search Tree
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 10%)
// Memory     : 46.2 MB (Beats 94%)
// Link       : https://leetcode.com/problems/recover-binary-search-tree/
// ==========================================================

class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                if (prev != null && prev.val > curr.val) {
                    if (first == null) {
                        first = prev;
                    }
                    second = curr;
                }

                prev = curr;
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;

                    if (prev != null && prev.val > curr.val) {
                        if (first == null) {
                            first = prev;
                        }
                        second = curr;
                    }

                    prev = curr;
                    curr = curr.right;
                }
            }
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
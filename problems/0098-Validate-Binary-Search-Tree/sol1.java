// ==========================================================
// 98. Validate Binary Search Tree
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.7 MB (Beats 95%)
// Link       : https://leetcode.com/problems/validate-binary-search-tree/
// ==========================================================

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val)
            && validate(node.right, node.val, max);
    }
}
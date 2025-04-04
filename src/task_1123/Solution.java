package task_1123;


public class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }

    record Result(TreeNode node, int level) {
    }

    Result dfs(TreeNode root) {
        if (root == null) {
            return new Result(null, 0);
        }

        Result left = dfs(root.left);
        Result right = dfs(root.right);

        if (left.level > right.level) {
            return new Result(left.node, left.level + 1);
        }
        if (left.level < right.level) {
            return new Result(right.node, right.level + 1);
        }
        return new Result(root, left.level + 1);
    }
}
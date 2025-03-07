package task_0872;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstSeq = getLeafSequence(root1);
        List<Integer> secondSeq = getLeafSequence(root2);

        return firstSeq.equals(secondSeq);
    }

    private List<Integer> getLeafSequence(TreeNode root) {
        List<Integer> seq = new ArrayList<>();
        visit(root, seq);
        return seq;
    }

    private void visit(TreeNode root, List<Integer> seq) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            seq.add(root.val);
        }
        visit(root.left, seq);
        visit(root.right, seq);
    }
}
package 二叉搜索树的第k大节点;

import common.TreeNode;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/19 22:12
 * @Version 1.0
 **/
public class Solution {

    int count = 0, res = 0;
    public int kthLargest(TreeNode root, int k) {
        this.count = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null || count == 0) return;
        dfs(root.right);
        if (0 == --count) {
            res = root.val;
            return;
        }
        dfs(root.left);
    }

}

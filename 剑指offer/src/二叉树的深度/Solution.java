package 二叉树的深度;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/19 22:04
 * @Version 1.0
 **/
public class Solution {


//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        int res = 0;
//        while (!queue.isEmpty()) {
//            res++;
//            int n = queue.size();
//            for (int i = 0; i < n; i++) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//
//        }
//        return res;
//    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}

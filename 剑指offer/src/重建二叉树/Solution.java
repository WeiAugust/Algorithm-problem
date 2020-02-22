package 重建二叉树;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 13:40
 * @Version 1.0
 **/
public class Solution {

     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0){
            return null;
        }
        Map<Integer, Integer> nodeMap = new HashMap<>();
        int length = preorder.length;
        for (int i = 0; i < length; i++) {
            nodeMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, length-1, inorder, 0, length-1, nodeMap);
        return root;
    }

    private TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> nodeMap){
         if(preStart > preEnd){
             return null;
         }
         int rootVal = preOrder[preStart];
         TreeNode root = new TreeNode(rootVal);
         if(preStart == preEnd){
             return root;
         }else {
             int rootIndex = nodeMap.get(rootVal);
             int leftNodes = rootIndex - inStart, rightNodes = inEnd - rootIndex;
             TreeNode leftSubtree = buildTree(preOrder, preStart+1, preStart+leftNodes, inOrder, inStart, rootIndex-1, nodeMap);
             TreeNode rightSubtree = buildTree(preOrder, preEnd-rightNodes+1, preEnd, inOrder, rootIndex+1, inEnd, nodeMap);
             root.left = leftSubtree;
             root.right = rightSubtree;
             return root;

         }
    }
}

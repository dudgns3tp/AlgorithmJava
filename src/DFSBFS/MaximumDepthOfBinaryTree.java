package DFSBFS;

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int x){
        this.val = x;
    }
}
public class MaximumDepthOfBinaryTree {
    public static void main(String []args){
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        MaximumDepthOfBinaryTree a =new MaximumDepthOfBinaryTree();
        System.out.println(a.maxDepth(tree));
    }

    public int maxDepthDFS(TreeNode root){
        if(root==null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();
        stack.push(root);
        valueStack.push(1);
        int max = 0;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int count = valueStack.pop();
            max = Math.max(max,count);
            if(node.left != null){
                stack.push(node.left);
                valueStack.push(1+count);
            }
            if(node.right != null){
                stack.push(node.right);
                valueStack.push(1+count);
            }

        }
        return 0;
    }

    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        return Math.max(leftMax, rightMax) +1;

    }
}

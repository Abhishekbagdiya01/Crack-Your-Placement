// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class MaximumDepthOfBinaryTree {

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    return Math.max(leftDepth, rightDepth) + 1;
  }

  public static void main(String[] args) {
    TreeNode b1 = new TreeNode(3);
    TreeNode b2 = new TreeNode(9);
    TreeNode b3 = new TreeNode(20);
    TreeNode b4 = new TreeNode(15);
    TreeNode b5 = new TreeNode(7);
    b1.left = b2;
    b1.right = b3;
    b3.left = b4;
    b3.right = b5;
    System.out.println("Height of the Binary Tree is : " + maxDepth(b1));
  }

}

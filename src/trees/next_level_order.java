package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    trees.TreeNode left;
    trees.TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}




public class next_level_order {
    public TreeNode findSuccessor(TreeNode root, int key){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize= queue.size();
            TreeNode currentNode = queue.poll();
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.offer(currentNode.right);
                if(currentNode.val==key){
                    break;

                }
            }
        }

        return queue.peek();
    }
    public static void main(String[] args) {
        //         1
        //       /   \
        //      2     3
        //     / \     \
        //    4   5     6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        next_level_order solver = new next_level_order();
        List<List<Integer>> result = (List<List<Integer>>) solver.findSuccessor(root,14);

        System.out.println(result);
    }



}

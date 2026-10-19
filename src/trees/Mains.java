package trees;
class Nodes{
    int val;
    Nodes left, right;

    Nodes(int x ){
        val =x;
        left=null;
        right=null;

    }
}


class Solution {
    public Nodes insertNode(Nodes root, int key){
        if(root==null){
            return new Nodes(key);
        }
        if(key< root.val){
            root.left=insertNode(root.left,key);
        }
        else{
            root.right=insertNode(root.right,key);
        }
        return root;
    }
    public void inorder(Nodes root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
public class Mains{
    public static void main(String[] args){
        Solution sol = new Solution();
        Nodes root = new Nodes(10);
        sol.insertNode(root,25);
        sol.insertNode(root,30);
        sol.inorder(root);

    }
}

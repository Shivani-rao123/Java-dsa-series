package trees;

class BST {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }


    }
    private  Node root;
    public BST(){

    }
    public int height(Node node){
        if(node== null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
       return root == null;
    }
    public void display(){
        display(root,"Root Node: ");

    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.getValue());

        display(node.left,"Left child of "+node.getValue()+": ");
        display(node.right,"Right child of "+node.getValue()+": ");


    }

    public void insert(int value){
        if(isEmpty()){
            root = new Node(value);
        }
        else{
            Node current = root;
            while(current.value != value){
                if(current.value < value){
                    if(current.right == null){
                        current.right = new Node(value);

                    }
                    else{
                        current = current.right;

                    }

                }
                else if(current.value > value){
                    if(current.left == null){
                        current.left = new Node(value);
                    }
                }
            }
        }

    }

}

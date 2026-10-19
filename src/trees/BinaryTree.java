package trees;

import java.util.Scanner;

class BinaryTree {

     public BinaryTree(){

     }//constructor

  private static  class Node{
     int value;
     Node left;
     Node right;

     public Node(int value){

         this.value=value;
     } //constructor
  }
  private Node root;
     //insert elemenst

     public void populate(Scanner scanner){
         System.out.println("Enter the root node: ");
         int value = scanner.nextInt();
         root = new Node(value);
         populate(scanner,root);
     }
     private void populate(Scanner scanner,Node node){
         System.out.println("Do u want to enter left of "+node.value);
         boolean left = scanner.nextBoolean();
         if(left){
             System.out.println("Enter the value of the left of "+node.value);
             int value = scanner.nextInt();
             node.left = new Node(value);
             populate(scanner,node.left);

         }
         boolean right = scanner.nextBoolean();
         if(right){
             System.out.println("Enter the value of the right of "+node.value);
             int value = scanner.nextInt();
             node.right = new Node(value);
             populate(scanner,node.right);

         }
     }

    // public entry point — called from Main
    public void display(){
        display(root, "");
    }

    // private recursive helper
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void prettyDisplay(){
         prettyDisplay(root,0);

    }
    private void prettyDisplay(Node node, int level){
         if(node == null){
             return;
         }
         prettyDisplay(node.right, level+1);
         if(level!=0){
             for(int i=0;i<level-1;i++){
                 System.out.print("\t\t");

             }
             System.out.print("------->" + node.value);
         }else{
             System.out.println(node.value);
         }
         prettyDisplay(node.left, level+1);

    }


}

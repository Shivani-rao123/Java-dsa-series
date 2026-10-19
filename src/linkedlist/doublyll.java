package linkedlist;

public class doublyll {
    public doublyll(){

    }

    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!= null){
            head.prev = node;
        }
        head = node;
    }
  public void displayRev(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.val+"->");
            last = node;
            node = node.next;

        }
        while(last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
      System.out.println();
  }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+"->");
            node = node.next;

        }
    }

    private class Node{
        public Node(int val) {
            this.val = val;
        }

        int val ;

        public Node(Node next, Node prev) {
            this.next = next;
            this.prev = prev;
        }

        Node next;
         Node prev;

    }
}

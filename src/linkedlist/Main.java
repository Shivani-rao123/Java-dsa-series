package linkedlist;
class Node{
    int data;
    Node next;
    Node(int val){
        data =val;
        next=null;

    }
}

public class arraytolinkedlist {
    public static void main(String[] args) {
        arraylis sol = new arraylis();
        int[] arr = {1, 2, 3, 4, 5};

        Node head = sol.arrayToLinkedList(arr);
        sol.printList(head);
    }

}
public Node arraylis(int[] arr){
    if(arr.length==0){
        return null;
    }
    Node head = new Node(arr[0]);
    Node curr= head;

    for(int i=1;i<arr.length;i++){
        curr.next= new Node(arr[i]);
        curr= curr.next;

    }
    return head;

}
public void printdata(Node head){
    while(head!=null)
    {
        System.out.println(head.data+" ");
        head= head.next;
    }
    System.out.println();

}

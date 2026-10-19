package linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(int size) {
        this.size = size;
    }

    public LL() {

    }

    public void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void inserLast(int val ){
        if(tail == null){
            insert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail= node ;
        size++;
    }
    public void print() {
        Node temp = head;
        while (temp != null){

            System.out.print(temp.value );
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();

    }
    // innsert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val,int index, Node node){
        if(index ==0 ){
            Node temp = new Node(node,val);
            size++;
            return temp;

        }
        node.next=insertRec(val, index--,node.next);
        return node;

    }



    public void insert(int val, int index){
        if(index ==0){
            insert(val);
            return;
        }
        if(index == size){
            inserLast(val);
            return;

        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(temp.next,val);
        temp.next=node;
        size++;
    }

    public int deletefirst(){
      int val = head.value;
      head = head.next;
      if(head == null){
          tail = null;
      }
      size--;
      return val;

    }
    public int deleteLast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next= null;
        size--;
        return val;
    }
    public int  deleteIndex(int index){
        if(index ==0){
            return deletefirst();
        }
        if(index== size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
   public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;

    }
    public LL.Node find(int value){
        Node node = head;
        int index=0;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node= node.next;
            index++;

        }
        return null;

    }



   private class Node{
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(Node next, int value) {
           this.next = next;
           this.value = value;
       }
   }


}

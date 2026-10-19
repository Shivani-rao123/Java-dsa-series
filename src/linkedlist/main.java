package linkedlist;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(3);
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.inserLast(66);
        list.insert(7,2);
        System.out.println(list.deletefirst());
        System.out.println(list.deleteLast());
        System.out.println(list.deleteIndex(2));
        System.out.println(list.find(7));
        list.insertRec(888,2);

        list.print();
//        doublyll dll = new  doublyll();
//        dll.insertFirst(10);
//        dll.insertFirst(20);
//        dll.insertFirst(30);
//        dll.display();
//        dll.displayRev();
//


    }
}

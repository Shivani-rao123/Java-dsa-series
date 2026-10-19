package linkedlist;
class Node {
    int data;
    Node next;

    // Constructor to initialize node
    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution {
    // Convert array to linked list and return head
    public Node arrayToLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        // Create head node
        Node head = new Node(arr[0]);
        Node curr = head;

        // Iterate through array and create nodes
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    // Print linked list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};

        Node head = sol.arrayToLinkedList(arr);
        sol.printList(head);
    }
}
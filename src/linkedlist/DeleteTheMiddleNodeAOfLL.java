package linkedlist;

import util.SinglyLinkedList;

import javax.swing.*;

/**
 2095. Delete the Middle Node of a Linked List
 1. If head is null or head.next is null, return head (no mid to remove in a single-node list or empty list).
 2. Traverse the linked list using a slow and a fast pointer:
 - Slow pointer moves one step at a time.
 - Fast pointer moves two steps at a time.
 3. Keep track of the previous node (prev) to the slow pointer during traversal.
 4. When the fast pointer reaches the end of the list:
 - The slow pointer will be at the middle node.
 - Set prev.next = slow.next to remove the middle node.
 5. Return the head of the updated linked list.

 Complexity:
 - **Time Complexity**: O(n) - Each node is visited at most once.
 - **Space Complexity**: O(1) - No additional data structures are used.
 */

public class DeleteTheMiddleNodeAOfLL {
    private static SinglyLinkedList.ListNode deleteMiddle(SinglyLinkedList.ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        SinglyLinkedList.ListNode slow = head;
        SinglyLinkedList.ListNode fast = head;
        SinglyLinkedList.ListNode prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }

//    public static void main(String[] args) {
//        SinglyLinkedList sl = new SinglyLinkedList();
//        sl.insertEnd(1);
//        sl.insertEnd(2);
//        sl.insertEnd(3);
//        sl.insertEnd(4);
//        SinglyLinkedList.head = sl.;
//        sl.display();
////        DeleteTheMiddleNodeAOfLL.deleteMiddle()
//    }
}

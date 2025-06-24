package linkedList;

/**
 * @author niranjanjoglekar on 24/07/2025
 *     <p>Given the head of a singly linked list, return the middle node of the linked list.
 *      If there are two middle nodes, return the second middle node.
 */
public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private void traverse(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        ListNode fifth = new ListNode(6);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        MiddleOfLinkedList object = new MiddleOfLinkedList();
        ListNode node = object.middleNode(head);
        object.traverse(node);
    }
}



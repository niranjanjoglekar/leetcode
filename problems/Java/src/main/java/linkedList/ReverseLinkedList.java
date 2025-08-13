package linkedList;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next; // Store next node
            current.next = prev; // reverse link
            prev = current; // move prev forward
            current = nextNode; // move current forward
        }
        return prev; // new head;
    }

    public ListNode reverseList2(ListNode head) {

        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList2(head.next);
        head.next.next = head; // reverse the link
        head.next = null;      // prevent cycle
        return newHead;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}

package linkedList;

/**
 * @author niranjanjoglekar on 30/06/22
 *     <p>Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *     There is a cycle in a linked list if there is some node in the list that can be reached again
 *     by continuously following the next pointer. Return true if there is a cycle in the linked
 *     list. Otherwise, return false.
 */
public class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (slow != null && fast != null) {

      if (fast == null || fast.next == null) {
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }

    return false;
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
    ListNode head = new ListNode(0);
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    head.next = first;
    first.next = second;
    second.next = third;
    third.next = third;

    LinkedListCycle object = new LinkedListCycle();

    System.out.println(object.hasCycle(head));
  }
}

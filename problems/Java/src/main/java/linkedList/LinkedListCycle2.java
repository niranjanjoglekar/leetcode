package linkedList;

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head, fast = head;

        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Here we found cycle; now exit
            if(slow == fast) {
                break;
            }
        }

        // If pointer reached null then there is no cycle
        if(fast==null || fast.next == null) {
            return null;
        }

        ListNode slow2 = head;
        while(slow2 != slow) {
            slow2 = slow2.next;
            slow = slow.next;
        }
        return slow2;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = first;
    }
}

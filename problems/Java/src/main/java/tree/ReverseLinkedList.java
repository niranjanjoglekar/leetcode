package tree;

/**
 * @author niranjanjoglekar on 29/06/22
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next=null;

        ReverseLinkedList object = new ReverseLinkedList();
        object.printList(root);

        object.reverseList(root);

    }

    void printList(ListNode node){
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode lastNode,tempNode,currentNode;
        if(head==null){
            return head;
        }
        lastNode=head;
        currentNode=head.next;
        tempNode=head.next;
        lastNode.next=null;
        while(currentNode!=null){
            currentNode=currentNode.next;
            tempNode.next=lastNode;
            head=tempNode;
            lastNode=tempNode;
            tempNode=currentNode;

        }

        return head;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

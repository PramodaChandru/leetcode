public class ReverseLL {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertEnd(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data +" --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode;
        while(curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLL rll = new ReverseLL();
        rll.insertEnd(10);
        rll.insertEnd(20);
        rll.insertEnd(30);
        rll.insertEnd(40);

        rll.display(head);

        ListNode reverseLNode = rll.reverse(head);

        rll.display(reverseLNode);

    }
}

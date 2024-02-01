import java.util.List;

public class SearchElementSLL {

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

    public void display() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data +" --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    private boolean searchElement(int val) {
        ListNode curr = head;
        while(curr != null) {
            if(curr.data == val) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElementSLL ssl = new SearchElementSLL();
        ssl.insertEnd(10);
        ssl.insertEnd(20);
        ssl.insertEnd(30);
        ssl.insertEnd(40);

        ssl.display();

        System.out.println(ssl.searchElement(40));


    }


}

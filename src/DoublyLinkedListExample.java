class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private ListNode head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void append(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void displayForward() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
       
    }

    public void displayBackward() {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
       
    }
    public void addatbegin(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }
    public void ddeleteFirst() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void ddeleteLast() {
        if (head != null) {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            if (current.prev != null) {
                current.prev.next = null;
            } else {
                // The list has only one element
                head = null;
            }
        }
    }

}
public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.addatbegin(4);
       

        System.out.println("Forward:");
        dll.displayForward();
       
        System.out.println("\nBackward:");
        dll.displayBackward();
        System.out.println(" ");
        dll.ddeleteFirst();
        dll.ddeleteLast();
        dll.displayForward();
       
    }
}

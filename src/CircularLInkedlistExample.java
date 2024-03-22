class CNode {
    int data;
    CNode next;

    public CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private CNode head;

    public CircularLinkedList() {
        this.head = null;
    }
    public void AddFirst(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = head;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
        } else {
            CNode temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

}
public void AddAtlast(int data) {
    CNode newNode = new CNode(data);
    if (head == null) {
        head = newNode;
        head.next = head;
    } else {
        CNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
}
public void DeleteLast() {
    if (head == null) {
        System.out.println("Circular Linked List is empty");
    } else {
        CNode temp = head;
        CNode prev = null;
        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == head) {
            head = null;
        } else {
            prev.next = head;
        }
    }
}
public void deleteByValue(int value) {
    if (head == null) {
        System.out.println("empty");
    } else {
        CNode temp = head;
        CNode prev = null;
        do {
            if (temp.data == value) {
                if (temp == head) {
                    head = head.next;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Element not found in the Circular Linked List");
    }
}
}
public class CircularLInkedlistExample {
    public static void main(String[] args) {
        
    

    CircularLinkedList cl =new CircularLinkedList();

    cl.AddAtlast(5);
    cl.AddFirst(4);
    cl.AddFirst(3);
    cl.AddFirst(2);
    cl.AddFirst(1);
    cl.AddAtlast(6);
    cl.display();
    cl.deleteByValue(3);
    cl.display();
    cl.DeleteLast();
    cl.display();


}
}

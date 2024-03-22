class Node {
    int data;
    Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Linkedlist {
    Node head;
    int size;

    Linkedlist() {
        head = null;
        size = 0;
    }

    int si()
    {
        
        return size;
    } 

    int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        Node reference = head;
        for (int i = 0; i < index; i++) {
            reference = reference.next;
        }
        return reference.data;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node reference = head;
            while (reference.next != null) {
                reference = reference.next;
            }
            reference.next = newNode;
        }
        size++;
    }

    void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node reference = head;
            for (int i = 0; i < index - 1; i++) {
                reference = reference.next;
            }
            newNode.next = reference.next;
            reference.next = newNode;
            size++;
        }
    }
    void deletefirst()
    {
        if(head==null)
        {
            System.out.println("cannot delete");
        }
        else{
        head=head.next;
        size--;
        }
    }
    void deletelast()
    {
        if(head==null)
        {
            System.out.println("cannot delete");

        }
        else {
            Node reference=head;
            while(reference.next.next!=null)
            {
                reference=reference.next;
            }
            reference.next=null;
        }
        size--;
    }
    void deleteatindex(int index)
        {

            if(index<0||index>size)
            {
                System.out.println("Invalid Index");
                return;
            }
            if(index==0)
            {
                head=head.next;
            }
            else
            {
            Node reference=head;

            for(int i=0;i<index-1;i++)
            {
                reference=reference.next;
            }
            reference.next=reference.next.next;
            
            }
            size--;
        }
        void reverse() {
            Node reversedNode = null;
            Node nextNode = null;
            Node reference = head;
        
            while (reference != null) {
                nextNode = reference.next;
                reference.next = reversedNode;
                reversedNode = reference;
                reference = nextNode;
            }
        
            head = reversedNode;
        }

    void display() {
        Node reference = head;
        while (reference != null) {
            System.out.print(reference.data + " ");
            reference = reference.next;
        }
        System.out.println();
    }

    
int findMin() {
    if (head == null) {
        System.out.println(" empty");
        return -1;
    }

    int min = head.data;
    Node reference = head.next;

    while (reference != null) {
        if (reference.data < min) {
            min = reference.data;
        }
        reference = reference.next;
    }

    return min;
}
int findMax() {
    if (head == null) {
        System.out.println(" empty");
        return -1;
    }

    int max = head.data;
    Node reference = head.next;

    while (reference != null) {
        if (reference.data > max) {
            max = reference.data;
        }
        reference = reference.next;
    }

    return max;
}
void rotateRight(int k) {
    if (head == null || k <= 0) {
        return; 
    }

    int length = si();
    k = k % length; 

    if (k == 0) {
        return; 
    }

    Node reference = head;
    for (int i = 0; i < length - k - 1; i++) {
        reference = reference.next;
    }

    Node newHead = reference.next;
    reference.next = null; 

    Node temp = newHead;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = head; 

    head = newHead; 
}

void leftrotation(int k)
{
        if (head == null || k <= 0) {
            return; 
        }
    
        int length = si();
        k = k % length; 
    
        if (k == 0) {
            return; 
        }

    Node reference=head;
    
    for(int i=0;i<k-1;i++)
    {
        reference=reference.next;
}
Node newhead=reference.next;
reference.next=null;
Node newref=newhead;
while(newref.next!=null)
{
    newref=newref.next;
}
newref.next=head;
head=newhead;



}
/*boolean isPalindrome() {
    if (head == null || head.next == null) {
        return true; 

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    Node secondHalf = reverse(slow);

    Node firstHalf = head;
    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) {
            return false; 
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }

    return true; 
}*/



boolean loop()
{
    
    Node slow = head;
    Node fast = head;

    while (slow.next!=null && fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow==fast)
        {
            return true;
        }
    }
    return false;
}
}




public class Linkedlistexample {
     public static void main(String[] args) {
        Linkedlist myList = new Linkedlist();

        myList.addFirst(1);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(5);
        myList.addLast(6);
        myList.addLast(7);
        

        //System.out.println("Linked List Elements:");
        //myList.display();  

        //System.out.println("Element at index 1: " + myList.get(1)); 
/* 
        myList.display();
        myList.deletefirst();

        myList.display();
        myList.deletelast();
        myList.display();

        myList.deleteatindex(2);
        myList.display();

        int size=myList.si();
        System.out.println(myList.get(size/2));
        myList.deleteatindex(size/2);
        myList.display();

        myList.addLast(7);
        myList.addLast(8);
        myList.addLast(9);
        myList.addLast(10);
        myList.display();
        */
        myList.display();
       myList.leftrotation(3);
      //  myList.reverse();
      myList.display();



    }
}

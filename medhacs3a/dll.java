import java.util.Scanner;

public class dll {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    void addF(int data) {
        Node new_node = new Node(data);
        new_node.prev = null;
        new_node.next = head;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    void push_at(int newElement, int position) {
        Node newNode = new Node(newElement);

        newNode.next = null;
        newNode.prev = null;
        if (position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node temp ;
            temp = head;
            for (int i = 1; i < position - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
                if (newNode.next != null)
                    newNode.next.prev = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
    }

    void addEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = tail = new_node;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
            tail.next = null;

        }
    }

    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked linked list is empty");
        } else {
            System.out.println("The doubly linked list is");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String a[]) {
        int ch, data;
        dll list = new dll();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\t1.Add node at the end");
            System.out.println("\t2.Add node at the front");
            System.out.println("\t3.Add node at the given position");
            System.out.println("\t4.Delete a given element ");
            System.out.println("\t5.Display DLL");
            System.out.println("\t0.To exit\n");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the data to be inserted:");
                    data = sc.nextInt();
                    list.addEnd(data);
                    break;
                case 2:
                    System.out.print("Enter the data to be inserted:");
                    data = sc.nextInt();
                    list.addF(data);
                    break;
                case 3:
                    System.out.print("Enter the data to be inserted:");
                    int newdata = sc.nextInt();
                    System.out.print("Enter the position to be inserted:");
                    int pos = sc.nextInt();
                    list.push_at(newdata, pos);
                    break;
                case 4:
                    System.out.println("Enter the element to be deleted:");
                    int dltele = sc.nextInt();
                    Node temp = list.head;
                    while (temp.data != dltele) {
                        temp = temp.next;
                    }
                    if (temp.prev == null) {
                        list.head = temp.next;
                    } else {
                        temp.prev.next = temp.next;
                    }
                    break;
                case 5:
                    list.display();
                    break;
                case 0:
                    System.out.println("Exit from stack");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (ch != 0);
    }
}

import java.util.Scanner;

class Node {
    String data;
    Node next;

    // Constructor
    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to append
    void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to remove
    void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (index == 0) { // Remove the head
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            prev = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        prev.next = current.next; // Bypass the node to be removed
    }

    // Method to display the linked list
    void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();


        for (int i = 0; i < 4; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String data = scanner.nextLine();
            linkedList.append(data);
        }

        System.out.println("Linked List before removal:");
        linkedList.display();


        System.out.print("Enter the index of the element to remove (0-3): ");
        int indexToRemove = scanner.nextInt();
        linkedList.removeAtIndex(indexToRemove);

        System.out.println("Linked List after removal:");
        linkedList.display();

        scanner.close();
    }
}


import java.util.Scanner;
class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList3{
    Node3 head;
    public void insertAtTail(int data) {
        Node3 newNode = new Node3(data);
        if(head == null) {
            head = newNode;
        }else{
            Node3 temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void reverseList(){
        Node3 prev = null;
        Node3 temp = head;
        Node3 next = null;
        while(temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
    public void printList(){
        Node3 temp = head;
        while(temp != null) {
            System.out.print(temp.data +" " );
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Q5Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList3 list = new LinkedList3();
        System.out.println("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter the linked list elements: ");
        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            list.insertAtTail(value);
        }
        System.out.println("Original linked list: ");
        list.printList();
        list.reverseList();
        System.out.println("Reversed linked list: ");
        list.printList();
    }
    }


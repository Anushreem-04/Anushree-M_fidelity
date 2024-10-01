import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
        public void printList(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public class Q1InsertionAtTail{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            LinkedList list = new LinkedList();
            System.out.println("Enter the size of the LinkedList: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the LinkedList: ");
            for(int i = 0; i < n; i++){
                int value = sc.nextInt();
                list.insertAtTail(value);
            }
            System.out.println("The final LinkedList is: ");
            list.printList();

        }
    }

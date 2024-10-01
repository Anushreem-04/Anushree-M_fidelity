import java.util.Scanner;
class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList2{
    Node2 head;
    public void insertAtPosition(int data, int position){
        Node2 newNode = new Node2(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node2 current = head;
            for(int i = 0; i < position-1&& current !=null; i++){
                current = current.next;
            }
            if(current == null){
                System.out.println("position out of bounds, inserting at the end");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void printList(){
        Node2 current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class Q3InsertAtSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList2 list = new LinkedList2();
        System.out.println("Enter the initial linked list values");
        for(int i = 0; i < 3; i++){
            int value = sc.nextInt();
            list.insertAtPosition(value, i);
        }
        System.out.println("Current linked list: ");
        list.printList();
        System.out.println("Enter the  value to insert: ");
        int newvalue = sc.nextInt();
        System.out.println("Enter the position to insert:");
        int position = sc.nextInt();
        list.insertAtPosition(newvalue, position);
        System.out.println("The updated linked list is: ");
        list.printList();
    }
}
import java.util.Scanner;
class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList1{
    Node1 head;
    public void insertAtHead(int data){
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
public class Q2InsertingAtHead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList1 list = new LinkedList1();
        System.out.println("Enter the size of the LinkedList");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the LinkedList");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtHead(value);

        }
        System.out.println("The final LinkedList is ");
        list.printList();
    }
}

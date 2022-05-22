import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class sortedLinkedList {
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(65);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the node to be inserted :: ");
        int k = scan.nextInt();

        head = sorted(head,k);
        printll(head);
        scan.close();
    }    

    public static void printll(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node sorted(Node head, int k)
    {
        
        Node temp = new Node(k);
        if(head == null )
        return temp;
        if(k < head.data){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next !=null && curr.data <temp.data)
        {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}

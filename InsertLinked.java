import java.util.*;
class Node
{
    int data;
    Node next,prev;
    Node(int data)
    {
        this.data = data;
        next=prev=null;
    }
}
public class InsertLinked {
    public static void main(String[] args){
    int data;
    Scanner scan = new Scanner(System.in);
    Node head = new Node(10);
    Node temp1 = new Node(30);
    Node temp2 = new Node(40);
    head.next = temp1;
    temp1.prev = head;
    temp1.next = temp2;
    temp2.prev = temp1;
    System.out.println("Enter node to be inserted in begin :: ");
    data = scan.nextInt();
    head = insertBeg(head,data);
    printlist(head);
    delLast(head);
    printlist(head);
    scan.close();
}
public static Node insertBeg(Node head,int data)
{
    Node temp = new Node(data);
    temp.next = head;
    if(head!=null)
    {
        head.prev = temp;
    }
    return temp;
}
public static Node delLast(Node head)
{
    if(head == null || head.next == null) 
    return null;
   Node curr = head;
   while(curr.next !=null)
   {
       curr = curr.next;
   }
   curr.prev.next = null;
   return head;
}
public static void printlist(Node head){
    Node curr=head;
    while(curr!=null){
    System.out.print(curr.data+" ");
    curr=curr.next;
}System.out.println();
}
}


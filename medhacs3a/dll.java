import java.io.*;
import java.util.Scanner;
public class dll{
	class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	Node head,tail=null;
	public void addNode(int data){
		Node new_node=new Node(data);
		if (head==null){
			head=tail=new_node;
			head.prev=null;
			tail.next=null;
		}
		else{
			tail.next=new_node;
			new_node.prev=tail;
			tail=new_node;
			tail.next=null;
			
		}
	}
	public void display(){
		Node current=head;
		if(head==null){
			System.out.println("Doubly linked linked list is empty");
		}
		else{
			System.out.println("The doubly linked list is");
			while(current!=null){
				System.out.println(current.data+" ");
				current=current.next;
			}
		}
	}
	public void delete(Node del){
		if(head==del)
			head = del.next;
		if (del.next != null) {
      del.next.prev = del.prev;}
		if (del.prev != null) {
      del.prev.next = del.next;}
    return;  }

	public static void main(String a[]){
			int ch;
			dll list=new dll();
			Scanner sc=new Scanner(System.in);
			list.addNode(3);
			
			do{
				System.out.println("1.Add node");
				System.out.println("2.Delete node");
				System.out.println("3.Display DLL");
				System.out.println("0.To exit\n");
				System.out.print("Enter your choice: ");
				ch=sc.nextInt();

				switch(ch){
					case 1:System.out.print("Enter the data to be inserted:");
					int data=sc.nextInt();
					list.addNode(data);
					break;
					case 2:
					list.delete(list.head);list.delete(list.head.next);list.delete(list.head.next);
					break;
					case 3:list.display();
					break;
					default:System.out.println("Invalid choice");break;}
			} while(ch!=0);
	}
}


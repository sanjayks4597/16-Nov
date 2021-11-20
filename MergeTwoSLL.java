package linkedlist;
//class Node{
//	int data;
//	Node next;
//	
//	Node(int x)
//	{
//		data=x;
//		next=null;
//		
//	}
//}
public class MergeTwoSLL {

	public static void main(String[] args) {
		
		Node head=null;
		Node head1=null;
		Node List11=new Node(4);
		Node List12=new Node(44);
		Node List13=new Node(45);
		Node List14=new Node(43);
		
		head=List11;
		List11.next=List12;
		List12.next=List13;
		List13.next=List14;
		
		Print(head);
		System.out.println();
		head1=null;
		Node List21=new Node(7);
		Node List22=new Node(74);
		Node List23=new Node(12);
		
		
		head1=List21;
		List21.next=List22;
		List22.next=List23;
		
		Print(head1);
		System.out.println();
		Node newNode=Merge(head,head1);
		
		Print(newNode);
		
		
	}

	private static Node Merge(Node head, Node head1) {
		
		Node pointer=head1;
		while(pointer.next!=null) {
			pointer=pointer.next;
			
		}
		pointer.next=head;
		pointer=head1;
		return head1;

		
	}

	private static void Print(Node head) {
		Node pointer=head;
		while(pointer!=null)
		{
			System.out.print(pointer.data+" ");
			pointer=pointer.next;
		}
		
	}

}

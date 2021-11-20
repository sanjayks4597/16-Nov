package linkedlist;

public class KthElementFromEndSingleRecursion {

	public static void main(String[] args) {
		
		Node head=null;
		int k=4;
		head=Insert(head,45);
		head=Insert(head,34);
		head=Insert(head,74);
		head=Insert(head,345);
		head=Insert(head,35);
		head=Insert(head,12);
		head=Insert(head,87);
		
		head=Insert(head,6);
		head=Insert(head,8);
		head=Insert(head,7);
		head=Insert(head,782);
		printR(head);
		
		System.out.println();
		
		Node slow=head;
		Node fast=head.next.next.next.next.next;
		while(slow!=null)
		{
			slow=slow.next;
			fast=fast.next;
			if(fast==null) {
				System.out.println(slow.data);
				break;
			}
			
		}
		

	}
	private static void printR(Node head) {
		if(head!=null)
		{
			System.out.print(head.data+" ");
			printR(head.next);
		}
		
	}

	public static Node Insert(Node head,int x) {
		
		Node temp=new Node(x);
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=temp;
		return head;
	}

}

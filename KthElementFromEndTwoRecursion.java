package linkedlist;

//class Node{
//int data;
//Node next;
//Node(int x)
//{
//	data=x;
//	next=null;
//}
//}
public class KthElementFromEndTwoRecursion {

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
		int x=countElements(head);
		
		int kfromlast=x-k;
		System.out.println();
		System.out.println(x);
		int count=0;
		while(head!=null)
		{
			count++;
			if(count==kfromlast) {
				System.out.println(head.data);
			}
			head=head.next;
		}
		
		
		

	}
	
	

	private static int countElements(Node head) {
	
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}
		return count;
	
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



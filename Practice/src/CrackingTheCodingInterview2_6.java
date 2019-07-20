/**
 * 
 */
import java.util.*;


/**
 * import
 * @author faraz
 *
 */

public class CrackingTheCodingInterview2_6 {
	static node head=null;
	Stack<Integer> st=new Stack<Integer>();
	class node
	{
		int data;
		node next;
		node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args) {
		CrackingTheCodingInterview2_6 obj=new CrackingTheCodingInterview2_6();
		obj.insert(5);
		obj.insert(6);
		obj.insert(8);
		obj.insert(5);
		obj.insert(8);
		obj.insert(6);
		obj.insert(5);
		
		node slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null)
		if(fast.next!=null && fast.next.next!=null)
		{
			obj.st.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast.next==null)
		{
			slow=slow.next;
		}
		else
		{
			obj.st.push(slow.data);
			slow=slow.next;
		}
		while(slow!=null)
		{
			if(slow.data!=obj.st.pop())
			{
				System.out.println(false);
				System.exit(0);
			}
			slow=slow.next;
		}
		System.out.println(true);
	}
	public void insert(int d)
	{
		node newNode = new node(d);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newNode;
			
		}
			
	}
	public void printList(node h)
	{
		System.out.println();
		node n=h;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n=n.next;
		}
	}

}

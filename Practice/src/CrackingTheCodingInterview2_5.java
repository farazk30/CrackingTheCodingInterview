/**
 * 
 */
import java.util.Stack;
/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview2_5 {

	/**
	 * @param args
	 */
	static node head1=null,head2=null,output=null;
	static Stack<Integer> st1=new Stack<Integer>(); 
	static Stack<Integer> st2=new Stack<Integer>(); 
	public class node
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
		// TODO Auto-generated method stub
		CrackingTheCodingInterview2_5 obj=new CrackingTheCodingInterview2_5();
		obj.insert(5,1);
		obj.insert(5,1);
		obj.insert(8,1);
		obj.insert(5,2);
		obj.insert(1,2);
		obj.insert(9,2);
		obj.insert(9,2);
		obj.printList(head1);
		obj.printList(head2);
		obj.maintainStack();
		obj.addList();
		obj.printList(output);

	}
	public void insert(int data,int flag)
	{
		node n=new node(data);
		//node head;
		if(flag==1)
		{
			//head=head1;
			if(head1==null)
			{
				head1=n;
			}
			else
			{
			node temp=head1;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			}
		}
		else
		{
			//head=head2;
			if(head2==null)
			{
				head2=n;
			}
			else
			{
			node temp=head2;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
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
	public void maintainStack()
	{
		node n=head1;
		while(n!=null)
		{
			st1.push(n.data);
			n=n.next;
		}
		n=head2;
		while(n!=null)
		{
			st2.push(n.data);
			n=n.next;
		}
	}
	public void addList()
	{	int carry=0,temp;
		while(!(st1.empty()||st2.empty()))
		{
			temp=st1.pop()+st2.pop()+carry;
			carry=temp/10;
			temp=temp%10;
			createOutput(temp);
			
		}
		while(!(st1.empty()))
		{
			temp=st1.pop()+carry;
			carry=temp/10;
			temp=temp%10;
			createOutput(temp);
		}
		if(carry!=0)
		{
			createOutput(carry);
			carry=0;
		}
			
			
		while(!(st2.empty()))
		{
			temp=st2.pop()+carry;
			carry=temp/10;
			temp=temp%10;
			createOutput(temp);
			
		}
		if(carry!=0)
		{
			createOutput(carry);
			carry=0;
		}
	}
	public void createOutput(int data)
	{
		node n=new node(data);
		if(output==null)
		{
			output=n;
		}
		else
		{
			n.next=output;
			output=n;
		}
	}
	

}

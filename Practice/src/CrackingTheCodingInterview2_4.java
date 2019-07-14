/**
 * 
 */

/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview2_4 {

	/**
	 * @param args
	 */
	public class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	static node head=null;
	public static void main(String[] args) {
		int pivotelement=5;
		node less=null,more=null,start=null,mstart=null;
		CrackingTheCodingInterview2_4 obj=new CrackingTheCodingInterview2_4();
		obj.insert(5);
		obj.insert(5);
		obj.insert(8);
		obj.insert(5);
		obj.insert(10);
		obj.insert(9);
		obj.insert(8);
		obj.printList(head);
		node n=head;
		while(n!=null)
		{
			if(n.data<pivotelement)
			{
				
				if(less==null)
				{					
					
					less=n;	
					start=less;
					
				}
				else
				{
					less.next=n;
					less=less.next;
				}
					
				
			}
			else
			{
				if(more==null)
				{
					
					more=n;
					mstart=more;
				}
				else{
					more.next=n;
					more=more.next;
					
				}
			}
			n=n.next;
				
		}
		
		if(more!=null&&less!=null)
		{
			more.next=null;
			less.next=mstart;
		}
		
		if(less==null)
		start=mstart;
		
		obj.printList(start);
		
		

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

/**
 * 
 */

/**
 * @author faraz
 *prob- finding the dup in linkedlist
 */
public class LinkListImplementation {

	/**
	 * @param args
	 */
	 node head=null;
	public static void main(String[] args) {
		
		LinkListImplementation Lobj=new LinkListImplementation();
		Lobj.printList(Lobj.head);
		Lobj.insert(5);
		Lobj.printList(Lobj.head);
		Lobj.insert(8);
		Lobj.printList(Lobj.head);
		Lobj.insert(7);
		Lobj.printList(Lobj.head);
		Lobj.insert(1);
		Lobj.printList(Lobj.head);
		Lobj.delete(5);
		Lobj.printList(Lobj.head);
		Lobj.insert(5);
		Lobj.printList(Lobj.head);
	}
	public void insert(int d)
	{
		node obj=new node(d);
		if(head==null)
		{
			head=obj;
		}
		
		else
		{
			node n=head;
			while(n.nodeObj!=null)
			{
				n=n.nodeObj;
			}
			n.nodeObj=obj;
		}
	}
	public void printList(node h)
	{
		if(h!=null)
			
		{
			node n=h;		
			while(n!=null)
			{
				System.out.print("data : "+ n.data+"->");
				n=n.nodeObj;
			}
			System.out.println();
		}
	}
	public void delete(int d)
	{
		if(head!=null)
		{
			node cursor,previous = null;
			if(head.data==d)
			{
				head=head.nodeObj;
				System.out.println("data deleted successfully.");
				return;
			}
			else
			{
				cursor=head.nodeObj;
				previous=head;
			}
			
			while(cursor!=null)
			{
				if(cursor.data==d)
				{
					previous.nodeObj=cursor.nodeObj;
					System.out.println("data deleted successfully.");
					return;
				}
				previous=cursor;
				cursor=cursor.nodeObj;
			}
		}
		System.out.println("data not found");
	}

}
 class node
{
  int data;
  node nodeObj;
  node(int d)
  {
	  data=d;
	  nodeObj=null;
  }
}
/**
 * 
 */

/**
 * @author faraz
 *removing the middle element
 */
public class CrackingTheCodingInterview2_3 {

	
	static node head=null;
		public static void main(String[] args) {
			
			CrackingTheCodingInterview2_3 Lobj=new CrackingTheCodingInterview2_3();
			
			Lobj.insert(5);
			Lobj.insert(8);
			Lobj.insert(7);
			Lobj.insert(1);
			Lobj.insert(6);
			Lobj.insert(0);
			//Lobj.insert(6);
			Lobj.printList(head);
			node slow=head,fast=head.nodeObj,previous=null;
			while(fast!=null)
			{
				previous=slow;
				slow=slow.nodeObj;
				fast=fast.nodeObj;
				if(fast!=null)
					fast=fast.nodeObj;
			}
			previous.nodeObj=slow.nodeObj;
			Lobj.printList(head);
			
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

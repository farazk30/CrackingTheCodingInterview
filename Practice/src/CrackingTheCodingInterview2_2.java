import java.util.*;

/**
 * 
 */

/**
 * @author faraz
 *finding the the kth element from the opposite of the list.
 */
public class CrackingTheCodingInterview2_2 {

	 static node head=null;
		public static void main(String[] args) {
			
			CrackingTheCodingInterview2_2 Lobj=new CrackingTheCodingInterview2_2();
			int k=2;
			Lobj.insert(5);
			Lobj.insert(8);
			Lobj.insert(7);
			Lobj.insert(1);			
			Lobj.insert(5);
			node current =head;
			node mainpointer=null;
			int i=0;
			while(current!=null)
			{	
				i++;
				if(i==k)
				{
					mainpointer=head;
				}
				else if(i>k)
					mainpointer=mainpointer.nodeObj;
				
				current=current.nodeObj;
			}
			System.out.println(mainpointer.data + " is requires answer");
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
/*class node
{
  int data;
  node nodeObj;
  node(int d)
  {
	  data=d;
	  nodeObj=null;
  }
}*/

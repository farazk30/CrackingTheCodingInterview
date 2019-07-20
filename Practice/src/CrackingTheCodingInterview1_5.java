
/**
 * @author faraz
 *
 */
import java.util.Scanner;

public class CrackingTheCodingInterview1_5 {

		public static void main(String[] args)
		{
			System.out.println("enter strings");
			String a,b;
			Scanner sc=new Scanner(System.in);
			a=sc.nextLine();
			b=sc.nextLine();
			
			if(a.equals(b)||CheckMethod(a,b))
			{
				System.out.println(true);
			}
			else
				System.out.println(false);
		}
		 private static boolean CheckMethod(String a,String b) {
			 int index1=0,index2=0,flag=0;
			 String s1=a,s2=b;
			if(a.length()>b.length())
				{
				if(a.length()-b.length()==1)
				{
					s1=a;
					s2=b;
				}
				else return false;
				
				}
			else 
				{
				if(a.length()-b.length()==-1)
				{
					s1=b;
					s2=a;
				}
				
				}
			while(index1<s1.length()&&index2<s2.length())
			{
				if(s1.charAt(index1)!=s2.charAt(index2))
				{
					if(s1.length()==s2.length())
					{
						if(flag==0)
						{
							index1++;
							index2++;
							flag=1;
							continue;
						}
						else return false;
						
						
					}
					
					if(index1==index2)
					index1++;
					else
						return false;
				}
				else
				{
					index1++;
					index2++;
				}
			}
			return true;
		}
		
}

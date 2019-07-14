
/**
 * @author faraz
 *
 */
import java.lang.*;
import java.util.*;
public class CrackingTheCodingInterview1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		int flag=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				continue;
			if(ch[i]==ch[i+1])
				i++;
			else
			{
				if(flag==0)
				flag=1;
				else 
				{
					System.out.println("False");
					System.exit(0);
				}
					
				
			}
				
		}
		System.out.println("True");
		
	}

}

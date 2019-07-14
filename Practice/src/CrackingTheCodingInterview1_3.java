
/**
 * @author faraz
 *
 */
import java.util.*;
public class CrackingTheCodingInterview1_3 {
	public static void main(String[] args)
	{
		char[] ch=new char[20];
		Scanner sc =new Scanner(System.in);
		int length,count=0;
		
		
		String as=sc.nextLine();
		System.out.println("enter the length of your string");
		length=sc.nextInt();
		for(int i=0;i<length;i++)
		{
			ch[i]=as.charAt(i);
			if(ch[i]==' ')
			{
				count++;
			}
		}
		int k=length+(2*count)-1;
		
		for(int i=length-1;i>=0;i--,k--)
		{
			if(ch[i]==' ')
			{
				ch[k]='0';
				k--;
				ch[k]='2';
				k--;
				ch[k]='%';
				
			}
			else
				ch[k]=ch[i];
		}
			System.out.print(ch);
	}
}

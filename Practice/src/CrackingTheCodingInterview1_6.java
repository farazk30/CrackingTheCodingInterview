
/**
 * @author faraz
 *
 */
import java.util.*;
public class CrackingTheCodingInterview1_6 {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		StringBuilder strCompress=new StringBuilder();
		int count=0,index=0;
		Scanner sc=new Scanner(System.in);
		str.append(sc.nextLine());		
		
		char pr='\0';
		for(char c: str.toString().toCharArray())
		{
			if(pr=='\0')
			{
				pr=c;
				count++;
			}
			else
			{
				if(pr==c)
				{
					count++;
				}
				else
				{
					strCompress.append(pr);
					strCompress.append(count);
					count=1;
					pr=c;
				}
			}
			index++;
			if(index==str.length())
			{
				strCompress.append(c);
				strCompress.append(count);
			}
		}
		if(strCompress.length()<str.length())
		System.out.println(strCompress.toString());
		else
			System.out.println(str.toString());
	}

}


/**
 * @author faraz
 *
 */
import java.util.Arrays;

public class CrackingTheCodingInterview1_2 {

	static String s1="faraaz",s2="arffaz";
	public static void main(String []args)
	{
			char[] a1=s1.toCharArray();	
			Arrays.sort(a1);
			String s1out=new String(a1);
			char[] a2=s2.toCharArray();	
			Arrays.sort(a2);
			String s2out=new String(a2);
			if(s1out.equalsIgnoreCase(s2out))
				System.out.println("yes");
			else
				System.out.print("no");
			
			
		
	}
}

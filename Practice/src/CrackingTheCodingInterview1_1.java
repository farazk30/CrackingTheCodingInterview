
/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview1_1 {
	static boolean[] b=new boolean[128];
	
	static String s="faraaz";
	public static void main(String []args)
	{
		for(int i=0;i<128;i++)
		{	
			b[i]=false;	
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(b[s.charAt(i)]==false)
			{
				b[s.charAt(i)]=true;
			}
			else
			{
				System.out.println("not unique");
				break;
			}
		}
		
	}
}

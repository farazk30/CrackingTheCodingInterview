import java.util.Scanner;

/**
 * 
 */

/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview1_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		String s=sc.nextLine();
		String r=sc.nextLine();
		if((r+r).contains(s))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}

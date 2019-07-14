/**
 * 
 */
import java.util.*;
/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> dataList=new LinkedList<String>();
		dataList.add("faraz");
		dataList.add("sharukh");
		dataList.add("salman");
		dataList.add("adnan");
		dataList.add("faraz");
		Set<String> h = new HashSet<String>();
		for(String s : dataList)
		{
			if(h.add(s))
			{
				continue;
			}
			else
			{
				dataList.remove(s);
			}
		}
//		follow up without using buffer memory-> need two loops to iterate for every value in linked list with complexity 0(n^2)
		 
		
		for(String s: dataList)
		{
			System.out.println(s);
		}
	}

}

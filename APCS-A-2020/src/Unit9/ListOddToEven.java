package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carolyn Cui 
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int lastEven = 0;
		int firstOdd = 0;
		int oddIndex = 0;
		boolean evenExists = false;
		
		for (int i = 0; i <= ray.size()-1; i++) {
			if (ray.get(i)%2 == 1) {
				firstOdd = ray.get(i);
				oddIndex = i;
				break;
			}
		}
				
		if (firstOdd != 0) {
			for (int j = oddIndex; j <= ray.size()-1; j++) {
				if (ray.get(j)%2 == 0) {
					lastEven = ray.get(j);
					evenExists = true;
					break;
				}
			}
			System.out.println(ray.indexOf(lastEven));
		}
		
		System.out.println(lastEven);
		System.out.println(firstOdd);
		
		if (evenExists != false) {
			return Math.abs(ray.indexOf(firstOdd) - ray.indexOf(lastEven));
		}		
		
		return -1;
	}
}
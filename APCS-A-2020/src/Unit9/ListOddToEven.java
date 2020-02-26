//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstEven = 0;
		for (int i = 0; i < ray.size()-1; i++) {
			if (ray.get(i)%2 == 1) {
				for (int j = i; j < ray.size()-1; j++) {
					if (ray.get(j)%2 == 0) {
						firstEven = ray.get(j);
					}
				}
			}
		}
		
		return -1;
	}
}
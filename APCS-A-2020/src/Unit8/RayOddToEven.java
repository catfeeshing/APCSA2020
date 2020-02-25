package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstEven =0;
		int firstOdd = 0;
		boolean evenFound = false;
		boolean oddFound = false;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 == 1) {
				firstOdd = i;
				oddFound = true;
				break;
			}
		}
		for (int i = firstOdd; i < ray.length; i++) {
			if (ray[i] % 2 == 0) {
				firstEven = i;
				evenFound = true;
				break;
			}
		}
		
		if (evenFound && oddFound) {
			//return Math.abs(firstEven - firstOdd);
			return Math.abs(firstEven - firstOdd); //??
		}
		return -1; //? nvm ignore ?
	}
}
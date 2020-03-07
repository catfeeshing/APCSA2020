package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		String oldestName = "";
		int oldestAge = 0;
		for(Dog doggo : pups) {
			if (doggo.getAge() > oldestAge) {
				oldestName = doggo.getName();
				oldestAge = doggo.getAge();
			}
		}
		return oldestName;
	}

	public String getNameOfYoungest()
	{
		String youngestName = "";
		int a = pups[0].getAge();
		for(Dog doggo : pups) {
			if (doggo.getAge() > a) {
				youngestName = doggo.getName();
				a = doggo.getAge();
				}
			}
		return youngestName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
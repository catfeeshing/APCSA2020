package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore22
{
	private ArrayList<Toy> toyList;

	public ToyStore22()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for (String toy : toys.split(" ")) {
			Toy toyA = getThatToy(toy);
			if (toyA == null) {
				toyList.add(new Toy(toy));
			}
			else {
				toyA.setCount(toyA.getCount()+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy : toyList) {
  			if (toy.getName().equals(nm)) {
  				return toy;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String nameMax = "";
  		int intMax = 0;
  		for (Toy toy : toyList) {
  			if (toy.getCount() > intMax) {
  				nameMax = toy.getName();
  				intMax = toy.getCount();
  			}
  		}
  		return nameMax;
  	}  
  
  	public void sortToysByCount()
  	{
  		int size = toyList.size();
  		ArrayList<Toy> newToyBox = new ArrayList<Toy>();
  		
  		for (int i = 0; i < size; i++) {
  			Toy toy = getThatToy(getMostFrequentToy());
  			newToyBox.add(toy);
  			toyList.remove(toy);
  		}
  		toyList = newToyBox;
  	}  
  	  
	public String toString()
	{
	   return toyList + ""
	   		+ "nmax == " + getMostFrequentToy();
	}
	
	public void myName(){
		System.out.println("Carolyn Cui");
		}
}
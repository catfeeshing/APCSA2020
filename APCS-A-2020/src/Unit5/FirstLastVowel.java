package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carolyn Cui
//Date - 2/10/20


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String firstLetter = (a.substring(0,1));
	   String lastLetter = (a.substring(a.length() - 1));
	   
	   String first = firstLetter.toLowerCase();
	   String last = lastLetter.toLowerCase();
	   
	   // this was for testing what was being compared
	   // System.out.println("\n\n" + firstLetter);
	   // System.out.println(lastLetter + "\n\n");
	   
	   if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
		   return "yes";
	   }
	   else if (last.equals("a") || last.equals("e") || last.equals("i") || last.equals("o") || last.equals("u")) {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}
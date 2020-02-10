package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carolyn Cui
//Date - 2/10/20


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String firstLetter = a.toLowerCase(a.substring(0));
	   String lastLetter = a.toLowerCase(a.substring(a.length() - 1));
	   
	   if ((firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u")) || (lastLetter.equals("a") || lastLetter.equals("e") || lastLetter.equals("i") || lastLetter.equals("o") || lastLetter.equals("u"))) {
		   return "yes";
	   }
	   return "no";
	}
}

//(a.charAt(0) "a" || "e" || "i" || "o" || "u")
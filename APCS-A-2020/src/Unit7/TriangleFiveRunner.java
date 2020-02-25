package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive triangle = new TriangleFive('C', 4);
	   System.out.println(triangle);
	   
	   triangle.setVals('A', 5);
	   System.out.println(triangle + "\n\n");
	   
	   triangle.setVals('B', 5);
	   System.out.println(triangle + "\n\n");
	   
	   triangle.setVals('X', 5);
	   System.out.println(triangle + "\n\n");
	   
	   triangle.setVals('Z', 5);
	   System.out.println(triangle + "\n\n");
   }
}
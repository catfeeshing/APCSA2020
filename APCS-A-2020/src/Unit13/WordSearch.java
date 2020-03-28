package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

// already started on wordsearch until i heard that we didn't need to complete it? :(

public class WordSearch
{
    private String[][] m;
    private int size;

    public WordSearch(int size, String str)
    {
    	m = new String[size][size];
    	this.size = size;
    	int x = 0;
    	for(int i = 0; i < size; i++) {
    		for(int j = 0; j < size; j++) {
    			m[i][j] = str.substring(x, x + 1);
    			x++;
    		}
    	}//e
    }

    public boolean isFound( String word )
    {
    	boolean found = false;
    	for(int i = 0; i < size; i++) {
    		if(checkRight(word,i,size) || checkLeft(word,i,size) || checkUp(word,size,i) || checkDown(word,size,i)) {
    			found = true;
    		}
    	}
    	if(checkDiagUpRight(word,size,size) || checkDiagDownRight(word,size,size) || 
    				checkDiagUpLeft(word,size,size) || checkDiagDownLeft(word,size,size))
    		found = true;
    	return found;
    }

	public boolean checkRight(String w, int r, int c)
    {
		String x = "";
		for(int i = 0; i < c; i++) {
			x = x + m[r][i];
		}
		//System.out.println(x);
		if(x.contains(w))
			return true;
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String x = "";
		String word = "";
		for(int i = 0; i < c; i++) {
			x = x + m[r][i];
		}
		for(int i = w.length()-1; i >= 0; i--) {
			word = word + w.substring(i, i+1);
		}
		if(x.contains(word))
			return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String x = "";
		for(int i = r-1; i >= 0; i--) {
			x = x + m[i][c];
		}
		//Sy
		if(x.contains(w))
			return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String x = "";
		for(int i=0; i<r; i++) {
			x = x + m[i][c];
		}
		
		if(x.contains(w))
			return true;
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{

	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{

	}

	public boolean checkDiagDownLeft(String w, int r, int c)
    {

	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{


    public String toString()
    {
    	return "";
    }
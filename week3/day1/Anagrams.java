package week3.day1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "toys";
		boolean checkanagram = false;
		boolean isAnagram = false;
		if(text1.length()==text2.length())
		{
			checkanagram = true;
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		if(checkanagram)
		{
	    char[] text1char = text1.toCharArray();
	    char[] text2char = text2.toCharArray();
	    Arrays.sort(text1char);
	    Arrays.sort(text2char);
	    int i,j;
	    for(i=0;i<text1char.length;i++)
	    {
	    	for(j=0;j<text2char.length;j++)
	    	{
	    		if(text1char[i]==text2char[j])
	    		{
	    			isAnagram = true;
	    		}
	    		else
	    		{
	    			isAnagram = false;
	    		}
	    	}
	    }
	    if(isAnagram)
	    {
	    	System.out.println("The given strings are Anagram");
	    }
	    else
	    {
	    	System.out.println("The given strings are not an Anagram");
	    }
		}
	    
	   
	}

}

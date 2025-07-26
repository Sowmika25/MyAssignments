package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Googleset {

	public static void main(String[] args) {
		
		String companyName ="google";
		char [] charArray = companyName.toCharArray();
		int i;
		Set<Character>unique = new LinkedHashSet<Character>();
		for(i=0;i<charArray.length;i++) {
			unique.add(charArray[i]);
		}
		System.out.println(unique);
		
	}
	

}

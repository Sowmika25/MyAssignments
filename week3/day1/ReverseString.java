package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String rev="";
		String companyName ="Testleaf";
		char[ ]a = companyName.toCharArray();
		int i;
		for(i=a.length-1;i>=0;i--)
		{
		    rev+=a[i];
		    
		}
		System.out.println(rev);
		}
}

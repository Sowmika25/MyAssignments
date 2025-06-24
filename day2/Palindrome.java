package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n=121,n1=n,rev=0,n2;
		while(n>0)
		{
			n2=n%10;
			rev=rev*10+n2;
			n=n/10;
		}
		if(n1==rev)
		{
		 System.out.println("The given number is palindrome");
		}
		else
		{
		  System.out.println("The given number is not palindrome");
		}
	}

}



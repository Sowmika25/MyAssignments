package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=8;
		int a=0 , b=1;
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println(a + " ");
			
			int c=a+b;
			a=b;
			b=c;
		}
		
	}

}

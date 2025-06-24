package week1.day2;

public class IsPrimeNumber {
	
    public static void main(String[] args) {
		int n=13;
		int i=2;
		boolean isPrime = true;
		while(i<n)
		{
			if(n%i==0)
				isPrime = false;
			i++;
		}
		if(isPrime)
			System.out.println("The given number is prime number");
		else
			System.out.println("The given number is not a prime number");
		
	}

}

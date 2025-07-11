package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,2,8,6,7};
		Arrays.sort(a);
		int max , sum=0,i,miselmt;
		int len = a.length;
		max=a[len-1];
		for(i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		miselmt =(max*(max+1)/2)-sum;
		System.out.println(miselmt);
		
	}

}

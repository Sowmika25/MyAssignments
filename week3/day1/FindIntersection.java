package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		int i,j;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=b.length-1;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}

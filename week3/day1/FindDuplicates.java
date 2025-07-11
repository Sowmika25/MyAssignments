package week3.day1;

public class FindDuplicates {

	public static void main(String[] args) {
		int[]num = {2,5,7,7,5,9,2,3};
		int i,j;
		for(i=0;i<num.length;i++) {
			for(j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
				else {
					continue;
				}
					
					
			}
		}

	}

}

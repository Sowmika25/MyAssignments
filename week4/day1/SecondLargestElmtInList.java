package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestElmtInList {

	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		List<Integer>l = new ArrayList<Integer>();
		Arrays.sort(arr);
		int i;
		for(i=0;i<arr.length;i++) {
			l.add(arr[i]);
		}
		int size = l.size();
		int sle = l.get(size-2);
		System.out.println(sle);
	}

}

package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElmtInList {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,10,6,8};
		List<Integer>l = new ArrayList<Integer>();
		Arrays.sort(arr);
		int i;
		for(i=0;i<arr.length;i++) {
			l.add(arr[i]);
		}
		int size=l.size();
		for(i=0;i<size-1;i++) {
			if(l.get(i)+1==l.get(i+1))
			{
				continue;
			}
			else
			{
				System.out.print(l.get(i)+1+"\t");
			}
		}

	}

}

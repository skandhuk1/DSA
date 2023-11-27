package cacheProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
	
//		List<Integer> myList = Arrays.asList(2,4,12,54,4,54);
//		for(int i=0; i < myList.size();i++) {
//			for (int j=i+1; j< myList.size() ; j++)
//				if(myList.get(i).equals(myList.get(j)))
//						System.out.println("number matching" + myList.get(j));
//			}
		
		List<Integer> myList = Arrays.asList(2,3,12,54,4,54);
		Set<Integer> set = new HashSet<>();
		for(Integer item: myList) {
			if(!set.add(item)) {
				System.out.println("Duplicate element " + item);
			}
		}
		
		int a = 10;
		System.out.println(a*a--);
		}

}	

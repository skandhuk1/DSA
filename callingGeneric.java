package cacheProject;

import java.util.ArrayList;
import java.util.List;

public class callingGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int i;
        myGeneric<Integer> intCounter = new myGeneric<>(3);
        intCounter.print();
        
        ArrayList<Object> myList = new ArrayList<>();
        myList.add(12);
        myList.add("srini");
        
        Integer i = (Integer)myList.get(0);
        String sk = (String) myList.get(1);
        System.out.println(i);
        System.out.println(sk);
        
        
       
	}

}

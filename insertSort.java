package cacheProject;

public class insertSort {

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int firstunsortedIndex = 1; firstunsortedIndex <intArray.length; firstunsortedIndex++) {
			int newElement = intArray[firstunsortedIndex];
			
		 
        int i ;
        for (i = firstunsortedIndex; i> 0 && intArray [i-1] > newElement; i-- ) {
        	intArray[i] = intArray[i-1];
        }
            intArray[i] = newElement;
		}
		
		for (int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}

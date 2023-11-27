package cacheProject;

public class recursion {

	public static void main(String[] args) {
		int j = recursion(5);
		System.out.println(j);
		int k = iterativeFactorial(5);
		System.out.println(k);
	}
	private static int recursion(int num) {
		if(num == 0) {return 1;}
		
		return num *recursion(num-1);
	}

   private static int iterativeFactorial(int num) {
	   if(num == 0) { return 1;}
	   int factorial = 1;
	   for(int i= 1; i<=num; i++) {
		   factorial = factorial * i;
	   }
	   return factorial;
   }
}

import java.util.*;

public class MyRegex {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        int[] a = new int[n];;
         for (int j = 0; j < myArray.length; j++){
            Scanner sc = new Scanner(System.in); 
            a[j] = sc.nextInt();
            sc.close();          
         }        
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

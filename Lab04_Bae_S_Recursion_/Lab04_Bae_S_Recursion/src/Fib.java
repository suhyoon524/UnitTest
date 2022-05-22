
// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
    	if (n == 0) {
    		return 0;
    	} 
    	else if (n == 1) {
        	return 1;
    	} 
    	else if (n >1) {
        	return fib1(n-1) + fib1(n-2);
    	} 
    	else if (n < 0) {
        	System.out.println("Please enter a postive number");
      	} 
    	return 1;
	//Fill in code -- this should look very much like the
	//mathematical specification
    }
    
    public static int fib2(int n)
    {
    	int[] array = new int[n+1];
        int i;
        
    	if (n==0) {
    		array[0] = 0;
		} 
    	if (n == 1) {
	    	array[1] = 1;
		} 
    	else if (n > 1) {   
	    	array[0] = 0;
	    	array[1] = 1;
		 	
			for (i = 2; i<array.length; i++) 
	         {
	        	 array[i] = array[i-1] + array[i-2];
	         } 
        }
    	else if (n <0 ) {
    		System.out.println("Plese enter a positive number");
    	}
        return array[n];

    }
}
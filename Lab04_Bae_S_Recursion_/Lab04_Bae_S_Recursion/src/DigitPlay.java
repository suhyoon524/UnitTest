import java.util.Scanner;

// *******************************************************************
//   DigitPlay.java
// 
//   Finds the number of digits in a positive integer.
// *******************************************************************

public class DigitPlay
{

    public static void main (String[] args)
    {
    Scanner conIn = new Scanner(System.in);
    	
	int num;    //a number  

	System.out.println ();
	System.out.print ("Please enter a positive integer: ");

    if (conIn.hasNextInt())
      num = conIn.nextInt();
    else
    {
      System.out.println("Error: you must enter an integer.");
      System.out.println("Terminating program.");
      return;
    }
    System.out.println();
    
    if (num <=0)
    	System.out.println("Error: It is not positive integer."
    			+ " Enter positive integer.");
    else
    { 
    	if (sumDigits(num)%7==0)
    		System.out.println(num+"---ok");
    	else
    		System.out.println(num+"---error");
    }
	
	if (num <= 0)
	    System.out.println ( num + " isn't positive -- start over!!");
	else 
	    {
		// Call numDigits to find the number of digits in the number
		// Print the number returned from numDigits
		System.out.println ("\nThe number " + num + " contains " 
				+ numDigits(num) + " digits.");
		System.out.println ();
		System.out.println("\nThe sum "+ num + " contains "
				+ sumDigits(num) + " digits.");
	    }
    }

    // -----------------------------------------------------------
    //  Recursively counts the digits in a positive integer 
    // -----------------------------------------------------------
    public static int numDigits(int num)
    {
	if (num < 10)
	    return (1);
	else
	    return (1 + numDigits(num/10));
    }
       
    public static int sumDigits(int num)
    {
    	int sum = 0;
		if (num<10)
    		return (1);
    	else 
    		return (sum + (num % 10) + sumDigits(num/10));
    }
}




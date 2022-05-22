
// ******************************************************************
//   TestFib.java
//
//   A simple driver that uses the Fib class to compute the
//   nth element of the Fibonacci sequence.
// ******************************************************************
import java.util.*;
import java.util.Scanner;

public class TestFib
{
    public static void main(String[] args)
    {
	int n, fib;
	 Scanner conIn = new Scanner(System.in);
	 
	System.out.println ();
	System.out.print ("Please enter a positive integer: ");

	Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
	
    fib = Fib.fib1(n);
    System.out.println("In fib1("+ n +") is " + fib);
    fib = Fib.fib2(n);
    System.out.println("In fib2(" + n +") is " + fib);
    
    if (conIn.hasNextInt())
      n = conIn.nextInt();
    else
    {
      System.out.println("Error: you must enter an integer.");
      System.out.println("Terminating program.");
      return;
    }
    System.out.println();

	fib = Fib.fib1(n);
	System.out.println("Fib(" + n + ") is " + fib);

    }
}

//To see this, add a print statement at the beginning 
//of your fib1 method that indicates what call is being 
//computed, e.g., "In fib1(3)" if the parameter is 3. 


       

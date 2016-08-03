
public class PreIncrement {
	
	public static void main (String [] args ) {
		/****int[] score = {7, 8, 9, 10, 11};
		int x = ++score[2]; // Pre-increment operation
		System.out.println(x);
		score[4]++; // Post-increment operation
System.out.println(score); ****/
		
	/*****	int[] numbers = {3, 6, 9};
		for(int val : numbers)
		{
			System.out.println("The next value is " +
		                     val);
		} ***/
		/***int[] array1 = { 2, 4, 6, 8, 10 };
		int[] array2 = array1; // This does not copy array1
		
		System.out.println(array1);
		System.out.println(array2);***/
		
		int[] numbers = {10, 20, 30, 40, 50};

		printWriter outputFile = 
		     new printWriter ("Values.txt");

		for (int i = 0; i < numbers.length; i++)
		  outputFile.println(numbers[i]);

		outputFile.close();


	}

}

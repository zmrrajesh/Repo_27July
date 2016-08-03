package bankreocrds;

import java.util.Scanner;

public class Array {

	 public static void main(String[] args) {
		 Scanner keyboard= new Scanner(System.in);
		 System.out.println("Enter first array:");
		 int Array[] = new int[3];
		 Array[0] = keyboard.nextInt();
		 System.out.println("Enter second element");
		 Array[1] = keyboard.nextInt();
		 System.out.println("Enter third element");
		 Array[2] = keyboard.nextInt();
		  System.out.println("Print Array elements");
		 for(int Val : Array) {
		 System.out.println(Val);
		 break;
		// for(int i=0; i<Array.length; i++)
		//	 System.out.println(Array[i]);
		 
		 }
		 
	 }
}

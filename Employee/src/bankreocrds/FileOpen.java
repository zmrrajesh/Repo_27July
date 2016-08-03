package bankreocrds;
import java.util.Scanner;



public class FileOpen {
	public static void main(String[] args) {

	final int SIZE = 5;
	int[] numbers = new int[SIZE];
	int index = 0;
	File file = new File("Values.txt");
	Scanner inputFile = new Scanner(file);
	while (inputFile.hasNext() && index < numbers.length)
	{
		numbers[index] = inputFile.nextInt();
		index++;
	 }
	
   }
}	

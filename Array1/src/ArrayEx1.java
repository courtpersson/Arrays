

import java.util.Scanner;

public class ArrayEx1 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] miles = new int[5];
		
		for (int i=0; i< miles.length; i++)
		{
			System.out.printf("Miles run on day %d: ", i+1);
			miles[i] = input.nextInt(); 
		}
		
		printArray(miles);
		
		int total = 0;
		for (int i = 0; i<miles.length; i++)
		{
			total += miles[i]; 
		}
		//total from inputs
		System.out.printf("Total of miles run: %d", total); 
	}
	
	//method to print array
	private static void printArray (int [] array)
	
	{
	//array that should be printed
		for (int i= 0; i< array.length; i++)
		{
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	
}



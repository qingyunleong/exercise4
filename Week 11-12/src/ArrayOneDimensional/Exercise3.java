package ArrayOneDimensional;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		//write a program that create an array of 10 element size
		//your program should promt the users to input number in array
		//display the sum of all array element
		
		final int size = 10;
		int[] numbers = new int[size];
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		for(int i=0; i<size; i++) {
			numbers[i] = in.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(numbers[i]);
		}
		
		int sum = 0;
		for (int i=0; i<size; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("The sum equals to " + sum);

	}

}

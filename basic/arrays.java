package basic;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 5;
		numbers[3] = 7;
		numbers[4] = 9;
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give first indices to swap: ");
		int first = scanner.nextInt();
		
		System.out.println("Give second indices to swap: ");
		int second = scanner.nextInt();
		
		int temp = numbers[first];
		
		numbers[first] = numbers[second];
		numbers[second] = temp;
		
		System.out.println(Arrays.toString(numbers));
		*/
		/*
		int index = 0;
		
		while (index < numbers.length) {
			System.out.println(numbers[index]);
			index = index + 1;
			*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search for? ");
		int input = scanner.nextInt();
		
		int index = -1;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				index = i;
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("number " + input + " is at index " + index);
		} else {
			System.out.println("not in array");
		}
		
		
		}

}

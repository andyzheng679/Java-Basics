package basic;

import java.util.Scanner;

public class reapeating_functionality {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		while (true) {
			System.out.println("Shall we carry on?");
			String input = scanner.nextLine();
			if (input.equals("no")) {
				break;
			}
		}
		*/
		
		/*
		while (true) {
			System.out.println("Give a number, 4 to quit");
			int input_num = Integer.valueOf(scanner.nextLine());
			if (input_num == 4) {
				break;
			}
			System.out.println("you entered: " + input_num);
		}
		System.out.println("Done");
		*/
		
		/*
		while (true) {
			System.out.println("Enter a number");
			int input = Integer.valueOf(scanner.nextLine());
			if (input < 0) {
				System.out.println("Unsuitable Number");
				continue;
			}
			else if (input == 0) {
				break;
			}
			else {
				System.out.println(input * input);
			}

		System.out.println("test");
		}
		*/
		/*
		int num_of_inputs = 0;
		
		while (true) {
			System.out.println("Give a number:");
			int input = Integer.valueOf(scanner.next());
			
			if (input != 0) {
				System.out.println(input);
				num_of_inputs = num_of_inputs + 1;
			}
			else {
				num_of_inputs = num_of_inputs + 1;
				System.out.println("Number of numbers: " + num_of_inputs);
				break;
			}
		}
		*/
		/*
		int negative = 0;
		
		while (true) {
			System.out.println("Give a number:");
			int input = Integer.valueOf(scanner.nextLine());
			
			if (input < 0) {
				System.out.println(input);
				negative = negative + 1;
			}else if (input == 0) {
				System.out.println("Number of negatives: " + negative);
				break;
			}else {
				System.out.println(input);
			}
		}
		*/
		/*
		double number = 0;
		double sum = 0;
		
		while (true) {
			System.out.println("Give a number");
			int input = Integer.valueOf(scanner.nextLine());
			
			if (input == 0) {
				System.out.println("Number of numbers: " + number);
				System.out.println("Sum of numbers: " + sum);
				System.out.println("Avg of numbers: " + sum/number);
				break;
			}else {
				System.out.println(input);
				number = number + 1;
				sum = sum + input;
			}
		}
			*/
		double number = 0;
		double sum = 0;
		
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			 if (input == 0) {
				 System.out.println("avg: " + sum/number);
				 break;
			 }else if (input > 0) {
				 number += 1;
				 sum = sum + input;
			 }
		}
		if (number == 0) {
			System.out.println("Cannot calculate the average");
		}
	}

}

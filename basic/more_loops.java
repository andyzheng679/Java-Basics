package basic;

import java.util.Scanner;

public class more_loops {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		//int input = Integer.valueOf(scanner.nextLine());
		/*
		for (int i = 0; i <= input; i++) {
			System.out.println(i);
		}
		*/
		/*
		int input_num = 0;
		int result = 0;
		
		for (int i = 0; input_num <= input; input_num++) {
			result += input_num;
		}
		System.out.println(result);
		*/
		/*
		System.out.println("enter last number: ");
		int last_num = Integer.valueOf(scanner.nextLine());
		int result = 0;
		
		for (int i = input; i <= last_num; i++) {
			result += i;
		}
		System.out.println(result);
		*/
		/*
		int result = 1;
		for (int i = 1; i <= input; i++) {
			result *= i;
		}
		System.out.println(result);
		*/
		int sum = 0;
		int total_nums = 0;
		double average = 0;
		int pos_num = 0;
		int neg_num = 0;
		
		
		while (true) {
			int number = Integer.valueOf(scanner.nextLine());
			
			if (number == -1) {
				average = (double)sum/total_nums;
				System.out.println("Thx! Bye!");
				System.out.println("Sum: " + sum);
				System.out.println("Numbers: " + total_nums);
				System.out.println("Average: " + average);
				System.out.println("Even: " + pos_num);
				System.out.println("Odd: " + neg_num);
				break;
			}
			else if(number != -1) {
				sum += number;
				total_nums += 1;
				
				if (number % 2 == 0) {
					pos_num += 1;
				}else {
					neg_num += 1;
				}
			}
		}

	}

}

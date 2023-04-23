package basic;

import java.util.Scanner;

public class calc_w_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 7;
		System.out.println(first);
		int second = 13;
		System.out.println(second);
		
		int sum = first + second;
		System.out.println(sum);
		
		int calc_w_parentheses = (1 + 1) + 3 * (2 + 7);
		System.out.println(calc_w_parentheses);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give number of days ");
		int num_days = Integer.valueOf(scanner.nextLine());
		System.out.println(num_days * 86400);
		
		System.out.println("Give the first number: ");
		int first_num = Integer.valueOf(scanner.nextLine());
		System.out.println("Give second number: ");
		int second_num = Integer.valueOf(scanner.nextLine());
		
		//System.out.println(first_num +" + "+ second_num +" = " +(first_num + second_num));
		System.out.println("The average is " + (1.0 * first_num + second_num)/2);
		
		//int dividend = 3;
		//int divisor = 2;

		//double result = 1.0 * dividend / divisor;
		//System.out.println(result);
		//The reason for multiplying 1.0 by dividend before dividing by divisor is to 
		//force the division operation to be performed using floating-point arithmetic, 
		//rather than integer arithmetic. Without the 1.0 * part, 
		//the expression dividend / divisor would be performed using integer division, 
		//which truncates the result to an integer value. For example, 3 / 2 would result in 1, instead of 1.5.
		
		
	}

}

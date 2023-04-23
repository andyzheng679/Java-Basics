package basic;
import java.util.Scanner;

public class reading_input {

	public static void main(String[] args) {
		// input is always read as a string
		Scanner scanner = new Scanner(System.in); //create tool for reading user input and name it scanner
		
		System.out.println("Write a message: "); //prints "Write a message"
		
		String message = scanner.nextLine(); // reads the string input and assigns it to message
		
		System.out.println(message); // prints out what was assigned to message
		
		String name = "Andy Zheng";
		
		System.out.println("Hi, " + name); //combining strings together
		
		/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = scanner.nextLine();
        System.out.println("Write the second string:");
        String second = scanner.nextLine();
        System.out.println("Write the third string:");
        String third = scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);	
		 */
		

	}

}

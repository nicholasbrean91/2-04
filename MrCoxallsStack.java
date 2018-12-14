//Created By: Nicholas Brean
//Created on: Dec 14
//Created to add number remove and clear from stack


import java.util.ArrayList;
import java.util.Scanner;

public class MrCoxallsStack {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		do {
			
			System.out.println("Enter an Integer that can put on the stack or enter a command to run the function .");
			System.out.println("Note: -1 is pop, -2 is peek(return the top number), -3 is clear all the numbers in the array list. Positive numbers still numbers");
			
			Scanner scanner = new Scanner(System.in);
			
			if(scanner.hasNextInt()) {
				int user = scanner.nextInt();
				
				// Push the number on the array
				if(user == -1) {
					stack.pop(1);
				}
				else if(user == -2) {
					stack.peek();
				}
				else if(user == -3) {
					stack.clear();
				}
				else if (user >= 0) {
					stack.push(user);
				}
				
				stack.print();
				
			}else{
				System.out.println("Invalid Input! Please input some integers! ");
			}
			
		}while(true);
		
	}
	
}

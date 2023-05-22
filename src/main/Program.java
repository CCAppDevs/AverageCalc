package main;

import java.util.Scanner;

public class Program {

	public static int maxNumber = 10;
	public static double[] temps = new double[maxNumber];
	public static int count = 0;
	
	
	public static void main(String[] args) {
		// The app needs to be able to clear those temperatures and start again
		// TODO how to clear an array
		
		Scanner scan = new Scanner(System.in);
		boolean isRunning = true;

		
		while (isRunning) {
			double input = -1;
			
			PrintMenu();
			
			System.out.print("What would you like to do? ");
			input = scan.nextDouble();
			
			if (input == 1) {
				if (count >= maxNumber) {
					System.out.println("The array is full, please empty it to continue.");
				} else {
					System.out.println("Adding a temperature.");
					System.out.print("What temperature do you want to add? ");
					AddTemp(scan.nextDouble());
				}
			} else if (input == 2) {
				PrintAverage();
			} else if (input == 0) {
				System.out.println("Thanks for using the app.");
				isRunning = false;
			} else {
				System.out.println("Invalid choice, please try again!");
			}
			
			
		}

	}
	
	public static void AddTemp(double temp) {
		temps[count] = temp;
		count++;
	}
	
	public static void PrintMenu() {
		System.out.println("---- Main Menu ----");
		System.out.println("1. Add Temperature");
		System.out.println("2. Get Average");
		System.out.println("0. Exit");
	}
	
	public static void PrintAverage() {
		System.out.println("Getting the average temperature.");
		System.out.println("The average temp is: " + AverageArray());
	}
	
	public static double AverageArray() {
		double result = 0;
		
		for (int i = 0; i < count; i++) {
			result = result + temps[i];
		}
		
		return result / count;
	}
	
}

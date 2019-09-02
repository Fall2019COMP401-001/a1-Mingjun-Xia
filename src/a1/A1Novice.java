package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customerCount = scan.nextInt();
		//Read number of customers
		for (int a = 0; a < customerCount; a++) {
		//Loop through the data of each customer
		String first = scan.next();
		//Read string value, i.e., first name of the customer
		char[] firstArray = first.toCharArray();
		//turn string into character array
		char f = firstArray[0];
		/* Read the first character in the array,
		 * i.e., the first initial of the customer
		 */
		String last = scan.next();
		//Read string value, i.e., last name of the customer
		int number = scan.nextInt();
		//Read the number of items bought
		double[] addCost = new double [number];
		//Declare an array of double to store cost of each item
		for (int i = 0; i < number; i++) {
		//Loop through the cost of each item
			int count = scan.nextInt();
			//Reading the number of one item
			String dntmatter = scan.next();
			/*This value, i.e. the item name not used
			 * This line is just used to meet the expected argument type
			 */
			double price = scan.nextDouble();
			//Reading the price of that item
			double singleCost = count * price;
			//Calculating the total cost spent on that item
			addCost[i] = singleCost;
			//Store the cost into the array
		}
		double totalCost = 0.0;
		//Declare a variable to store the value of total cost
		for (int i = 0; i < addCost.length; i++) {
			totalCost = totalCost + addCost[i];
		//Add the cost of each item into the total cost
		}
		// Print results
		System.out.println(f + last + totalCost);
		}
		scan.close();
		//All inputs attained, close scanner
	}
}

//Importing the packages used in this code
import java.util.*;

//The class
public class NetPay {

	public static void main(String[] args) {
		
		//Getting user input
		System.out.println("Please enter your total hours worked this week.");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		while (userInput < 0) {
			System.out.println("Please enter a positive interger.");
			userInput = sc.nextInt();
		}
		
		
		//Creating fixed variables for deductions and pay  
		double fedTaxRate = 0.1;
		double stateTaxRate = 0.045;
		double sSRate = 0.062;
		double mediRate = 0.0145;
		double wage = 7.25;
		
		//Creating variables for the calculations 
		double grossPay = userInput * wage;
		double fedTax = grossPay * fedTaxRate;
		double stateTax = grossPay * stateTaxRate;
		double sS = grossPay * sSRate;
		double medi = grossPay * mediRate;
		double netPay = grossPay - fedTax - stateTax - sS - medi;
		
		//Printing out all the info
		System.out.println("Hours per Week:" + "\t" + "\t" + userInput);
		System.out.println("Gross Pay:" + "\t" + "\t" + grossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t" + "\t" + fedTax);
		System.out.println("State:" + "\t" + "\t" + "\t" + stateTax);
		System.out.println("Social Security:" + "\t" + sS);
		System.out.println("Medicare:" + "\t" + "\t" + medi);
		
	}

}

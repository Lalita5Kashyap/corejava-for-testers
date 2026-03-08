package ch_3_operators;

public class Pro_6_Ternary_Operator {

	public static void main(String[] args) {
		// 1.Check number is even or odd

		int num = 10;
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println("Number is: " + result);
		System.out.println("-----------------------------------");

		// 2.Find Maximum of Two Numbers
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Maximum number is: " + max);
		System.out.println("-----------------------------------");

		// 3.Check Eligible for Voting
		int age = 1;
		String resul = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(resul);
	}

}

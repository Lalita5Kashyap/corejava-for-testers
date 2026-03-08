package ch_3_operators;

public class Pro_4_Logical_Operators {

	public static void main(String[] args) {
		// 1.Find largest among 3 numbers using logical operators(&&).

		int a = 400;
		int b = 18;
		int c = 80;

		// use if-else condition statement
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
		System.out.println("--------------------------------------");
		// 2.Check if a year is a leap year using logical operators(||).

		int year = 2028;

		// use if-else condition statement
		if (year % 400 == 0 || year % 4 == 0) {
			System.out.println("year is leap year");
		} else {
			System.out.println("year is  not leap year");
		}
		System.out.println("--------------------------------------");

		// 3.Check if a number is not negative using logical operators(!).
		int num = 5;

		// use if-else condition statement
		if (num < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is positive");
		}
		System.out.println("--------------------------------------");
	}

}

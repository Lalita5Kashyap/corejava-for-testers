package ch_3_operators;

public class pro_3_Relational_Operators {

	public static void main(String[] args) {
		// 1.Compare Two Numbers for greater than operator(>)
		int a = 1;
		int b = 9;

		// logic a>b
		// use if-else condition statement
		if (a > b) {
			System.out.println("a is greater ");
		} else {
			System.out.println("b is greater");
		}
		System.out.println("******************");

		// 2.Compare Two Numbers for less than operator(<)
		int a1 = 1;
		int b1 = 9;

		// logic a1<b1
		// use if-else condition statement
		if (a1 < b1) {
			System.out.println("a is smaller ");
		} else {
			System.out.println("b is smaller");
		}
		System.out.println("******************");

		// 3.Compare Two Numbers for greater than equal to operator(>=)
		int a2 = 2;
		int b2 = 2;

		// logic a2>=b2
		// use if-else condition statement
		if (a2 >= b2) {
			System.out.println("a is greater ");
		} else if (b2 >= a2) {
			System.out.println("b is greater");
		} else {
			System.out.println("a is equal to b");
		}
		System.out.println("******************");
	}

}

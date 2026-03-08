package ch_3_operators;

public class pro_3_Relational_Operators {

	public static void main(String[] args) {
		// 1.Compare Two Numbers using greater than operator(>)
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

		// 2.Compare Two Numbers using less than operator(<)
		int a1 = 10;
		int b1 = 9;

		// logic a1<b1
		// use if-else condition statement
		if (a1 < b1) {
			System.out.println("a is smaller ");
		} else {
			System.out.println("b is smaller");
		}
		System.out.println("******************");

		// 3.Compare Two Numbers using greater than equal to operator(>=)
		int a2 = 11;
		int b2 = 11;

		// logic a2>=b2
		// use if-else condition statement
		if (a2 > b2) {
			System.out.println("a is greater ");
		} else if (b2 > a2) {
			System.out.println("b is greater");
		} else {
			System.out.println("a is equal to b");
		}
		System.out.println("******************");

		// 4.Compare Two Numbers using less than equal to operator(<=)
		int a3 = 12;
		int b3 = 11;

		// logic a3<=b3
		// use if-else condition statement
		if (a3 < b3) {
			System.out.println("a is smaller ");
		} else if (b3 < a3) {
			System.out.println("b is smaller");
		} else {
			System.out.println("a is equal to b");
		}
		System.out.println("******************");

		// 5.Compare Two Numbers using equal to equal to operator(==)
		int a4 = 12;
		int b4 = 12;

		// logic a4==b4
		// use if-else condition statement
		if (a4 == b4) {
			System.out.println("a's value is similar to b ");
		} else {
			System.out.println("a's value is not similar to b ");
		}
		System.out.println("******************");
		
		// 6.Compare Two Numbers using equal to equal to operator(!=)
				int a5 = 0;
				int b5 = 12;

				// logic a5!=b5
				// use if-else condition statement
				if (a5 != b5) {
					System.out.println("a is not equal to b ");
				} else {
					System.out.println("a is equal to b ");
				}
				System.out.println("******************");

	}

}

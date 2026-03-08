package ch1_variables;

public class Pro_8_Simple_Interest_Calculator {

	public static void main(String[] args) {
		// Take three variables principal,rate and time.

		int principal = 700;
		int rate = 8;
		int time = 5;
		long SI;
		// logic SI = (P * R * T) / 100
		SI = (principal * rate * time) / 100;
		System.out.print("Simple Interest is : ");
		System.out.println(SI);

	}

}

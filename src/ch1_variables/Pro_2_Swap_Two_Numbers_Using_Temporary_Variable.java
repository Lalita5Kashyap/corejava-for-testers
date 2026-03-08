package ch1_variables;

public class Pro_2_Swap_Two_Numbers_Using_Temporary_Variable {

	public static void main(String[] args) {
		//Take two variables and swap their values.
		
		int a=3;
		int b=8;
		int temp;
		//logic a=8 and b=3
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.print("After swapping print value of a: ");
		 System.out.println(a);
		 System.out.print("After swapping print value of b: ");
		 System.out.println(b);
	}

}

package ch1_variables;

public class Pro_3_Swap_Two_Numbers_Without_Temporary_Variable {

	public static void main(String[] args) {
		//Take two variables and swap their values.
		
				int a=3;
				int b=8;
				
				//logic a=8 and b=3
				 a=a+b;//3+8=11
				 b=a-b;//11-8=3
				 a=a-b;//11-3=8
				 System.out.print("After swapping print value of a: ");
				 System.out.println(a);
				 System.out.print("After swapping print value of b: ");
				 System.out.println(b);
	}

}

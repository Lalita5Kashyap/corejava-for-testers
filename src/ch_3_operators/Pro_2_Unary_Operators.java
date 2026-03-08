package ch_3_operators;

public class Pro_2_Unary_Operators {

	public static void main(String[] args) {
		//1.Increment Operator(++a and a++)
		int a=9;
		 System.out.println("Increment value of :" +(a++));//In this first print the value of a and then increase by 1
		 System.out.println("Print value of a :" +a);//here concatenation happens
		 
		int b=7;
		System.out.println("Print value of b: " +b);//here concatenation happens
		 System.out.println("Increment value of :" +(++b));//In this first increase the value by 1 and then print
		 System.out.println("*********************************************");
		 
		 //2.Decrement Operator (--a and a--)
		 int a1=9;
		 System.out.println("Decrement value of :" +(a1--));//In this first print the value of a and then decrease by 1
		 System.out.println("Print value of a :" +a1);//here concatenation happens
		 
		int b1=7;
		System.out.println("Print value of b: " +b1);//here concatenation happens
		 System.out.println("Decrement value of :" +(--b1));//In this first decrease the value by 1 and then print
		 
		 
	}

}

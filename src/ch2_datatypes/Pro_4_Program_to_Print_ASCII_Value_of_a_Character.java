package ch2_datatypes;

public class Pro_4_Program_to_Print_ASCII_Value_of_a_Character {
	//OR Program_to_Convert_Char_to_Integer

	public static void main(String[] args) {
		//Use char and convert it to int.
		
		char ch = 'a';//A=65 & a=97
		int ascii=ch;// Typecasting is done by compiler implicitly
//		byte -> short -> char -> int -> long -> float -> double(Widening)
		
		System.out.print("ASCII value of A is: ");
		System.out.println(ascii);
	}

}

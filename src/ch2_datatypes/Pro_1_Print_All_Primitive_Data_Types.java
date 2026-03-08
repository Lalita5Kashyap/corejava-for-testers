package ch2_datatypes;

public class Pro_1_Print_All_Primitive_Data_Types {

	public static void main(String[] args) {
		// Declare variables of all primitive types and print their values.

		byte by = -50; // byte Size: 1 byte (8 bits) Range: -128 to 127
		System.out.print("Byte value is :");
		System.out.println(by);

		short sh = 30000; // short Size: 2 bytes Range: -32,768 to 32,767
		System.out.print("Short value is :");
		System.out.println(sh);

		int in = 1000; // int Size: 4 bytes Range: -2,147,483,648 to 2,147,483,647
		System.out.print("Integer value is :");
		System.out.println(in);

		long lo = 9876543210L; // long Size: 8 bytes
		System.out.print(" Long value is :");
		System.out.println(lo);

		float fl = -3.14f; // float Size: 4 bytes
		System.out.print("Float value is :");
		System.out.println(fl);

		double dou = 25.67; // double Size: 8 bytes
		System.out.print("Double value is :");
		System.out.println(dou);

		char ch = 'A';// char Size: 2 bytes Stores single character
		System.out.print("Character value is :");
		System.out.println(ch);

		String boolea = "tureORfalse"; // boolean Values: true or false
		System.out.print("Boolean value is :");
		System.out.println(boolea);

	}

}

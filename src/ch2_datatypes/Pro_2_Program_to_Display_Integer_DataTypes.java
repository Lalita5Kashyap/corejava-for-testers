package ch2_datatypes;

public class Pro_2_Program_to_Display_Integer_DataTypes {

	public static void main(String[] args) {
		//Print Integer datatypes
		
		byte by=100; //byte Size: 1 byte (8 bits) Range: -128 to 127
		System.out.print("Byte value is :");
		System.out.println(by);
		
		short sh=-1; //short Size: 2 bytes Range: -32,768 to 32,767
		System.out.print("Short value is :");
		System.out.println(sh);
		
		int in=-10; // int Size: 4 bytes Range: -2,147,483,648 to 2,147,483,647
		System.out.print("Integer value is :");
		System.out.println(in);
		
		long lo=9876543210L; //long Size: 8 bytes
		System.out.print("Long value is :");
		System.out.println(lo);
	}

}

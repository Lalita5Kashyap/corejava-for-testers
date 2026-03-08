package ch1_variables;

//Variable is a container that stores a value.This value can be change during the execution of the program.
public class Pro_1_Print_Different_Variables {

	public static void main(String[] args) {
		// Example_1:-Print name of person
		String name = "Core-Java";// string is Datatype and name is variable name)
		System.out.println("Name of person is: ");
		System.out.println(name);
		System.out.println("*******************************");

		// Example_2:-Print age of a person
		int age = 25;// int is Datatype and age is variable name)
		System.out.println("Age of person is :");
		System.out.println(age);
		System.out.println("*******************************");

		// Example_3:-Print salary
		double salary = 98000.0;// double is Datatype and salary is variable name)
		System.out.println("Salary of person is :");
		System.out.println(salary);
		System.out.println("*******************************");

		// Example_4:-Print grade of student
		char grade = 'A';// char is Datatype and grade is variable name)
		System.out.println("Grade of student is :");
		System.out.println(grade);
		System.out.println("*******************************");

		// Example_5:-Print boolean value
		// boolean check the condition whether it true or false
		boolean isJavaFun = true;// boolean is datatype and isjavafun is variable
		boolean isFishFlying = false;// boolean is datatype nad isfishflying is variable
		System.out.println("Is Core-Java Fun? ");
		System.out.println(isJavaFun);
		System.out.println("Is Fish Flying? ");
		System.out.println(isFishFlying);

	}

}

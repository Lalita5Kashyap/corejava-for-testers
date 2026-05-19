package ch11_constructorchaining;

public class CC_03_ConstructorCallSameClass {
	// no-arg constructor
	CC_03_ConstructorCallSameClass(String name) {
		System.out.println("Employee info");
		System.out.println("name :" + name);
	}

	// Argument construct
	CC_03_ConstructorCallSameClass(String name, int id) {
		this(name);
		System.out.println("id :" + id);
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		new CC_03_ConstructorCallSameClass("Kirthi", 89);
		new CC_03_ConstructorCallSameClass("Lokesh", 01);
	}
}

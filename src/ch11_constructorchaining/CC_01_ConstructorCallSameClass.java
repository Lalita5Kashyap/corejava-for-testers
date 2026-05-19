package ch11_constructorchaining;

public class CC_01_ConstructorCallSameClass {
	// no-arg constructor
	CC_01_ConstructorCallSameClass() {
		System.out.println("No-arg constructor");
	}

	// Argument construct
	CC_01_ConstructorCallSameClass(double d) {
		this();
		System.out.println("parameterized constructor");
		System.out.println("d :" + d);
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		new CC_01_ConstructorCallSameClass(33.5);
	}
}

package ch11_constructorchaining;

public class CC_02_ConstructorCallSameClass {
	// no-arg constructor
		CC_02_ConstructorCallSameClass() {
			System.out.println("Student info");
		}

		// Argument construct
		CC_02_ConstructorCallSameClass(String name) {
			this();
			System.out.println("name :" + name);
		}

	public static void main(String[] args) {
		System.out.println("Main starts");
		new CC_02_ConstructorCallSameClass("Kirthi");
	}
}

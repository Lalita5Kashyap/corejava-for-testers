package ch12_blocks_multilineinitializers;

public class B_03_StaticBlocks {
	// static variable
	static int n = 45;
	// static block
	static {
		n = 90;
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(n);
	}
}

package ch12_blocks_multilineinitializers;

public class B_02_StaticBlocks {
	// static block
	static {
		System.out.println("Static block-1");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
	}

	// static bloc
	static {
		System.out.println("Static block-2");
	}
}

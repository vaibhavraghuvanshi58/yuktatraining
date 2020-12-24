package yultamedia.test.test1;

public class A {public static void main(String[] args) {System.out.println("A main method");}}

// space save 
// obfuscation
// block
// free - form language

class B{
	public static void main(String[] args) {
		System.out.println("B main method");
	}
	{
		
	}
	static {
		
	}
}

// Javac A.java

// A
// B

// java B = B main method
// java A = A main method

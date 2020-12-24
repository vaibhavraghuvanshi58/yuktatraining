package yultamedia.test.test1;

public class ArithmaticOperator {
	public static void main(String[] args) {
		// + ,-,*,/ , %

		int a = 10;
		int b = 7;
		System.out.println(a+b); // 17
		System.out.println(a-b); // 3
		System.out.println(a*b); // 70
		System.out.println(a/b); // 1
		System.out.println(a%b); // 3

		float v = (float)a/(float)b + a + b;  // (right to left) = assign
		System.out.println(v);
	}
}

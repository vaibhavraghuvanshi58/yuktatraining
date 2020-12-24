package yultamedia.test.test1;

public class DataTypeSession {
	public static void main(String[] args) {
		
		byte b = -110;
		System.out.println(b);
		short g1 = 300;
		System.out.println(g1);
		int i1 = b;
		byte kl = (byte)i1; // datatype casting
		System.out.println(kl);
		long j = 123l;
		System.out.println(j);
		
		
		// Floating Data type
		float f1 = 123.0f;
		double d1 = 4563.5d;
		System.out.println(f1);
		System.out.println(d1);
		
		
		// Char 
		char c1 = 'a';
		System.out.println(c1);
		int i3 = c1;
		System.out.println(i3);
		
		int i4 = 1000;
		char h = (char)i4;
		System.out.println(h);
		
		char u1 = '\u0041'; // unicode
		System.out.println(u1);
		boolean  b1 = false;
		// boolean = true and false
		//keywords
		
	}
}

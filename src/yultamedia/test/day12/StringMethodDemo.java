package yultamedia.test.day12;

public class StringMethodDemo {
	
	public static void main(String[] args) {
		String st1 = "hello this is java";
		System.out.println(st1.length());
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println(st1.contains("ai"));
		
		String[] parts = st1.split(" ");
		for(int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}		
	}
}

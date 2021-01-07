package yultamedia.test.day12;

public class StringDemo {
	public static void main(String[] args) {
		// String - 99% - string usage 
		// String - array of characters

		String st1 = "Parvin"; // String literal - directly created string pool
		
		// total - 1
		
		String st2 = new String("Vaibhav"); // String Object (2 Objects , one in pool and one in heap)
		
		// total - 3
		
		String st3 = "Vaibhav";
		
		// total - 3
		
		String st4 = "Pravin";
		
		// total - 3

		String st5 = new String("Vaibhav");
		
		// total - 4
		
		
		
		st1 = "Vaibhav";
		System.out.println(st1);
		
		
		
		

	}
}

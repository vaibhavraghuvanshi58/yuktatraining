package yultamedia.test.day12;

public class Test1 {
	
	public static void main(String[] args) {
		// Array  - contain more then one values (n values)
		
					// 0 , 1,2,3,4,5,6
					//  1, 2,3, 4, 5, 6, 7	
		int[] marks = {10,20,30,60,40,50,70}; // element = 7
		int[] marks2 = new int[10]; 
		marks2[0] = 10;
		marks2[1] = 10;
		marks2[2] = 10;
		marks2[3] = 10;
		marks2[4] = 10;
		marks2[5] = 10;
		marks2[6] = 10;
		marks2[7] = 10;
		marks2[8] = 10;
		marks2[9] = 10;
		
		
		
		// array works on index concept.
		// 7 - length of this array
		// highest index - 6
		// System.out.println(marks.length); // size = 7
		
//		for(int i = 0; i < marks2.length; i++) {
//			System.out.println(marks2[i]);
//		}
		
		for(int i = (marks.length-1) ; i >= 0 ;i--) {
			System.out.println(marks[i]);
		}
		
		// advantages
		// keep the collection
		// fastest available collection in any object oriented language
		// when we create array - we have to give size of that array 
		// 10 of int(4) = 10*4 = 40 byte (JVM )
		
		// disavantage 
		// array - we cannot chnage the size 
		
		
		// multidimentional - 1D array
		// 2D array - 2 dimentions
		int[][] matrix = {{10,20},{20,30}}; // directly values 
		
		int[][] matrix2 = new int[2][2]; // directly values
		matrix2[0][0] = 10;
		matrix2[0][1] = 20;
		matrix2[1][0] = 20;
		matrix2[1][1] = 30;
		
		int[][] matrix1 = new int[2][6]; //  size
		// student 1 marks
		matrix1[0][0] = 10;
		matrix1[0][1] = 20;
		matrix1[0][2] = 20;
		matrix1[0][3] = 20;
		matrix1[0][4] = 20;
		matrix1[0][5] = 20;
		// student 2 marks
		matrix1[1][0] = 10;
		matrix1[1][1] = 20;
		matrix1[1][2] = 20;
		matrix1[1][3] = 20;
		matrix1[1][4] = 20;
		matrix1[1][5] = 20;
		
		
		
	}
}

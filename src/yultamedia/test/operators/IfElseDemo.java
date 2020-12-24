package yultamedia.test.operators;

public class IfElseDemo {
	public static void main(String[] args) {
		
		// comparison operation
		// ==  != < > <= >=

		// range
		
		// 18 = child
		// 18-30 = adult
		// 30-45 = man
		// 45 = old person
		
		int age = 38;
		if(age <= 18) {
			System.out.println("Child");
		}else if(age >18 && age <= 30) {
				System.out.println("adult");
		}else if(age > 30 && age <= 45) {
			System.out.println("man");
		}else{
			System.out.println("old person");
		}
		
		// Logical Operator or bitwise
		// &  |  (Bitwise Operator)
		//	And Condition both condition must be true 
		// Or = any one is true then true 
		
		// two conditin
	// And condition = false ,  (Logically ) -   && 
		//  Or .if my first is true, 
		
	}
}

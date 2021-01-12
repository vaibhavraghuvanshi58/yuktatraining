package yuktamedia.test.day17;

public class Test1 {
public static void main(String[] args) {
	String st1 = "Vaibhav";
	
	System.out.println(Calculator.advancedsum("",10));
	System.out.println(Calculator.advancedsum("",10,20,30,50,60,35));
	System.out.println(Calculator.advancedsum(""));
	System.out.println(Calculator.advancedsum("",90,89));
	
	System.out.println(Calculator.sum(10,20));
	
	// var args - various arguments
	//1 - in one param list , only 1 varags is possible
	// 2 - varrags param must be in thelast param
	
	// call by value and call by ref from your end
}
}


class Calculator{
	
	
	Calculator(int i){
		
	}

	Calculator(){
		
	}
	
	Calculator(String k){
		
	}
	
	Calculator(int i , int j){
		
	}
	
	static int advancedsum(String s1,int...a) {
		int sum = 0;
		for(int i = 0; i < a.length ;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	static int sum(int i , int j) {
		return i+j;
	}
	
//	int sum(int i  ,int j, int k) {
//		return i+j+k;
//	}
//	int sum(int i  ,int j, int k, int l) {
//		return i+j+k+l;
//	}
//	int sum(int i  ,int j, int k, int l, int m) {
//		return i+j+k+l;
//	}
//
//	int sum(int i  ,int j, int k, int l, int m , int n) {
//		return i+j+k+l;
//	}

	
	
	// same name method 
	// but type of param and number of params can be different
	// Polymorphism - Compile time polymorphism
	
	
	
	
}
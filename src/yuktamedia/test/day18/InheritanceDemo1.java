package yuktamedia.test.day18;

public class InheritanceDemo1 {
	public static void main(String[] args) {
		P3 p2  = new P3();
	//	p2.test1();
		
//		p2.test1();
		 // When child and parent have same name method , child method override parent method 
		//  Method overriding
		// we can increase the visibility but we cannot reduce
		
		 // public
		 // protected
		// default
		// private 
	}
}
// do we have parent of this class 
// every class has a parent class called Object class 

class P1{
	
	P1(){
		System.out.println("p1 constructor");
	}
	
	 private void test1() {
		System.out.println("kick");	
	}
}

class P2 extends P1{
	P2(){
		System.out.println("p2 constructor");		
	}
}
// Overrriding 
class P3 extends P2{
	P3(){
		System.out.println("p3 constructor");
	}
}
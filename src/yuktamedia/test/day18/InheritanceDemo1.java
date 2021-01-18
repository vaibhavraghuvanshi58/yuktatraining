package yuktamedia.test.day18;

public class InheritanceDemo1 {
	public static void main(String[] args) {
		P2 p2  = new P2();
		p2.test1();
		 // When child and parent have same name method , child method override parent method 
		//  Method overriding
		// we can increase the visibility but we cannot reduce
		
		 // public
		 // protected
		// default
		// private 
	}
}


class P1{
	 void test1() {
		System.out.println("kick");	
	}
}

class P2 extends P1{
	 void test1() {
		System.out.println("self");
	}
}
// Overrriding 
class P3 extends P2{
	public void test1() {
		System.out.println("electric");
	}	
}
package yuktamedia.test.day18;

public class InheritanceDemo {

}


// variable, method -> bedefault comes to child
class A{
	public void test1() {
		
	}
}

class B extends A{
	public void test2() {
		// test1 
//		A a1 = new A();
//		a1.test1(); // HAS A RELATIONSHIP
	test1();
	}
}

class C extends B{
	public void test3() {
		test1();
		test2();
	}
}

class D extends A{
	public void test5() {
		
	}
}
// IS A RELATIONSHIP   - PARENT-CHILD RELATIONSHIP



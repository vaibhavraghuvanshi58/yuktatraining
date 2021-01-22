package yuktamedia.test.day20;

public class AbstractionDemo {

}




// Multiple Inheritance

//abstarct class = partial abstraction 

abstract class Bank{	
	public abstract void test3() ;
	public void test5() {
		
	}
}


//interface = complete abstraction
interface Parent{
	public void test1();

}

interface Parent_other{
	public void test1();
}

// Multiple inheritance is not allowed in java
class Child implements  Parent,Parent_other{

	public void test1() {
		
	}
	
	
	
}

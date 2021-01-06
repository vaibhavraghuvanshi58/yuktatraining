package yultamedia.test.day9;

public class ConstrcutorDemo {
	public static void main(String[] args) {
		H h1 =new H();
		H h2 =new H(10);
		// instantiation(plot area) |  constructor
	}
}


class H{

	// non parameterised (default) 
	H(){
		System.out.println("default constructor");
	}

	H(int i){
		System.out.println("one parameterized constructor");
	}



	// method 
	void call() {
		System.out.println("i am call method");	
	}



}
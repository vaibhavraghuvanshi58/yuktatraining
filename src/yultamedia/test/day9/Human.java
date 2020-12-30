package yultamedia.test.day9;

public class Human {

	
	int x = y;
	static int y = 20;
	
	// Reason = y has not create yet.
	// because static variable - class 
	
	
	
	// characteristics
	// instance varibale  (object variable)
	String name;
	double height;
	double width;
	String color;
	double weight;

	
	// static variable (shared variable)
	static String country;
	
	// behaviour
	// eat
	// walk
	// run 

	// speak
	
	// non static can access both - static variable and non static variables
	void speak(String content) {
		int k = 10;
		System.out.println(name + ":" + content + country);
	}

	// static method - we can't access any instance variable
	static void walk() {
		System.out.println(country + " is walking");
	}

	// Service
	// taking some input - parameter
	// giving you output


	public static void main(String[] args) {

	}


}

class HumanDemo {
	public static void main(String[] args) {
		
		System.out.println(Human.country);
		Human.walk(); // we can call static method directly using classname. method name
		
		Human obj1 = new Human(); // create object
		obj1.name = "Pravin";
		obj1.height = 3.2d;
		obj1.weight = 80d;
		
		Human obj2 = new Human();
		System.out.println(obj2.name);
		
		
		obj1.country = "India";
		System.out.println(Human.country);
		obj2.country = "Pakistan";
		System.out.println(obj1.country);
		
//		obj1.speak("Hi");
//		
//		
//		
//		obj2.name = "Vaibhav";
//		obj2.speak("Hello");
//		
//		obj1.speak("How r u?");
//		obj2.speak("hy! i am gud. how r u?");

//		obj1.speak("i am good too. Happy new Year!");
//		obj2.speak("happy new year bro");
		
	}
}
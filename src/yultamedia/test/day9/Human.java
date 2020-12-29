package yultamedia.test.day9;

public class Human {

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
	void speak(String content) {
		int k = 10;
		System.out.println(name + ":" + content);
	}


	// Service
	// taking some input - parameter
	// giving you output


	public static void main(String[] args) {

	}


}

class HumanDemo {
	public static void main(String[] args) {
		Human obj1 = new Human(); // create object
		obj1.name = "Pravin";
		obj1.height = 3.2d;
		obj1.weight = 80d;
		
		Human obj2 = new Human();
		System.out.println(obj2.name);
		
		
		obj1.country = "India";
		System.out.println(obj2.country);
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
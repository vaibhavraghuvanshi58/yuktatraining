package yuktamedia.test.day18;

public class RuntimepolymorphismDemo {
	public static void main(String[] args) {

		Ram r1 = new Rahul();
		r1.food();
		
		
		// work as template
	}
}

class Ram{ // 1940 - shop food - 1 room
	
	int i = 10;
	
	public void food() {
		System.out.println("normal");
	}
}

class Shyam extends Ram{ // 1970 - shop 2 room, food, drinks  
	public void food() {
		System.out.println("fancy");
	}
	public void drink() {
		System.out.println("1970 drink");
	}
}

class Rahul extends Shyam{
	int i = 20;
	public void food() {
		System.out.println("modern" + i);
	}
	
	public void drink() {
		System.out.println("rahul drink");
	}
	public void snacks() {
		System.out.println("rahul snacks");
	}
}

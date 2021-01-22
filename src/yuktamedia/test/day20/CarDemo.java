package yuktamedia.test.day20;

public class CarDemo {
	public static void main(String[] args) {
		CarSpeed c1 = new Maruti();
		c1.maximumSpeed();
	}
}

interface CarSpeed{
	int i = 10;
	public void maximumSpeed();
}

interface Price{
	public void price();
	public void commercialprice();
}

interface Tyres{
	public void companyName();
}

interface CruiseControl{
	public void control();
}


class Maruti implements CarSpeed,Price,Tyres{
	@Override
	public void companyName() {
		System.out.println("maruti");	
	}

	@Override
	public void price() {
		System.out.println("6lk");		
	}

	@Override
	public void commercialprice() {
		System.out.println("4lk");		
	}

	@Override
	public void maximumSpeed() {
		System.out.println("100kmperhour");		
	}

}

class Audi implements CarSpeed,Price,Tyres,CruiseControl{

	@Override
	public void control() {
		System.out.println("user can handle that");		
	}

	@Override
	public void companyName() {
		// TODO Auto-generated method stub
		System.out.println("MRF");
	}

	@Override
	public void price() {
		System.out.println("24lk");
	}

	@Override
	public void commercialprice() {
		System.out.println("20lk");		
	}

	@Override
	public void maximumSpeed() {
		System.out.println("300kmperhour");
	}

}




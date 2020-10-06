package bit.r45.ch06;

public class Car {
	
	String title;
	
	Tire mytire = new Tire();
	private Door mydoor = new Door();
	
	
//	public Car() {		
//		this.title = "멋진카";
//		System.out.println("Car 기본생성자 : "+this.title);		
//	}
	
	public Car() {
//		this("");
	}
	
	public Car(String title) {
		this.title = title;
		System.out.println("Car 생성자 : "+this.title);
	}
	
	public String info() {
		return "타이어 4개, 도어 4개";
	}
	
	//method overloading
	public String info(String msg) {
		return msg;
	}
	
	
}

class Tire{
	
}

class Door{
	
}
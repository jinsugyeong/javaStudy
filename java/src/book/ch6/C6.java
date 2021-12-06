package book.ch6;

public class C6 {

	public static void main(String[] args) {
		Car c = new Car("파랑",200,1000,5);
		c.show();
		
		System.out.println();
		//오버라이딩된 메서드와 다형성 관계
		Vehicle v = c;
		v.show();

	}

}

class Vehicle {
	String color; //자동차 색상
	int speed; //자동차 속도
	
	void show() {
		System.out.println("자동차 색상 : "+color);
		System.out.println("자동차 속도 : "+speed);
	}
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
}

class Car extends Vehicle {
	int displacement; //자동차 배기량
	int gears; //자동차 기어단수
	
	@Override
	void show() {
		System.out.println("자동차 색상 : "+color);
		System.out.println("자동차 속도 : "+speed);
		System.out.println("자동차 배기량 : "+displacement);
		System.out.println("자동차 기어단수 : "+gears);
	}
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color,speed);
		this.displacement = displacement;
		this.gears = gears;
	}
}
package book.ch6;

public class C1 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10,"빨간색");
		
		c1.show();	
		c2.show();	

	}

}

class Circle {
	int radius;
	void show() {
		System.out.printf("반지름이 %d인 원이다.\n",radius);
	}
	Circle(int radius){
		this.radius = radius;
	}
}

class ColoredCircle extends Circle {
	String color;
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n",radius,color);
	}
	ColoredCircle(int radius, String color){
		super(radius);
		this.radius = radius;
		this.color = color;
	}
}
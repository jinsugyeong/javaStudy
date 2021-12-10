package book.ch10;

class Shape {
	
}

class Rectangle extends Shape {
	
}

class Circle extends Shape {
	
}

public class C2 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	
		try {
			casting(r);
			
		}catch(ClassCastException e) {
			
			System.out.println("예외 원인: ClassCastException(상속,구현 관계가 아닌 클래스나 인터페스와 타입 변환을 시도 할 때");
			System.out.println("Circle 타입으로 변환 불가");
		}
				
			
	}
		


	static void casting(Shape s) {
		Circle c = (Circle)s;
	}

}

package book.ch8.again;

interface Shape{
	final double PI=3.14;
	public abstract double getArea();
	default public void printArea() {
		System.out.println("도형의 넓이 = " + getArea());
	}
}


public class C8 {

	public static void main(String[] args) {
		Shape s = (new Shape() {
			//코드추가
			int r;
			public double getArea() {
				return r * r * PI;
			}

			public Shape setRadius(int i) {
				r= i;
				return this;
			}
		}).setRadius(5);
		s.printArea();

	}

}

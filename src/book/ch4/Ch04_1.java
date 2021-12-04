package book.ch4;
/*class Triangle {
		static double A;
		static double B;
		private double C;
		
		public double getC() {
			return C;
		}

		Triangle(double a,double b) {
			A = a;
			B = b;
		}
		
		public double findArea(){
			double C = A * B /2;
			return C;
		}
		

	}

public class Ch04_1 {
	public static void main(String[] args) {
		
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());

	}

}
*/

class Triangle {
	private double a;
	private double b;
	//생성자
	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	//메서드
	public double findArea() {
		return a * b /2;
	}
	//접근자
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	
}
public class Ch04_1 {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}
}
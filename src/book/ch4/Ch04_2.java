package book.ch4;
class Triangle2 {
	private double a;
	private double b;
	
	//생성자
	public Triangle2(double a, double b) {
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
	
	public String isSameArea(Triangle2 x) {
		String re=null;
		if(this.findArea() == x.findArea()) {
			re="넓이가 동일합니다.";
		}else {
			re="넓이가 동일하지 않습니다.";
		}
		return re;
	}
	
}
public class Ch04_2 {
	public static void main(String[] args) {
		Triangle2 t1 = new Triangle2(10.0, 5.0);
		Triangle2 t2 = new Triangle2(5.0, 10.0);
		Triangle2 t3 = new Triangle2(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t2.isSameArea(t1));
		System.out.println(t3.isSameArea(t1));
		System.out.println(t2.isSameArea(t3));
	}
}
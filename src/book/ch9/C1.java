package book.ch9;

public class C1 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		
		if(c1.equals(c2)) {
			System.out.println("c1과 c2는 같다");			
		}else {
			System.out.println("c1과 c2는 다르다");
		}

	}

}
class Circle {
/*	int num;
	Circle(int num) {
		this.num = num;
	}
	public boolean equals(Object obj) {
		if(this.num == c.num)
			return true;
		else
			return false;
	}
	*/
	String r;
	
	Circle(int r) {
		Integer r1 = new Integer(r); //wrapper클래스 객체 생성 
		String rs = Integer.toString(r1); //wrapper클래스->문자열
		this.r = rs;
	}
	
	@Override
	public boolean equals(Object o) {//오버라이딩은 매개변수도 똑같이
		Circle c = (Circle) o;
		
		if(r.equals(c.r))
			return true;
		else
			return false;
	}
}
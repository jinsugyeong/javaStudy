package book.ch10;

class Max<T extends Number> {
	
	T first;
	T second;
	
	
	
	
	T max(T first, T second) {
		//Number객체내 메서드를 불러오는 거라 타입매개변수에 상속받아야한다
		int a = first.intValue();
		int b = second.intValue();
		
		if(a>b) {
			return first;
		}else {
			return second;
		}
	}
	
	
}

public class C6 {

	public static void main(String[] args) {
		Max m = new Max();
		System.out.println(m.max(10.0, 8.0));
		System.out.println(m.max(5, 8.0));
		System.out.println(m.max(5, 3.0));

	}

}

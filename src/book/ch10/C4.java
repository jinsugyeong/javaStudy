package book.ch10;

class Pair<T> {
	//2개의 필드, 2개의 메서드
	T first;
	T second;
	
	Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	T first() {
		return first;
		
	}
	
	T second() {
		return second;
		
	}
	
	
}


public class C4 {

	public static void main(String[] args) {
		Pair<Integer> p1 = new Pair<>(10, 20);
		Pair<Double> p2 = new Pair<>(10.0, 20.0);
		
		
		System.out.println(p1.first());  //10
		System.out.println(p2.second()); //20.0

	}

}

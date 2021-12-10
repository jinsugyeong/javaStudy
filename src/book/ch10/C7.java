package book.ch10;


class Box<T> {
	
	T t;
	
	void set(T t) {
		this.t = t;
		
	}
	
	T get() {
		
		return t;
	}
	
}

public class C7 {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(new Integer(100));
		System.out.println(i.get());
		
		Box<String> s = new Box<>();
		s.set("만능이네!");
		System.out.println(s.get());

	}

}

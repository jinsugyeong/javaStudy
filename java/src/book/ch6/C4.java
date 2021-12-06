package book.ch6;

public class C4 {

	public static void main(String[] args) {
		//자식클래스는 메서들를 오버라이딩 할 수 있지만 필드는 불가능하다.
		Parent p = new Child();
		System.out.println(p.name);
		p.print();

	}

}

class Parent {
	String name="영조";
	void print() {
		System.out.println("나는 "+name+"이다.");
	}
}

class Child extends Parent {
	String name="사도세자";
	void print() {
		System.out.println("나는 "+name+"이다.");
	}
}
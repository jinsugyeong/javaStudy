package book.ch6;

public class Girl {
	protected String name;
	void show() {
		System.out.println(name + "는 자바 초보이다.");
	}
	Girl(String name) {
		this.name = name;
	}

}

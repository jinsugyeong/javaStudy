package book.ch6;

public class GoodGirl extends Girl {
	//안써잇지만 protected string name이 있음...
	GoodGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}
	
	
}

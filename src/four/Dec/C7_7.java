package four.Dec;

public class C7_7 {

	public static void main(String[] args) {
		Human.echo(); //야호!!!
		
		Student s = new Student(20);
		s.print(); //학생입니다.
		s.eat(); //도시락을 먹습니다.
		
		Person p = new Person();
		p.print(); //인간입니다.
		p.eat(); //빵을 먹습니다.

	}

}
interface Human {
	void eat();
	void print();
	
	public static void echo() {
		System.out.println("야호!!!");
	}
}

class Person implements Human {
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	public void print() {
		System.out.println("인간입니다.");
	}
}

class Student implements Human {
	int age;
	
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	public void print() {
		System.out.println("학생입니다.");
	}
	
	Student(int age) {
		this.age = age;
	}
}
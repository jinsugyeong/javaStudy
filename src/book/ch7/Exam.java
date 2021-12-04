package book.ch7;


public class Exam {

	public static void main(String[] args) {
		Countable[] m = {new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무")};
		
		for(Countable e: m) {
			
			e.count();
		}

		for(int i =0; i<m.length; i++) {
			
			
			//타입에 따라 fly() 또는 ripen() 메서드를 호출하는 코드

			if(m[i] instanceof Bird) {
				Bird b = (Bird) m[i];
				b.fly();
			}else if(m[i] instanceof Tree) {
				Tree t = (Tree) m[i];
				t.ripen();
			}
		}

	}

}

interface Countable {

	void count();
}

class Bird implements Countable {
	
	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	//count()와 fly()메서드를 위한 코드
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}
	
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다.");
	}
}

class Tree implements Countable {
	//Bird 클래스와 유사하다.
	String name;
	
	public Tree(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}
	public void ripen() {
		System.out.println(name+"에 열매가 잘 익었다.");
	}
	
}
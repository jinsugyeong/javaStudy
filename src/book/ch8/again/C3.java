package book.ch8.again;

interface Talkable {
	void talk();
}

public class C3 {
	
	static void conversation(Talkable t) {
		t.talk();
	}
	
	public static void main(String[] args) {
		/*1. Talkable 구현클래스를 지역클래스로
		class Korean implements Talkable  {
			public void talk() {
				System.out.println("안녕하세요!");
			}
		}
		class American implements Talkable  {
			public void talk() {
				System.out.println("Hello!");
			}
		conversation(new Korean());
		conversation(new American());	
			
		}*/
		
		/*2. 지역클래스를 무명객체로
		Talkable korean = new Talkable() {
			public void talk() {
				System.out.println("안녕하세요!");
			}
		};
		Talkable american = new Talkable() {
			public void talk() {
				System.out.println("Hello!");
			}
		};
		
		conversation(korean);
		conversation(american);*/
		
		
		//3. 무명객체를 람다식으로
		Talkable korean = () -> System.out.println("안녕하세요!");
		Talkable american = () -> System.out.println("Hello!");
		
		conversation(korean);
		conversation(american);
		
		

	}

}

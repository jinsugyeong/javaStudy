package book.ch8;

interface Talkable {
	void talk();
}

public class C3 {
	
	static void conversation(Talkable t) {
		t.talk();
	}

	public static void main(String[] args) {
		//코드 추가
		
		/*1. Talkable의 구현 클래스인 Korean과 Aemrican 클래스를 main()메서드 지역 클래스로 정의
		class Korean implements Talkable {
			public void talk() {
				System.out.println("안녕하세요!");
			}
		}
		
		class American implements Talkable {
			public void talk() {
				System.out.println("Hello!");
			}
			
		conversation(new Korean()); //안녕하세요!
		conversation(new American()); //Hello!
		}*/
		
		
		/* 2. 1에서 작성한 클래스를 무명 클래스로 수정
		 
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
		

		conversation(korean); //안녕하세요!
		conversation(american); //Hello!
*/
		
		
		//3. 2에서 작성한 무명 객체를 람다식으로 수정
		Talkable korean = () -> System.out.println("안녕하세요!");
		Talkable american = () -> System.out.println("Hello!");
		
		
		conversation(korean); //안녕하세요!
		conversation(american); //Hello!
	}

}

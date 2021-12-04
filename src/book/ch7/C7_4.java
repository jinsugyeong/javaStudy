package book.ch7;

public class C7_4 {

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}
	
	static void speak(Talkable t) {
		//테스트 프로그램
		t.talk();
	}

}
/*문제4번.
Talkable 인터페이스는 talk() 메서드 하나만 포함한다.
Korean 클래스와 American 클래스는 Talkable 구현 클래스이다.
speak(new Korean());
speak(new Aemrican());의 결과가
안녕하세요!
Hello!일때
Talkable 인터페이스와 Korean 클래스와 American 클래스와 테스트 프로그램을 작성하시오.*/

interface Talkable {
	void talk();
}

class Korean implements Talkable {

	public void talk() {
		System.out.println("안녕하세요!");
	}
}

class American implements Talkable {

	
	public void talk() {
		System.out.println("Hello");
	}
}
package book.ch7;

public class C7_2 {

	public static void main(String[] args) {
		

	}

}

//이 2개의 인터페이스를 모두 사용하는 클래스가 자주 발생한다. 
//하나의 인터페이스로 통합된 Delicious 인터페이스를 작성하시오.

interface Edibel {
	void eat();
}

interface Sweetable {
	void sweet();
}

interface Delicious extends Edibel, Sweetable {
	
}
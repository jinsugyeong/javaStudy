package book.ch8;

interface Wordable {
	void word();
}



public class C5 {
	public static void main(String[] args) {
		Wordable[] m = {
			//(문제5) 람다식들

			() -> System.out.println("가위"),
			() -> System.out.println("나비"),
			() -> System.out.println("다리"),
			() -> System.out.println("마차")
		};
		for(Wordable e: m) 
			e.word();
	}
}

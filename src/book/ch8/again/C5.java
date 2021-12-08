package book.ch8.again;

interface Wordable {
	void word();
}


public class C5 {

	public static void main(String[] args) {
		Wordable[] m = {
			//람다식들	
			() -> System.out.println("가위"),
			() -> System.out.println("나비"),
			() -> System.out.println("다리"),
			() -> System.out.println("마차")
		};
		for(Wordable e : m) {
			e.word();
		}

	}

}

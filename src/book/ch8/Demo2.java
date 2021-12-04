//지역 클래스의 사용 - 지역클래스와 지역변수간의 관계
package book.ch8;

public class Demo2 { //외부클래스
	private String s1 = "외부";
	
	void method() {
		int x = 1; //jdk8부터 지역클래스가 참조하는 지역 변수는 final로 명시하지 않더라도 final로 간주
		
		class LocalClass { //내부 - 지역 클래스
			String s2 = "내부-지역";
			String s3 = s1;
			
			public void show() {
				System.out.println("지역 클래스");
			}
		}
		
		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
		
	}
	
	public static void main(String[] args) {
		
		Demo2 lcd = new Demo2();
		lcd.method();

	}

}

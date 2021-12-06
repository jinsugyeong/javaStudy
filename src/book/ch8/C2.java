/*문제2번.
Flyable 인터페이스를 지역클래스로 이용하는 테스트 프로그램을 완성하시오*/
package book.ch8;

public class C2 {

	public static void main(String[] args) {
		Flyable f = new Flyable() {
			public void speed() {
				System.out.println("속도");
			}
			public void Height() {
				System.out.println("높이");
			}
		}; //한 행 이상의 코드 필요
		
		f.speed(); //속도
		f.Height(); //높이

	}

}
interface Flyable {
	void speed();
	void Height();
}
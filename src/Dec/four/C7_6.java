package Dec.four;
/*문제6번.
어떤 프린터 용지를 사용했는지 점검하려고 다음 프로그램을 작성했다.
Call 클래스를 완성하시오.
콘솔창 결과: B4*/

public class C7_6 {

	public static void main(String[] args) {
		Printable p = new B4();
		Call c = new Call();
		c.invoke(p);
		
	}

}
interface Printable {
	void a();
}

class A4 implements Printable {
	public void a() {
		System.out.println("A4");
	}
}

class B4 implements Printable {
	public void a() {
		System.out.println("B4");
	}
}

class Call {
	//코드 추가
	void invoke(Printable p) {
			if(p instanceof A4) {
				A4 p1 = (A4)p; //객체 타입 변환 제발 기억
				p1.a();
			}else if(p instanceof B4) {
				B4 p1 = (B4)p;
				p1.a();
			}
	}
}
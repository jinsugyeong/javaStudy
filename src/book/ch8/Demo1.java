//멤버 클래스의 사용
package book.ch8;
public class Demo1 {//외부 클래스

	private String secret = "비공개";
	String s = "외부";
	
	class Demo2 { //내부 클래스 - 인스턴스 멤버 클래스
		String s = "내부-인스턴스";
		
		public void show() {
			System.out.println("인스턴스 멤버 클래스");
			System.out.println(secret);
			
			System.out.println(s); //9행의 s
			
			System.out.println(Demo1.this.s); //6행의 s
		}
		
		//정적 필드, 메서드 포함 불가
	}
	
	public static class Demo3 { //내부 클래스 - 정적 멤버 클래스
		String s = "내부-정적";
		
		public void show() {
			System.out.println("정적 멤버 클래스");
			// System.out.println(secret); ---> 정적 멤버 클래스가 외부 클래스보다 먼저 생성되기 때문에 멤버 필드 사용못함
			
			System.out.println(s); //24행의 s
			
			//System.out.println(Demo1.this.s);
		}
		
		static int a; //정적 필드,메서드 포함 가능
	}
	
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo1.Demo2 d2 = d1.new Demo2(); //인스턴스멤버 클래스 객체생성 문법
		Demo1.Demo3 d3 = new Demo1.Demo3();
		
		System.out.println(d2.s + " <-인스턴스 멤버 클래스 객체생성 후 필드 출력");
		d2.show();
		System.out.println();
		
		System.out.println(d3.s+ " <-정적 멤버 클래스 객체생성 후 필드 출력");
		d3.show();

	}

}

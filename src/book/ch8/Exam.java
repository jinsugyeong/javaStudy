package book.ch8;

public class Exam {

	public static void main(String[] args) {
		/*Controllable tv = new TV("길동이");
		
		tv.power(true);
		//문제1번.나머지 - 콘솔결과로 tv전원을 켠다/끈다/서비스센터에서/내가초기화 순서대로 출력
		tv.power(false);
		tv.repair();
		Controllable.reset(); */
		
		
		String who = "길동이";
		
		/*Controllable 인터페이스의 구현 클래스 TV코드
		class TV implements Controllable {
			
			@Override
			public void power(boolean onOff) {
				//적절한 코드
				if(onOff == true)
					System.out.println(who+"가 TV 전원을 켠다");
				else
					System.out.println(who+"가 TV 전원을 끈다");
				
			}
		}*/
		
		/*Controllable tv = new Controllable() {
			public void power(boolean onOff) {
				//적절한 코드
				if(onOff == true)
					System.out.println(who+"가 TV 전원을 켠다");
				else
					System.out.println(who+"가 TV 전원을 끈다");
				
			}
		};*/
		
		
		//무명 클래스->람다식 코드
		Controllable tv = (x) -> {};
	
		
		tv.power(true);
		tv.power(false);
		tv.repair();
		
	}

}

interface Controllable {
	default void repair() {
		System.out.println("서비스센터에서 수리해야 한다.");
	}
	
	static void reset() {
		System.out.println("내가 초기화할 수 있다.");
	}
	
	void power(boolean onOff);
}

/*class TV implements Controllable {
	String who;
	//생성자
	TV(String who) {
		this.who = who;
	}
	
	//인터페이스에 포함된 추상 메서드의 구현 코드
	public void power(boolean onOff) {
		if(onOff == true)
			System.out.println(who+"가 TV 전원을 켠다");
		else
			System.out.println(who+"가 TV 전원을 끈다");
	}
}*/
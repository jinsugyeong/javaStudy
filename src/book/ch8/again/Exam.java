package book.ch8.again;

interface Controllable {
	default void repair() {
		System.out.println("서비스센터에서 수리해야 한다.");
	}
	
	static void reset() {
		System.out.println("내가 초기화할 수 있다.");
	}
	
	void power(String s, boolean onOff);
	
	
}

/*class TV implements Controllable {
	String who;
	
	TV(String who) {
		this.who = who;
	}
	
	public void power(boolean onOff) {
		if(onOff == true) {
			System.out.println(who +"는 TV전원을 켠다");
		}else {
			System.out.println(who +"는 TV전원을 끈다");
		}
	}
}*/

public class Exam {

	public static void main(String[] args) {
	/* 1. 인터페이스 구현클래스를 따로 작성해서 객체생성
	 * 	Controllable tv = new TV("길동이");
		
		tv.power(true);
		tv.power(false);
		tv.repair();
		Controllable.reset();*/
		
		
		/*2. 인터페이스 구현클래스를 지역클래스로 작성해서 객체생성
		 * String who = "나는 ";
		class TV implements Controllable {
			
			@Override
			public void power(String s, boolean onOff) {
				if(onOff == true) {
					System.out.println(who +s+" 전원을 켠다");
				}else {
					System.out.println(who +s+" 전원을 끈다");
				}
				
			}
		}
		Controllable tv = new TV();
		
		tv.power("TV", true);
		tv.power("TV", false);
		tv.repair();
		Controllable.reset();*/
		
		
		/*3. 인터페이스 구현클래스를 무명 구현 객체로 작성
		 * String who = "나는 ";
		Controllable tv = new Controllable() {
			@Override
			public void power(String s, boolean onOff) {
				if(onOff == true) {
					System.out.println(who +s+" 전원을 켠다");
				}else {
					System.out.println(who +s+" 전원을 끈다");
				}
				
			}
		};
		
		tv.power("TV", true);
		tv.power("TV", false);
		tv.repair();
		Controllable.reset();*/
		
		
		String who = "나는 ";
		//람다식 코드
		Controllable tv = (s, onOff) -> {
			if(onOff == true) {
				System.out.println(who +s+" 전원을 켠다");
			}else {
				System.out.println(who +s+" 전원을 끈다");
			}
		};
		
		
		tv.power("TV", true);
		tv.power("TV", false);
		tv.repair();
		Controllable.reset();
		
		

	}

}

package four.Dec;

public class C7_5 {

	public static void main(String[] args) {
		Controller[] c = {new TV(false), new Radio(true)};
		
		for(Controller controller : c)
			controller.show();

	}

}
/*문제5번.
Controller 추상클래스 - 필드 boolean power, 메서드 void show(), 추상메서드 String getName()
TV,Radio 클래스 - Controller의 구현 클래스*/

abstract class Controller {
	boolean power;
	
	void show() {
		if(power == true) {
			System.out.println(getName() + "가 켜졌습니다.");
		} else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}
	
	abstract String getName();
	
	Controller(boolean power) {
		this.power = power;
	}
}

class TV extends Controller {
	
	String getName() {
		return "TV";
	}

	TV(boolean power) {
		super(power);
	}
	
}

class Radio extends Controller {
	
	String getName() {
		return "라디오";
	}	
	
	
	Radio(boolean power) {
		super(power);
	}
}
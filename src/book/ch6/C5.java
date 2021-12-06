package book.ch6;

public class C5 {

	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"),new Telephone("길동이","내일"),new SmartPhone("민국이","갤러그")};
		
		for(int i=0; i<phones.length;i++) {
			if(phones[i] instanceof SmartPhone) {
				((SmartPhone)phones[i]).playGame();
			}else if(phones[i] instanceof Telephone) {
				((Telephone)phones[i]).autoAnswering();
			}else if(phones[i] instanceof Phone) {
				phones[i].talk();
			}
		}
	}

}

class Phone {
	protected String owner;
	Phone(String owner) {
		this.owner = owner;
	}
	
	void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}

class Telephone extends Phone {
	private static String when;
	
	Telephone(String owner,String when){
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner+"가 없다. " + when + " 전화 줄래.");
	}
	
	public static String getWhen() {
		return when;
	}
}

class SmartPhone extends Telephone{
	private String game;
	SmartPhone(String owner,String game) {
		super(owner,getWhen());
		this.game = game;
	}
	
	void playGame() {
		System.out.println(owner+"가 "+game+" 게임을 하는 중이다.");
	}
	
}
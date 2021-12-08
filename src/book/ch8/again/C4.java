package book.ch8.again;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");
	}
	
	abstract void echo();
	
	void stop() {
		System.out.println("종료합니다.");
	}
}

public class C4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Echoer e = new Echoer() {
			public void echo() {
				String s = in.next();
				while(s.equals("끝")== false){
					System.out.println(s);
					s = in.next();
				}
			}
		};
		
		e.start();
		e.echo();
		e.stop();

	}

}

package book.ch8;

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
		
		//한 행 이상의 코드 필요
		Echoer e = new Echoer() {
			public void echo() {
				String s = null;
				
				do {
					s = in.next();
					System.out.println(s);
					
				}while(s.equals("끝") == false);
			}
		}; 
		
		e. start();
		
		e. echo();
		
		e.stop();

	}

}
/*
콘솔창 결과 :
시작합니다
입력> 좋은 아침!
좋은 아침!
입력> 잘 가세요.
잘 가세요.
입력> 끝
끝
종료합니다.
*/
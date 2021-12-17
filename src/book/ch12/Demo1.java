package book.ch12;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {//예외처리해줘야함!!!
		int b, len =0;
		int ba[] = new int[100];
		
		System.out.println("--- 입력 스트림 ---");
		//줄바꿈 문자가 나올 때까지 키보드로 입력한 데이터를 정수 변수에 대입한다.
		while ((b = System.in.read()) != '\n') {
			System.out.print(((char)b)+"("+b+")");
			ba[len++] = b;
		}
		
		/*
		--- 입력 스트림 ---
		hello -> 키보드로 hello와 Enter를 입력함
		h(104)e(101)l(108)l(108)o(111) -> hello값
		(13) -> Enter값
		*/
		
		
		
		System.out.println("\n\n--- 출력 스트림 ---");
		for(int i=0; i<len; i++) {
			System.out.write(ba[i]);
		}
		/*
		--- 출력 스트림 ---
		hello -> 한 바이트씩 입력된 데이터를 출력
		*/
		
		//버퍼에 남아있는 데이터를 비워 표준 출력 장치로 전송한다.
		//flush() 대신 close()를 써도 된다
		System.out.flush(); 
		
		
	}

}

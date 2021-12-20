package book.ch12;

import java.io.IOException;
import java.io.OutputStream;

public class C5 {
	/*문제5. OutputStream과 관련된 메서드를 이용해 0부터 9까지 연속된 숫자와
	A부터 Z까지 알파벳 문자를 콘솔뷰에 출력하는 프로그램을 작성하시오
	0의 ASCII코드값은 48, A는 65이다.
	콘솔은 표준 출력 장치이므로
	System.out 객체를 OutputStream 타입의변수에 대입해서 사용한다*/
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		//나는 여기까지 밖에 못함... 
		
		int num_ascii = 48;
		int alpha_ascii = 65;
		
		while (num_ascii<='9') { 
			os.write(num_ascii++);
			System.out.print(" ");
		}
		System.out.println();
		while (alpha_ascii<='Z') { 
			os.write(alpha_ascii++);
			System.out.print(" ");
		}
		
		os.flush();
	}

}

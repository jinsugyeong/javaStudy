package book.ch5;
import java.util.Scanner;

public class Ch05_04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s;
		
		do {
			System.out.print("URL을 입력하세요 : ");
			s = in.next();
			if(s.equals("bye") == false) {

				System.out.println(s + "은 '" + s.substring(s.length()-3) + "'으로 끝납니다.");
				
				if(s.indexOf("java") > -1) {
					System.out.println(s + "은 'java'를 포함합니다.");
				}else {
					System.out.println(s + "은 'java'를 포함하지 않습니다.");
				}
			}
			
			
		}while(s.equals("bye") == false);
		
		


	}

}

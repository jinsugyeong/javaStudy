package book.ch12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class CountLetter{
	char c;
	String s;
	int count=0;
	
	CountLetter(char c, String s){
		this.c = c;
		this.s = s;
	}
	
	public int count() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(s));
		char[] buf = new char[10000];
		int bufLen = 0;
		
		while(true) {
			int b = br.read();
			if(b==-1)
				break;
			buf[bufLen++] = (char)b;
		}
		for(int i=0; i<bufLen;i++) {
			if(buf[i]==c)
				count++;
		}
		
		br.close();
		return count;
		
		
	}
}

public class C7 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("파일 이름을 입력하세요 : ");
		String fileName = in.nextLine();
		System.out.print("세고자 하는 문자를 입력하세요 : ");
		char lookFor = in.nextLine().charAt(0);
		
		int count = new CountLetter(lookFor,fileName).count();
		System.out.printf("%s 파일에 %c 문자가 %d개 %n", fileName, lookFor,count);

		/* %n > 지금까지 print한 문자개수 출력
			 	int d = 1234, n;
				printf("%d%n\n", d, &n);
				printf("%d digits\n", n);
				(결과)
				1234
				4 digits
		*/
	}

}

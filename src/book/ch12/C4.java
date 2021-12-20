//키보드로 입력한 이름의 자바 소스 파일을 찾아 
//맨 앞에 행 번호를 붙여서 출력하는 프로그램을 작성하시오

package book.ch12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*public class C4 {

	public static void main(String[] args) {
		String fileName;
		System.out.print("자바 소스 파일 이름을 입력하세요 : ");

		fileName = new Scanner(System.in).nextLine();
		try {
			int lineNumber = 1;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while(true) {
				line = br.readLine();
				if(line == null)
					break;
				System.out.println(lineNumber++ + " : "+ line);
			}
			br.close();
		}catch(IOException e) {
			
		}

	}

}
*/
public class C4{
	public static void main(String[] args) {
		
		//내가 입력받을 파일 이름, 한행마다 반복문 돌리고, 행번호, 그리고 한행마다 받아올려면 BufferedReader
		
		String fileName;
		System.out.print("자바 소스 파일 이름을 입력하세요 : ");
		
		fileName = new Scanner(System.in).nextLine();
		try {
			
			BufferedReader bfr = new BufferedReader(new FileReader(fileName));
			int num=1;
			String line;
			while(true) {
				line = bfr.readLine();
				if(line==null)
					break;
				System.out.println(num++ + " :  " + line);
			}
			bfr.close();
		}catch(IOException e) {
			
		}
	}
}
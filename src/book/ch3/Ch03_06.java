package book.ch3;
import java.util.Scanner;

public class Ch03_06 {

	public static void main(String[] args) {
		
		
  		//가위(s), 바위(r), 보(p)
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("가위(s), 바위(r), 보(p) 중  하나를 입력하세요 : ");
		String s = in.next();
		
		srpGame(s);
		
	}
	
	
	static String srpGame(String x) {
		
		String result="";
		if(x.equals("r")) {
			result = "무승부";
		}else if(x.equals("s")) {
			result = "철수, 승!";
		}else if(x.equals("p")) {
			result = "영희, 승!";
		}
		
		System.out.println("철수 : r");
		System.out.println("영희 : " + x);
		System.out.println(result);
		
		return x;
	}
	
}

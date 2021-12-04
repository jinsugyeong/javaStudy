package book.ch3;
import java.util.Scanner;

public class Ch03_07 {

	public static void main(String[] args) {
		//s=가위, r=바위, p=보
		String user1 = input("철수");
		String user2 = input("영희");
		whosWin(user1, user2);
	}


	public static String input(String n) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("%s : ", n);
		String pick = in.next();
		return pick;
	}

	public static void whosWin(String x, String y) {
		
		if((x.equals("s") && y.equals("s")) || (x.equals("r") && y.equals("r")) || (x.equals("p") && y.equals("p"))) {
			System.out.println("무승부");
		}else if((x.equals("s") && y.equals("p")) || (x.equals("r") && y.equals("s")) || (x.equals("p") && y.equals("r"))) {
			System.out.println("철수, 승!");
		}else if(x.equals("p")) {
			System.out.println("영희, 승!");
		}
		
		
		
	}

}

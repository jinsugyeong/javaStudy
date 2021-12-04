package book.ch3;
import java.util.Scanner;

public class Ch03_EXAM {

	public static void main(String[] args) {
		

		//int result=1;
		int n;
		int result;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("���丮�� ���� ���� ���� : ");
		n = in.nextInt();
		
		result = factorial(n);
		System.out.println(result);

	}
	
	static int factorial(int x) {
		int r = 1;
		while (x>0) {
			r *= x;
			x--;			
		}
		return r;
	}
	
	

}

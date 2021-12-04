package book.ch3;
import java.util.Scanner;

public class Ch03_10 {

	public static void main(String[] args) {
		// 다음은 주어진 정수가 소수인지를 조사하는 프로그램의 일부이다. isPrime()메서드를 완성하시오.
		//여기서 소수는 1보다 크면서 1과 자신 외에는 나누지 않는 수이다.
		
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if (isPrime(num)) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}else {
		for(int i=2; i<num; i++) {
			if(num%i == 0)
				return false;
		}
		return true; }
	}

}
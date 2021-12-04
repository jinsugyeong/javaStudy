package book.ch3;

public class Ch03_08 {

	public static void main(String[] args) {
		//행마다 출력하는 별표 개수를 다르게 하는 부분을 printStar()메서드로 작성하시오
		for(int i=1; i<=5; i++) {
			printStar(i);
			System.out.println();
		}

	}
	public static void printStar(int i) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
	}

}

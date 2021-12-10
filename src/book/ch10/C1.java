package book.ch10;

class MyDate {
	int year = 2035;
	int month = 12;
	int day = 25;
}

public class C1 {

	public static void main(String[] args) {
		try {
			MyDate d = null;
			System.out.printf("%d년 %d월 %d일",d.year, d.month, d.day);
		}catch(NullPointerException e) {
			MyDate d = new MyDate();
			System.out.printf("%d년 %d월 %d일",d.year, d.month, d.day);
		}
		
		
		

	}

}

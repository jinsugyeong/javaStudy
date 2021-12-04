package book.ch3;

public class Odd {

	public static void main(String[] args) {
		
		oddPrint(2);
	}
	
	static void oddPrint(int x) {
		if (x%2 == 0)
			return;
		else
			System.out.println("���");
		
	}

}

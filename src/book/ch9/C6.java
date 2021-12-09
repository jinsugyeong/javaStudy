package book.ch9;


public class C6 {

	public static void main(String[] args) {
		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
		
		

	}

	public static void show(Object o) {
		System.out.println(o);
		
	}

}

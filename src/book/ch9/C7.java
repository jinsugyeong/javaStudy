package book.ch9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C7 {

	public static void main(String[] args) {
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
		SimpleDateFormat f2 = new SimpleDateFormat("오늘은 M월의 d번째 날");
		SimpleDateFormat f3 = new SimpleDateFormat("오늘은 yyyy년의 D번째 날");
		
		
		System.out.println(f1.format(new Date()));
		System.out.println(f2.format(new Date()));
		System.out.println(f3.format(new Date()));
	}

}

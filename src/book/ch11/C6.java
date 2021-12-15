package book.ch11;

import java.util.Scanner;
import java.util.stream.Stream;

public class C6 {

	public static void main(String[] args) {
		Stream<String> kb = Stream.generate(()->
		new Scanner(System.in).next());
		//코드추가
		long count = kb.limit(6)
				.filter(x->x.length() ==2)
				.count();
		System.out.println(count);
		
	}

}

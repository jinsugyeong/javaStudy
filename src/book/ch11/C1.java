package book.ch11;

import java.util.ArrayList;

public class C1 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("갈매기");
		arr.add("나비");
		arr.add("다람쥐");
		arr.add("라마");
		
		for(String s : arr) {
			if( s.length() == 2) {
				System.out.println(s);
			}
		}

	}

}

package book.ch10;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class C3 {

	public static void main(String[] args) {
		String s = "of the peope, by the peope, for the people";
		String token;
		
		StringTokenizer st = new StringTokenizer(s, " ,");
		
		
		try {
			while (true) {
				token = st.nextToken();
				System.out.println(token);
			}
		}catch(NoSuchElementException e) {
			while (st.hasMoreTokens()) {
				token = st.nextToken();
				System.out.println(token);
			}
		}
		

	}

}

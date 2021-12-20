package book.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		
		System.out.println(str);

	}

}

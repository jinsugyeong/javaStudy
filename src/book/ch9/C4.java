package book.ch9;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C4 {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Empty vessels make the most sound.");
		int count = str.countTokens();
		System.out.println("입력: Empty vessels make the most sound.");
		System.out.println("단어 개수: " + count);
		System.out.print("정렬된 토큰: ");
		
		String[] sort = new String[count];
		for(int i=0; i<str.countTokens(); i++) {
			sort[i] = str.nextToken();
		}
		
		Arrays.sort(sort);
		
		for(String s: sort) {
			System.out.println(s+", ");
		}
	}

}
/*정렬한 토큰을 저장하는 배열의 크기를 토큰의 개수만큼생성해야 한다.
입력: Empty vessels make the most sound.
단어 개수 : 6
정렬된 토큰: Empty, make, most, sound., the, vessels */